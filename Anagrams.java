package Com.Alpha;
import java.util.Arrays;

//Input a to z ----> Upper_case.
//Input A to Z ----> Lower_case.

public class Anagrams {
    public static boolean Anagrams(String str1, String str2) {
        // Remove any white spaces and convert strings to lower case
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they cannot be anagrams.

        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays.

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the char arrays.

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays.

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (Anagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        // Test with another pair of strings.

        String str3 = "Hello";
        String str4 = "Mohit";

        if (Anagrams(str3, str4)) {
            System.out.println(str3 + " and " + str4 + " are anagrams.");
        } else {
            System.out.println(str3 + " and " + str4 + " are not anagrams.");
        }
    }
}
