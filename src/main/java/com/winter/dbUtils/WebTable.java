package com.winter.dbUtils;


import lombok.*;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class WebTable {

    String first_name;
    String last_name;
    int age;
    String email;
    int salary;
    String department;

    public static List<WebTable> getAll() throws SQLException {
        String query = "SELECT * FROM webtable_demoqa";
        try (ResultSet resultSet = DBConnection.query(query)) {
            return new BeanProcessor().toBeanList(resultSet, WebTable.class);
        }
    }

    public static WebTable getBy(String column, String value) throws SQLException {
        String query = "SELECT * FROM webtable_demoqa WHERE " + column + " = ?;";
        ResultSet rs = DBConnection.query(query, value);
        if (!rs.next()) return null;
        return new BeanProcessor().toBean(rs, WebTable.class);
    }

    public WebTable(ResultSet rs) throws SQLException {
        new BeanProcessor().populateBean(rs, this);
    }
}
