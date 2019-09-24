package com.company.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SQlConnectionSetup {
    Connection connection;
    PreparedStatement preparedStatement;
    void establishConnection() throws ClassNotFoundException {
        final String url = "jdbc:mysql://localhost:3306/employee_database?autoReconnect=true&useSSL=false";
        try {
            connection = DriverManager.getConnection(url, "root", "webonise");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
