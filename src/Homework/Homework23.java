package Homework;

import java.util.Scanner;

public class Homework23 {
    public static void main(String[] args) {

        //Write a program where the user is being asked to enter a String and
        // that   will   count   how   many   times   "a" or 'A'   is   found   in that entered String

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or sentence: ");

        String resp = scan.nextLine();
        int smalla = 0;
        int bigA = 0;

        for (int i = 0; i < resp.length(); i++) {
            if (resp.charAt(i) == 'a'){
                smalla=smalla+1;

            } else if (resp.charAt(i)=='A') {
                bigA=bigA+1;

            }
            System.out.println(smalla+bigA);

        }

        }

    }
