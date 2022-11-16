package Homework;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {

        //Write a code where user is being asked to enter a name:
        //if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a name:");
        String name = scan.next();
        System.out.println("The name is: "+name);

        if (name.startsWith("A")&& name.endsWith("l")){
            String alteredn = name.replace('A','B');
            System.out.println("The altered name is: "+alteredn);
        }
    }
}
