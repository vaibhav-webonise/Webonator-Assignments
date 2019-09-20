package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
    Scanner scanInputFromUser = new Scanner(System.in);
    HashMap<String, Integer> hashMap = new HashMap<>();
    int noOfSubjects;

    public void traverseHashMap() {
        System.out.println("\n Exam results...");
        System.out.print("\n Enter the number of subjects you have::");
        noOfSubjects = scanInputFromUser.nextInt();
        getSubjectsAndMarks();
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.print("    " + pair.getKey() + " : " + pair.getValue());
        }
    }

    void getSubjectsAndMarks() {
        System.out.println(" Enter the subject name and marks::");
        for (int i = 0; i < noOfSubjects; i++) {
            System.out.print("    ");
            String subjectName = scanInputFromUser.next();
            int subjectMarks = scanInputFromUser.nextInt();
            hashMap.put(subjectName, subjectMarks);
        }
    }
}
