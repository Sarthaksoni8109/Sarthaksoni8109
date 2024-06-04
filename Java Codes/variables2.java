package example;

public class variables2{
    public static void main(String[] args) {
        //The println() method is often used to display variables.

        //To combine both text and a variable, use the + character:
        String name = "Gungun";
        System.out.println("Hello " + name);

        //You can also use the + character to add a variable to another variable:
        String firstName = "Sarthak";
        String lastName = "Soni";
        String fullName = (firstName + lastName);
        System.out.println( fullName);

        /*For numeric values, the + character works as a mathematical operator
         (notice that we use int (integer) variables here):*/
        int x = 11;
        int y = 27;
        System.out.println(x + y); // Print the value of x + y

    }
}
