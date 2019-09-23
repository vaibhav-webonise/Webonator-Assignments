package com.company;

import java.sql.*;

public class Student {
    Connection connection;
    ResultSet resultSet;
    Statement statement;


    void establishConnection(){
        String url = "jdbc:mysql://localhost:3306/employee_database?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "webonise";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    void getAllData() throws SQLException {
        statement=connection.createStatement();
        resultSet = statement.executeQuery("select * from employee_database.employee_info");
        while (resultSet.next()) {
            System.out.print("\n ID: " + resultSet.getString("id") + "  Name: " + resultSet.getString("name"));
        }
    }
    void insertData(int id,String name ) throws SQLException {
      PreparedStatement preparedStatement=connection.prepareStatement("insert into employee_info values(?,?)");
      preparedStatement.setString(2,name);
      preparedStatement.setInt(1,id);
      int noOfExecutedStatement=preparedStatement.executeUpdate();
      System.out.print("\n "+noOfExecutedStatement+" rows affected");
    }

    void updateData(int id,String name) throws SQLException{
        PreparedStatement preparedStatement=connection.prepareStatement("update employee_info set name=? where id=?");
        preparedStatement.setString(2,name);
        preparedStatement.setInt(1,id);
        int noOfExecutedStatement=preparedStatement.executeUpdate();
        System.out.print("\n "+noOfExecutedStatement+" rows affected");
        this.getAllData();
    }

    void deleteRows(int id) throws SQLException{
        PreparedStatement preparedStatement=connection.prepareStatement("delete from employee_info where id=?");
        preparedStatement.setInt(1,id);
        int noOfExecutedStatement=preparedStatement.executeUpdate();
        System.out.print("\n "+noOfExecutedStatement+" rows affected");
        this.getAllData();
    }

    void deleteAllRows() throws SQLException{
        PreparedStatement preparedStatement=connection.prepareStatement("delete from employee_info");
        int noOfExecutedStatement=preparedStatement.executeUpdate();
        System.out.print("\n "+noOfExecutedStatement+" rows affected");
    }
}
