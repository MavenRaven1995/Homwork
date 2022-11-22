package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework33 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter for 5 employee salaries and store those salaries
        //Then find the average salary of those 5 employees

        Scanner scan = new Scanner(System.in);
        System.out.println("How many employees would you like to enter?");
        int num = scan.nextInt();
        ArrayList<Integer> salaries = new ArrayList<>(num);
        for (int i = 0; i < num ; i++) {
            System.out.println("Enter the "+(i+1)+". employee's salary:");
            int salary = scan.nextInt();
            salaries.add(salary);
        }
        int sum = 0;
        for (int i = 0; i < salaries.size(); i++) {
            sum = sum + salaries.get(i);
        }
        int result = sum/num;
        System.out.println("The average salary is: "+result);

    }
}
