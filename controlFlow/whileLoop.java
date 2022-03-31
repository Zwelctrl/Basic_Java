package controlFlow;

public class whileLoop {

    public static void main(String[] args) {

        int a = 3;

        while (a<10) {
            System.out.println(a);
            a++;
        }

        System.out.println("<<<>>>");

        /**
         *  while (condition) {
         *
         * }
         */


        int c = 3;

        do{
            System.out.print(c + "\t");
            c++;
        }while (c < 10);

        /**
         *  do{
         *
         *  }while (condition)
         *
         *  if you want the program to work at least one time even if it is wrong, use do while.
         */
    }
}
