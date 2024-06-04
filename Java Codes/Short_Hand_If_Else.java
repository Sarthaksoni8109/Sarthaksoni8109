package example;

public class Short_Hand_If_Else{
    public static void main(String[] args) {

        /*Short Hand if...else;

         There is also a short-hand if else, which is known as the (Ternary operator).
            because it consists of three operands.

           It can be used to replace multiple lines of code with a single line,
              and is most often used to replace simple if else statements:*/

        /*Syntax;
               variable = (condition) ? expressionTrue :  expressionFalse; */

        int tim = 20;
        if (tim < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

                  //You can simply write:

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        /**********************************/

        /*Real-Life Examples;
    This example shows how you can use if..else to "open a door" if the user enters the correct code: */

        int doorCode = 1455;

        if (doorCode == 1455) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }
    }
}
