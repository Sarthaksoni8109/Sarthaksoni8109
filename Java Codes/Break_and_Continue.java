package example;

public class Break_and_Continue {
    public static void main(String[] args) {

        /*Java Break;
          You have already seen the break statement used in an earlier chapter of this tutorial.
            It was used to "jump out" of a switch statement.

            The break statement can also be used to jump out of a loop. */

        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                break;
            }
            System.out.println(i);
        }

                  /*Java Continue;

    The continue statement breaks one iteration (in the loop), if a specified condition occurs,
     and continues with the next iteration in the loop. */

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

             /*Break in While Loop;
         You can also use break and continue in while loops: */

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
               //Continue in While Loop;

        int s = 0;
        while (s < 8) {
            if (s == 4) {
                s++;
                continue;
            }
            System.out.println(s);
            s++;
        }


    }
}
