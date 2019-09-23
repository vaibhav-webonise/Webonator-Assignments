package com.company.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SQlConnectionSetup {
    Connection connection;
    PreparedStatement preparedStatement;
    void establishConnection() {
        final String url = "jdbc:mysql://localhost:3306/employee_database?autoReconnect=true&useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, "root", "webonise");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
