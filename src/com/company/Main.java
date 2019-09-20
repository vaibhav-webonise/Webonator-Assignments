package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanInputFromUser = new Scanner(System.in);
        String choiceContinue;
        do {
            System.out.print("\n 1.Traverse ArrayList  2.Traverse HashMap  3.Remove duplicates in string");
            System.out.print("\n Enter your choice::");
            int userInputChoice = scanInputFromUser.nextInt();
            switch (userInputChoice) {
                case 1:
                    ArrayListDemo arrayListDemo = new ArrayListDemo();
                    arrayListDemo.traverseArrayList();
                    break;
                case 2:
                    HashMapDemo hashMapDemo = new HashMapDemo();
                    hashMapDemo.traverseHashMap();
                    break;
                case 3:
                    StringDemo stringDemo=new StringDemo();
                    stringDemo.removeDuplicatesInString();
                    break;
                default:
                    System.out.print("\n invalid choice...");
                    break;
            }
            System.out.print("\n\n Do you want to continue with the application::");
            choiceContinue = scanInputFromUser.next();
        } while (choiceContinue.equals("yes"));
    }
}
