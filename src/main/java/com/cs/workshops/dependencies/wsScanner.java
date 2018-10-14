package com.cs.workshops.dependencies;


import java.util.Scanner;

public class wsScanner {
    public Scanner scn = new Scanner(System.in);

    public String inputStr(String message) {
        System.out.print(message + ' ');
        return scn.nextLine();
    }

    public Integer inputInt(String message) {
        System.out.print(message + ' ');
        return scn.nextInt();
    }

    public Float inputFloat(String message) {
        System.out.print(message + ' ');
        return scn.nextFloat();
    }

    public char inputChar(String message){
        String input;
        while(true) {
            input = inputStr(message);
            if(input.length() > 0) return input.toLowerCase().charAt(0);
            else System.out.println("Invalid entry, please try again...");
        }
    }

}
