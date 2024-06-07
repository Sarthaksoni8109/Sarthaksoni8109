package Com.Alpha;

public class ReverseString{

    /*Using StringBuilder ;

    The StringBuilder class has a built-in reverse() method. */

        public static void main(String[] args) {
            String original = "Hello, World!";
            StringBuilder sb = new StringBuilder(original);
            String reversed = sb.reverse().toString(); //main use.

            System.out.println("Reversed string: " + reversed);
        }
    }




