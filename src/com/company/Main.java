package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanInputFromUser=new Scanner(System.in);
        String continueInput="";
	do{
	    System.out.print("\n 1.Find a word in file   2.Copy contents from file to another file   your choice::");
	    int choiceInput=scanInputFromUser.nextInt();
	    switch (choiceInput){
            case 1:StringFinderInFile stringFinderInFile=new StringFinderInFile();
            stringFinderInFile.findString();
            break;
            case 2:FileContentsCopier fileContentsCopier=new FileContentsCopier();
            fileContentsCopier.copyContents();
            break;
            default:System.out.print("\n Invalid choice...");
        }
	    System.out.print("\n\n want to continue with application::");
	    continueInput=scanInputFromUser.next();
    }while(continueInput.equals("yes"));
    }
}
