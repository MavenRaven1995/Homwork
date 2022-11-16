package Homework;

public class Homework8 {
    public static void main(String[] args) {
//        write a code where it check the credit score for a person.
//The code should have First Name, Last name and Credit Score of a person. (think about what datatype of variables you need to use)
//If a person have a credit score less then 500 == > print "<person First Name>  <Person Last Name> has Bad Credit Score"
//if a person have credit between 500-700 ==> print "<person First Name>  <Person Last Name> has Average Credit Score"
//if a person have credit between 700-750 ==> print "<person First Name>  <Person Last Name> has Good Credit Score"
//if a person have credit between greater than 750==> print "<person First Name>  <Person Last Name> has Great Credit Score"

        String firstName= "John ", lastName="Wick";
        int CScore=700;
        if (CScore<500) {
            System.out.println(firstName+lastName+" has Bad Credit Score");
        } else if (CScore>=500 && CScore<700) {
            System.out.println(firstName+lastName+" has Avarage Credit Score");
        } else if (CScore>=700 && CScore<750) {
            System.out.println(firstName+lastName+" has Good Credit Score");
        } else {
            System.out.println(firstName+lastName+" has Great Credit Score");
        }

    }
}
