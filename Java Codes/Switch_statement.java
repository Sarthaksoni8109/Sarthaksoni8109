package example;

public class Switch_statement{
    public static void main(String[] args) {

        /*Java Switch Statements;

        The switch statement selects one of many code blocks to be executed:

        This is how it works:

            The switch expression is evaluated once.
            The value of the expression is compared with the values of each case.
             If there is a match, the associated block of code is executed.
             The break and default keywords are optional. */

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        /*The default Keyword;

           The default keyword specifies some code to run if there is no case match:*/

        int Day = 5;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

    }
}
