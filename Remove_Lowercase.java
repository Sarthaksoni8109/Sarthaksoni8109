package Com.Alpha;

//Input a to z ----> Upper_case.
//Input A to Z ----> Lower_case.

public class Remove_Lowercase {

        public static void main(String[] args) {
            String input = "Hello World! This is a Test String.";
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (!Character.isLowerCase(ch)) {
                    result.append(ch);
                }
            }

            System.out.println("Original String: " + input);
            System.out.println("String without lowercase letters: " + result.toString());
        }
    }


