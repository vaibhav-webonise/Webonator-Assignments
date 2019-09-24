package com.company;

import java.util.LinkedHashSet;
import java.util.Arrays;

class StringDemo {
    void removeDuplicatesInString() {
        String inputString = "I came I Saw I conquered I went";
        LinkedHashSet<String> distinctStrings = new LinkedHashSet<>(Arrays.asList(inputString.split(" ")));
        for (String outputString : distinctStrings) {
            System.out.print(" " + outputString);
        }
    }
}
