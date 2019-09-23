package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class HashMapDemo {
    private Scanner scanInputFromUser = new Scanner(System.in);
    private HashMap<String, Integer> hashMap = new HashMap<>();

    void traverseHashMap() {
        this.getSubjectsAndMarks();
        for (Map.Entry<String, Integer> subjectMarksMap : hashMap.entrySet()) {
            System.out.print("    " + subjectMarksMap.getKey() + " : " + subjectMarksMap.getValue());
        }
    }

    private void getSubjectsAndMarks() {
        System.out.println("\n Exam results...");
        System.out.print("\n Enter the number of subjects you have::");
        int noOfSubjects = scanInputFromUser.nextInt();
        System.out.println(" Enter the subject name and marks::");
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("    ");
            hashMap.put(scanInputFromUser.next(), scanInputFromUser.nextInt());
        }
    }
}
