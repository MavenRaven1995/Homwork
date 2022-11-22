package Homework;

import java.util.Arrays;

public class Homework34 {
    public static void main(String[] args) {

        //Write code where it shifts all the elements in array by one index and
        // put  the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

        int[] elements = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The original array is: "+Arrays.toString(elements));
        int x = elements[0];
        for (int i = 0; i <elements.length-1 ; i++) {
             elements[i] = elements[i+1];
        }
        elements[elements.length-1] = x;
        System.out.println("The shifted array is: "+Arrays.toString(elements));





    }
}
