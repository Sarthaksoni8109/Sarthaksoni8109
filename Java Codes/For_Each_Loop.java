package example;

public class For_Each_Loop{
    public static void main(String[] args) {

        /*For-Each Loop;

      There is also a "for-each" loop, which is used exclusively to loop through elements in an array: */

           /* Syntax;

        for (type variableName : arrayName) {
               code block to be executed;
        } */

        String[] cars = {"Volvo", "BMW", "Tata", "Maruti"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
