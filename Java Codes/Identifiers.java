package example;

public class Identifiers{
    public static void main(String[] args) {

        /*Identifiers
    All Java variables must be identified with unique names.

    These unique names are called identifiers.

    Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).*/
        // Good
        int minutesPerHour = 60;

    // OK, but not so easy to understand what m actually is
        int m = 60;
        System.out.println(minutesPerHour);
        System.out.println(m);


    /*The general rules for naming variables are:

    Names can contain letters, digits, underscores, and dollar signs
    Names must begin with a letter
    Names should start with a lowercase letter, and cannot contain whitespace
    Names can also begin with $ and _ (but we will not use it in this tutorial)
    Names are case-sensitive ("myVar" and "myvar" are different variables)
    Reserved words (like Java keywords, such as int or boolean) cannot be used as names. */


    }
}
