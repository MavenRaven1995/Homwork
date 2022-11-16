package Homework;

import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {

        //Write a code where it meets the below requirements
        //- a couple just got married and goes to city hall to get their last name changed
        //- the officer who works there asks the couple about their first name and last name for each
        //- also asks if they want to use the same last name or keep their original last names
        // ( for the same last name you can use either one of them)
        //- based on the answer print the couples first names and last names

        Scanner scan = new Scanner(System.in);
        System.out.println("Wife first name:");
        String firstName = scan.nextLine();
        System.out.println("Wifes last name:");
        String lastname = scan.nextLine();
        System.out.println("Husbands first name:");
        String firstname1 = scan.nextLine();
        System.out.println("Husbands last name:");
        String lastname1 = scan.nextLine();

        System.out.println("would you like -keep- your last name or -change- it?: ");
        String answer1 = scan.nextLine();

        if (answer1.equals("keep") || answer1.equals("Keep")) {
            System.out.println("congrats on your marriage");
            System.out.println("your names reamin the same");
        }
        else if (answer1.equals("change")) {
            System.out.println("Your new name is : "+firstName+" "+lastname1);
            System.out.println("your husbands name ramains the same: "+firstname1+" "+lastname1);
        }


    }
}


