package Homework;

import java.util.Scanner;

public class Homework25 {
    public static void main(String[] args) {

        //Write a code where the user is asked to enter an integer number
        //- sum of all the odd numbers between 1 to given number (included)
        // but exclude the 9,11,23,35 from the total sum if those numbers
        // happen to be in the range of 1 to the given number.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number here: ");
        int entered_number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < entered_number; i++) {
            if ((i%2) == 1){


            }
            if (sum == 9 ||sum == 11 ||sum ==13 ||sum ==23 || sum ==35){
                continue;
            }
            sum += i;
        }
        System.out.println("sum of odd number "+sum);
    }
}
