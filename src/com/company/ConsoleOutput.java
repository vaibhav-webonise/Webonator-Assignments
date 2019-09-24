package com.company.JDBC;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

public class ConsoleOutput {
    private static Scanner scanInputFromUser = new Scanner(System.in);
    private static Logger log = Logger.getLogger(ConsoleOutput.class.getName());

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CRUDOperations CRUDOperations = new CRUDOperations();
        CRUDOperations.establishConnection();
        do {
            System.out.print("\n 1.See table data  2.Add data  3.Update data  4.Delete data   5.Delete all rows choice::");
            switch (scanInputFromUser.nextInt()) {
                case 1:
                    int dataRows = CRUDOperations.getAllData();
                    if (dataRows == 0) {
                        log.info(" Empty set...");
                    }
                    break;
                case 2:
                    System.out.print(" Enter employee ID, NAME and ADDRESS::");
                    log.info(CRUDOperations.insertData(scanInputFromUser.next(), scanInputFromUser.next(), scanInputFromUser.next()) + " rows affected\n");
                    break;
                case 3:
                    log.info(CRUDOperations.updateData() + " rows affected");
                    break;
                case 4:
                    System.out.print(" Enter name to delete row::");
                    log.info(CRUDOperations.deleteRows(scanInputFromUser.next()) + " rows affected");
                    break;
                case 5:
                    log.info(CRUDOperations.deleteAllRows()+" rows affected");
                    break;
                default:
                    log.info(" Invalid...");
                    break;
            }
            System.out.print("\n\n Want to continue with application::");
        } while (scanInputFromUser.next().equals("yes"));
    }
}
