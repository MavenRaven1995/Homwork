package Homework;

import java.util.Scanner;

public class habibiproject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word or sentence ");
        String ex = scan.nextLine();

        for (int i = ex.length(); i > 0 ; i--) {
            System.out.print(ex.charAt(i-1));


        }


    }
}
