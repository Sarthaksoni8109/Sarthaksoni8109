package example;

public class Java_variables3{
    public static void main(String[] args) {

    /*Often in our examples, we simplify variable names to match their data type
    (myInt or myNum for int types, myChar for char types, and so on). This is done to avoid confusion.

    However, if you want a real-life example of how variables can be used, take a look at the following,
     where we have made a program that stores different data of a college student:*/

        // Student data
        String studentName = "Mohan Das";
        int studentID = 63;
        int studentAge = 20;
        float studentFee = 40.25f;
        char studentGrade = 'A';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        //Calculate the Area of a Rectangle;
        /*In this real-life example, we create a program to calculate the area of a rectangle
        (by multiplying the length and width):*/

        // Create integer variables
        int length = 6;
        int width = 7;
        int area;

    // Calculate the area of a rectangle
        area = length * width;

    // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);

    }
}
