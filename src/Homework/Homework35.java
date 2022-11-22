package Homework;
//Write a method where it takes 2 strings as a parameter
// and returns true when 2 strings are equal and returns false when they are not equal.
// public static returnType methodName (dataType name){
//       code goes here
// }

public class Homework35 {
    public boolean m1 (String s1,String s2){

        boolean result = false;
        if (s1.equals(s2)){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {

        Homework35 h = new Homework35();
        boolean result = h.m1("jesus gomez","jesus christ");

        System.out.println(result);

    }
}