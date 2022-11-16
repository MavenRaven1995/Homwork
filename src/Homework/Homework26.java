package Homework;

import java.util.Scanner;

public class Homework26 {
    public static void main(String[] args) {

        //Write a code where it asks the user to enter an whole number
        //- Reverse the given number and print the result
        //- Example input ( 5678 )
        //- Example output ( 8765 )

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number"); //1234
        String enteredNumber = scanner.nextLine();
        String rNum = "";
        for (int i = 0; i <enteredNumber.length() ; i++) {
            rNum = enteredNumber.charAt(i)+rNum;

        }
        System.out.println(rNum);




        /* for (int i = enteredNumber.length(); i > 0 ; ) {
            System.out.print(enteredNumber.charAt(i-1));

         */

        }

    }

