package Homework;

import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        //Write a Code where user is being asked to enter a sentence
        //if Sentence starts with "B" or "b" and ends with "E" or "e" also contains "A" or "a"
        //replace second and fourth characters with "G"

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence real quick: ");
        String sentence = scan.nextLine();

        if (sentence.startsWith("B") || sentence.startsWith("b")&&
                sentence.endsWith("E")||sentence.endsWith("e") && sentence.contains("A")||
                sentence.contains("a")){
            System.out.println(sentence.substring(0,1)+'G'+sentence.substring(3,4)+'G'+
                    sentence.substring(5));
        }
    }
}
