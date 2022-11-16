package Homework;

import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
        // Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0 ;

        for (int i = 1; i <=num ; i++) {
            if (i % 2 == 0){sumEven++;} //
            else{sumOdd++;}             //
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);

    }
}
