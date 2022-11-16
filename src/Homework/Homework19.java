package Homework;

import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number and
        // check for every number between 0 to that number. To see how many numbers between 0, to that
        // number can be divided to 3 and 5 and sum all those numbers, Print the result

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = Scan.nextInt();
        int sum = 0;
        for (int i = 1; i <=n1 ; i++) {
            if(i%3==0 && i%5==0){sum++;
               }
        }System.out.println(sum);


//"The total numbers that can be divided by 3 and 5 with no remainders is starting from number " +
//                    +n1+ " is "+
        //"The number "+i+" can be divided by 3 and 5 with no remainders")
    }

}
