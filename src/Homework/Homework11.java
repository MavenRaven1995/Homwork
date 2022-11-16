package Homework;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        /* Write a Revenue program where user enters the quantity of the products sold,
        and the price for each product. Then calculate the revenue based on the giving information (hint: Revenue = quantity x price)
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the quantity");
        short qty=scan.nextShort();
        System.out.println("Please enter the price");
        double  price=scan.nextDouble();
        double  revenue=qty*price;
        System.out.println("The revenue of your company is: "+revenue);
    }
}

