package array;

public class Single_Dimensional_Array {
    public static void main(String[] args) {
        int a[] = new int[5];//declaration and instantiation
        a[0] = 20;//initialization
        a[1] = 30;
        a[2] = 50;
        a[3] = 60;
        a[4] = 70;
    //traversing array
        for (int i = 0; i < a.length; i++)//length is the property of array
            System.out.println(a[i]);
    }
}

