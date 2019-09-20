package com.company;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDemo {
    void removeDuplicatesInString(){
        String inputString="I came I Saw I conquered I went";
        StringBuilder outputString = new StringBuilder();
        Set<Character> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            linkedHashSet.add(inputString.charAt(i));
        }
        for (Character c : linkedHashSet) {
            outputString.append(c);
        }
        System.out.println("String after removing duplicates::"+outputString);
    }
}
