package com.cs.workshops.ws1;

import com.cs.workshops.dependencies.*;

public class ws1 {

    public static void main(String[] args){
        String optionString;
        wsScanner scanner = new wsScanner();

        while(true) {
            optionString = scanner.inputStr("Please enter an input:");
            if (optionString.equals("-999")) break;
            else {
                System.out.println("invalid input...");
            }
        }

        System.out.print("do stuff...");
    }
}
