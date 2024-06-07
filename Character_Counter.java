package Com.Alpha;

//Input a to z ----> Upper_case.
//Input A to Z ----> Lower_case.

public class Character_Counter {
        public static void main(String[] args) {
            String input = "Hello World! This is a Test String.";

            int lowercaseCount = 0;
            int uppercaseCount = 0;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isLowerCase(ch)) {
                    lowercaseCount++;
                } else if (Character.isUpperCase(ch)) {
                    uppercaseCount++;
                }
            }

            System.out.println("Lowercase letters: " + lowercaseCount);
            System.out.println("Uppercase letters: " + uppercaseCount);
        }
    }


