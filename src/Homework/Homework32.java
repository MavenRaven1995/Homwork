package Homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework32 {
    public static void main(String[] args) {

        //Write a program to with following requirements
        //1) user should be prompted about how many numbers is going to be entered
        //2) User should be prompted for the values of the numbers
        //3) Reverse the all the given numbers and print it

        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers will be entered ");

        int size = scan.nextInt();

        int [] numbers = new int[size];
        for (int i = 0; i < size; i++) {

            System.out.println("enter the "+(i+1)+ " number");
            int num = scan.nextInt();
            numbers[i] = num;

        }
        int [] reversedArray = new int[size];
        int j = 0;
        for (int i=numbers.length-1; i>=0; i--){
            reversedArray[i] = numbers[j];
            j++;
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
