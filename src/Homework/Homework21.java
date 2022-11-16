package Homework;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {
        //write a code where user is asked to enter a number:
        //Calculate the square of all the numbers from 0 to given number and print the result for each number,
        // (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int n1 = scanner.nextInt();
        int number = n1,square;
        square = n1 * n1;

        System.out.println("\n The Square of a Given Number  " + number + "  =  " + square);

    }
}
