package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {
    static Scanner scanInputFromUser=new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        Student student=new Student();
        int employeeId;
        String employeeName;
        student.establishConnection();
        do{
            System.out.print("\n 1.See table data  2.Add data  3.Update data  4.Delete data   5.Delete all rows choice::");
            switch (scanInputFromUser.nextInt()){
                case 1:student.getAllData();
                break;
                case 2:System.out.print("Enter id and name::");
                student.insertData(scanInputFromUser.nextInt(),scanInputFromUser.next());
                break;
                case 3:System.out.print("Enter id and name you want to update::");
                student.updateData(scanInputFromUser.nextInt(),scanInputFromUser.next());
                break;
                case 4:System.out.print("Enter id to delete row::");
                student.deleteRows(scanInputFromUser.nextInt());
                case 5: student.deleteAllRows();
                break;
                default: System.out.print("\n Invalid...");
                break;
            }
            System.out.print("\n Want to continue with application::");
        }while(scanInputFromUser.next().equals("yes"));
    }
}
