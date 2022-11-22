package Homework;

import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {

        //Write   a   program   that   creates   an   array   of   10   elements   size.
        // Your   program   should   prompt   the   user   to   input   numbers   in   array
        // and   then   display   the   sum   of   all
        //array   elements. ( we already did this in the class but try to do it again)

        Scanner scan = new Scanner(System.in);
        System.out.println("enter however many numbers you want to add up ");
        int size = scan.nextInt();

        double [] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the "+(i+1)+". number: ");
            double num = scan.nextDouble();
            numbers[i] = num;
        }
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

        }
        System.out.println("the sum of the numbers entered is: "+sum);

    }
}
