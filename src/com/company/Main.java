package com.company.JDBC;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static Scanner scanInputFromUser = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        CRUDOperations CRUDOperations = new CRUDOperations();
        CRUDOperations.establishConnection();
        do {
            System.out.print("\n 1.See table data  2.Add data  3.Update data  4.Delete data   5.Delete all rows choice::");
            switch (scanInputFromUser.nextInt()) {
                case 1:
                    CRUDOperations.getAllData();
                    break;
                case 2:
                    System.out.print("Enter employee id,name and address::");
                    CRUDOperations.insertData(scanInputFromUser.next(), scanInputFromUser.next(), scanInputFromUser.next());
                    break;
                case 3:
                    CRUDOperations.updateData();
                    break;
                case 4:
                    System.out.print("Enter name to delete row::");
                    CRUDOperations.deleteRows(scanInputFromUser.next());
                case 5:
                    CRUDOperations.deleteAllRows();
                    break;
                default:
                    System.out.print("\n Invalid...");
                    break;
            }
            System.out.print("\n Want to continue with application::");
        } while (scanInputFromUser.next().equals("yes"));
    }
}
