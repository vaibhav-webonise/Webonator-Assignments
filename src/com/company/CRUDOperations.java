package com.company.JDBC;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDOperations extends SQlConnectionSetup {

    private Scanner scanInputFromUser = new Scanner(System.in);

    void getAllData() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee_database.employee_info");
        while (resultSet.next()) {
            System.out.print("\n " + resultSet.getString("id") + "  " + resultSet.getString("name"));
            System.out.print("  " + resultSet.getString("employee_id") + "  " + resultSet.getString("employee_address"));
        }
    }

    void insertData(String employee_id, String employee_name, String employee_address) throws SQLException {
        preparedStatement = connection.prepareStatement("insert into employee_info(name,employee_id,employee_address) values(?,?,?)");
        preparedStatement.setString(1, employee_name);
        preparedStatement.setString(2, employee_id);
        preparedStatement.setString(3, employee_address);
        System.out.print("\n " + preparedStatement.executeUpdate() + " rows affected");
    }


    void deleteRows(String name) throws SQLException {
        preparedStatement = connection.prepareStatement("delete from employee_info where name=?");
        preparedStatement.setString(1, name);
        System.out.print("\n " + preparedStatement.executeUpdate() + " rows affected");
    }

    void deleteAllRows() throws SQLException {
        preparedStatement = connection.prepareStatement("delete from employee_info");
        System.out.print("\n " + preparedStatement.executeUpdate() + " rows affected");
    }

    void updateData() throws SQLException {
        do {
            String employee_id;
            System.out.print("\n 1.Name   2.Address  choose any::");
            switch (scanInputFromUser.nextInt()) {
                case 1:
                    System.out.print("\n Enter new name::");
                    String employee_name = scanInputFromUser.next();
                    System.out.print("\n Enter your employee id::");
                    employee_id = scanInputFromUser.next();
                    preparedStatement = connection.prepareStatement("update employee_info set name=? where employee_id=?");
                    preparedStatement.setString(1, employee_name);
                    preparedStatement.setString(2, employee_id);
                    System.out.print("\n " + preparedStatement.executeUpdate() + " rows affected");
                    break;
                case 2:
                    System.out.print("\n Enter new address::");
                    String address = scanInputFromUser.next();
                    System.out.print("\n Enter your employee id::");
                    employee_id = scanInputFromUser.next();
                    preparedStatement = connection.prepareStatement("update employee_info set employee_address=? where employee_id=?");
                    preparedStatement.setString(2, employee_id);
                    preparedStatement.setString(1, address);
                    System.out.print("\n " + preparedStatement.executeUpdate() + " rows affected");
                    break;
                default:
                    System.out.print("\n Invalid...");
                    break;
            }

            System.out.print("\n want to continue with update::");
        } while (scanInputFromUser.next().equals("yes"));
    }
}
