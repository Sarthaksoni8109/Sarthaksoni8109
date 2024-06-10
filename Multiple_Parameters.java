package Methods;

public class Multiple_Parameters{
    static void myMethod(String fname, int age){
        System.out.println(fname + " is age " + age);
    }

    public static void main(String[] args) {
        myMethod("Geeta", 10);
        myMethod("Reeta", 14);
        myMethod("Sangeeta",18);
        myMethod("Sapna", 20);
    }

}
