package Homework;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

        //Write a calculator program by following instructions:
        //1) Ask the user to enter 1st number
        //2) Ask the user to enter second number
        //3) Ask the user to select the operation ( ask user to enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.)
        //4) based on the selection perform operation and print the result of the operation
        //(Ex. enter 1st number : 20
        //	enter 2nd number: 25
        //	Select operation  enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division.: 1
        //	The result is : 45.)

        Scanner scan = new Scanner(System.in);

        System.out.println("print out first number");
        int num1 = scan.nextInt();

        System.out.println("print ou the secon number");
        int num2 = scan.nextInt();

        System.out.println("1. summation, 2.subtraction, 3.multiplication, 4.division");

        int opperation = scan.nextInt();

        if (opperation == 1) {
            System.out.println("the summation result is: "+(num1+num2));
        } else if (opperation == 2) {
            System.out.println("the subtraction result is: "+(num1 - num2));
        } else if (opperation == 3) {
            System.out.println("the multiplication result is: "+(num1 * num2));
        } else if (opperation == 4) {
            System.out.println("the division result is: "+(num1 % num2));
        } else {
            System.out.println("invalid opperation: ");
        }
    }
}
