package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileContentsCopier {

    void copyContents() {

        try {
            FileReader fileReader = new FileReader("/home/webonise/IdeaProjects/Assignment-6/src/com/company/textfiles/input");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("/home/webonise/IdeaProjects/Assignment-6/src/com/company/textfiles/output", true);
            String stringLine;

            while ((stringLine = bufferedReader.readLine()) != null) {
                fileWriter.write(stringLine + "\n");
                fileWriter.flush();
            }
            bufferedReader.close();
            fileWriter.close();
            System.out.println("file copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}