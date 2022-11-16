package Homework;

import java.util.Scanner;

public class Homework24 {
    public static void main(String[] args) {
        //Write a code where user is being asked to enter a String and that checks if the String is Palindrome
        //PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward
        // as forward, such as madam or racecar. (Java, or Ziya or Cat are not palindrome)
        //(This is a bit hard question, It is an Interview question. Work on it we can solve it later on together)

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter word or phrase:  ");
        String resp = sc.nextLine();
        // scan it and save "String" as (resp)once

        // Initializing a new string
        String rev = "";

        //for (int i = str.length() - 1; i >= 0; i--) {
        //            rev = rev + str.charAt(i);

        for(int i = 0; i < resp.length() ; i ++){
            rev = resp.charAt(i) + rev;
        }
        if (resp.equals(rev)){
            System.out.println(" palindrome detected in: "+resp);
        } else{
            System.out.println("no palindrome detected in: "+resp);
            }
        }

    }
