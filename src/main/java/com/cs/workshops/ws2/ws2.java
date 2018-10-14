package com.cs.workshops.ws2;

import com.cs.workshops.dependencies.*;
import java.util.*;

public class ws2 {

    private static wsScanner scanner = new wsScanner();

    private static void optionA(){
        System.out.println("Student name: Julien");
        System.out.println("Tutor name: IDK");
        System.out.println("I have no idea what an internal student is or what is my tutorial day and time...");
        return;
    }

    private static void optionB(){
        int largest = 0;
        int current;

        System.out.println("Enter 3 Integers...");
//                    List<Integer> myIntList = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++){
            current = scanner.scn.nextInt();
//                        myIntList.add(scanner.scn.nextInt());
            if(current > largest) largest = current;
        }
        System.out.println("The largest number is: " + largest);
        return;
    }

    private static void optionC(){

    }

    private static void optionD(){

    }

    private static void optionE(){

    }

    public static void main(String[] args){

        char option;

        while(true){
            option = scanner.inputChar("Please enter a character:");
            if(option == 'q') break;
            else {
                switch (option){
                    case 'a':
                        optionA();
                        break;
                    case 'b':
                        optionB();
                        break;
                    case 'c':
                        optionC();
                        break;
                    case 'd':
                        optionD();
                        break;
                    case 'e':
                        optionE();
                        break;
                    default:
                        System.out.println("Invalid input, please try again...");
                        break;
                }
            }
        }
        System.out.println("End of program...");
    }

}

/*
loop
    ask the user to input one of the characters a, b, c, d, e, q
    read in a character from the keyboard

    if the character is
        ‘a’
            output your name, your tutor’s name and,
            in case of an internal student,
                your tutorial attendance day and time;
        ‘b’
            input 3 real (floating point) numbers x, y, z and
            output the largest of the three numbers and their average;
        ‘c’
            input 2 integer numbers m and n, and
            display all the numbers between m and n (both inclusive) with five numbers per line
                (note that the last line may have less than 5 numbers).
            At the end, display the sum of all the odd numbers between m and n (both inclusive);
        ‘d’
            input 3 real numbers representing the sides of a triangle and
                display the numbers together with a message indicating
                whether or not the numbers form a triangle
                    (Note: for the numbers to form a triangle, the sum of any two sides must
                    be greater than the third side);
        ‘e’
            input an integer number n and determine whether or not n is a prime number
                (Note: a number is a prime number if it is greater than 1 and has no divisors other than 1 and itself);
        ‘q’ exit from the loop

        other: output an error message
    endif
endloop
 */