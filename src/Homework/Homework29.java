package Homework;

public class Homework29 {
    public static void main(String[] args) {
        // write a code with following requirements
        //- define an array with following values {90,34,23,87,45,36,98}
        //- Print the values that can be divided by 2 or 3

        int [] aArray = {90,34,23,87,45,36,98};

        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i]%2==0 || aArray[i]%3==0){
                System.out.println(aArray[i]+" - is divisible by 2 or 3");
            }
        }
    }

}
