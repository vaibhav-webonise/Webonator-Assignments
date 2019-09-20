package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListDemo {
    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanInputFromUser = new Scanner(System.in);
    int defaultHobbiesCount = 4;

    void traverseArrayList() {
        System.out.print("\n Let us know your four hobbies::");
        for (int i = 0; i < defaultHobbiesCount; i++) {
            String hobbies = scanInputFromUser.next();
            arrayList.add(hobbies);
        }
        for (String showHobbies : arrayList
        ) {
            System.out.print("   " + showHobbies);
        }
    }
}
