package Homework;

public class Homework28 {
    // Write a code with following requirements:
    //- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
    //- Print the minimum number in the given array

    public static void main(String[] args) {

        int[] aArray = {6,7,2,3,90,-2,-90,-122,96,35};

        int smallest = aArray[0];

        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i]<smallest){
                smallest=aArray[i];
            }
        }
        System.out.println(smallest);
    }
}
