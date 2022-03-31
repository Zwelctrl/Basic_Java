package Lessons;

public class LessonsOne {

    public static void main(String[] args) {

       int num [][] = {
               {1,2,3,4},
               {5,6,7,8},
               {9,8,7,6}
       };

       int copy[] = new int[4];

       System.arraycopy(num,0,copy,0,4);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

}}

/**
 * <h1><a><p></p></a></h1>
 *
 *
 *
 */

// package > class > method
