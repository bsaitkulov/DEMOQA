package testDB;

import com.codeborne.selenide.SelenideElement;
import com.winter.dbUtils.DBConnection;
import com.winter.dbUtils.UserBean;
import com.winter.dbUtils.WebTable;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WebTableTest extends BaseUiTest {

    @Test(priority = 1)
    public void addNewUserTest() throws SQLException {
        navigate.toWebTablesPage();
        webTablesPage.clickAdd()
                .inputFirstName("Francesco")
                .inputLastName("Toldo")
                .inputEmail("toldo@gmail.com")
                .inputAge("35")
                .inputSalary("100000")
                .inputDepartment("Sport Department")
                .clickSubmit();

        String newUser = "";
        for (SelenideElement name : webTablesPage.names) {
            if (name.getText().equals("Francesco")) {
                newUser = name.getText();
            }
        }
        DBConnection.open("webtable");

        int affectedRows = DBConnection.executeUpdate("INSERT INTO webtable_demoqa (first_name, last_name, email, age, salary, department) " +
                "VALUES ('Francesco', 'Toldo', 'toldo@gmail.com', 35, 100000, 'Sport Department')");
        System.out.println("Rows affected: " + affectedRows);

        ResultSet rs = DBConnection.query("SELECT * FROM webtable_demoqa");

        while (rs.next()) {
            WebTable user = new WebTable(rs);
            System.out.println(user);
            Assert.assertEquals(newUser, user.getFirst_name());
        }
    }

    @Test(priority = 2)
    public void deleteUserFromDB() throws SQLException {
        DBConnection.open("webtable");

        int affectedRows = DBConnection.executeUpdate("DELETE FROM webtable_demoqa " +
                "WHERE First_Name = 'Francesco'; ");
        System.out.println("Rows affected: " + affectedRows);

        ResultSet rs = DBConnection.query("SELECT * FROM webtable_demoqa");
        while (rs.next()) {
            WebTable user = new WebTable(rs);
            System.out.println(user);
        }
    }
}

