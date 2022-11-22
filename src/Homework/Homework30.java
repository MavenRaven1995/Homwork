package Homework;

public class Homework30 {
    public static void main(String[] args) {

        //Write  a code   string   array    with   the   following   strings:
        //"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
        //Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared.

        String [] weekdays = {"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday" , "Saturday"};

        for (int i = 0; i < weekdays.length; i++) {

            System.out.println("the day in the array is: "+weekdays[i]);

        }


    }
}
