package example;

public class For_Loop{
    public static void main(String[] args) {

        /*Java For Loop

              1). Syntax;

                   for (statement 1; condition 2; incresment 3) {
                 } */

        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        for (int i = 21; i <= 230; i = i + 21) {
            System.out.println(i);
        }

    //we create a program that prints the multiplication table for a specified number:
        int number = 4;

        // Print the multiplication table for the number 4;
        for (int v = 1; v <= 10; v++) {
            System.out.println(number + " x " + v + " = " + (number * v));

        }

    //we create a program that prints the multiplication table for a specified number:
        int num = 5;

        // Print the multiplication table for the number 5;
        for (int y = 1; y <= 10; y++){
            System.out.println(num + " x " + y + " = " +(num * y));
        }
    }


}

