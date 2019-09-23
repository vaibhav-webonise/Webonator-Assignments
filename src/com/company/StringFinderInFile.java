package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class StringFinderInFile {
    void findString() {
        String[] fileContents = null;
        Scanner scanInputFromUser=new Scanner(System.in);
        try {
            FileReader fileReader = new FileReader("/home/webonise/IdeaProjects/Assignment-6/src/com/company/textfiles/student");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String stringLine;
            System.out.print("\n Enter word to be search:");
            String wordToBeSearch=scanInputFromUser.next();
            int count = 0;
            while ((stringLine = bufferedReader.readLine()) != null) {
                fileContents = stringLine.split(" ");
                for (String word : fileContents) {
                    if (word.equals(wordToBeSearch)) {
                        count++;
                    }
                }
            }
            if (count != 0) {
                System.out.println("The given word is present for " + count + " Times in the file");
            } else {
                System.out.println("The given word is not present in the file");
            }

            fileReader.close();
        } catch (Exception e) {
        }
    }

}