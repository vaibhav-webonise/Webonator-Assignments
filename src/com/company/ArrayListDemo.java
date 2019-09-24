package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayListDemo {
    private List<String> hobbies = new ArrayList<>();
    private Scanner scanInputFromUser = new Scanner(System.in);
    private static final int DEFAULT_HOBBIES_COUNT = 4;

    void traverseArrayList() {
        System.out.print("\n Let us know your four hobbies::");
        for (int i = 0; i < DEFAULT_HOBBIES_COUNT; i++) {
            hobbies.add(scanInputFromUser.next());
        }
        for (String hobby : hobbies) {
            System.out.print("   " + hobby);
        }
    }
}
