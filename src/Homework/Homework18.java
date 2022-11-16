package Homework;

import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {

        //Write a code where user is asked to enter an integer number:
        //Using the given number find the factorial of that number and Print the result.
        //example: 5 ==> 5! = 5*4*3*2*1 = 120
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int num = scan.nextInt();
        int result = 1;
        for (int i = num; i > 0 ; i--) {
            result = i * result;
          // System.out.println(result);
        }
        System.out.println(num+"! is "+result);


    }
}
