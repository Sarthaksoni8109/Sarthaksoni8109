package example;

public class Boolean{
    public static void main(String[] args) {

    /*Boolean Expression
    A Boolean expression returns a boolean value: true or false.*/

        int x = 10;
        int y = 7;
        System.out.println(x > y);// returns true, because 10 is higher than 7.

    //In the examples below, we use the equal to (==) operator to evaluate an expression:

        int n = 18;
        System.out.println(n == 18); // returns true, because the value of n is equal to 10.

        System.out.println(18 == 20); // returns false, because 10 is not equal to 20


    /*In the example below, we use the >= comparison operator to find out if the age (30) is greater than
     OR equal to the voting age limit, which is set to 18:*/
        int myAg = 30;
        int votingAg = 18;
        System.out.println(myAg >= votingAg); // returns true (30 year olds are allowed to vote!).

        //if...else statement;

    /*Output "Old enough to vote!" if myAge is greater than or equal to 18.
     Otherwise output "Not old enough to vote.":*/

        int myAge = 20;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }






    }
 }
