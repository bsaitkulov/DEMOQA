package com.winter.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class WebTablesPage extends BasePage{

    public SelenideElement addButton=$(byId("addNewRecordButton"));
    public SelenideElement searchBoxButton=$(byId("searchBox"));
    public SelenideElement editButton=$(byId("edit-record-2"));
    public SelenideElement deleteButton=$(byId("delete-record-2"));

    public SelenideElement firstName = $(byId("firstName"));
    public SelenideElement lastName = $(byId("lastName"));
    public SelenideElement userEmail = $(byId("userEmail"));
    public SelenideElement departmentField=$(byId("department"));
    public SelenideElement salaryField=$(byId("salary"));
    public SelenideElement ageField=$(byId("age"));
    public SelenideElement submitButtonWebTables=$(byId("submit"));

    public ElementsCollection names = $$x("//div[@class='rt-tbody']/div/div/div[1]");

    public ElementsCollection webTableGroup = $$x("//div[@class='rt-tr-group']");


    public WebTablesPage clickAdd(){
        elementActions.press(addButton);
        return this;
    }
    public WebTablesPage inputFirstName(String str){
        elementActions.input(firstName, str);
        return this;
    }
    public WebTablesPage inputLastName(String str){
        elementActions.input(lastName, str);
        return this;
    }
    public WebTablesPage inputEmail(String str){
        elementActions.input(userEmail, str);
        return this;
    }
    public WebTablesPage inputDepartment(String str){
        elementActions.input(departmentField,str);
        return this;
    }
    public WebTablesPage inputSalary(String str){
        elementActions.input(salaryField, str);
        return this;
    }
    public WebTablesPage inputAge(String ageNum) {
        elementActions.input(ageField, ageNum);
        return this;
    }
    public WebTablesPage clickSubmit(){
        elementActions.press(submitButtonWebTables);
        return this;
    }

}
