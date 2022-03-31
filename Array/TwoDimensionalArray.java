package Lessons;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        // int eg[][] = { {}, {}, {}, {}, };

        int num[][] = {
                {1,2,3,4,5,33,55},    // row 0, (1,2,3,4,5 are columns)
                {4,5,6,7,8},          // row 1, (4,5,6,7,8 are columns)
                {11,22,33,44},        // row 2, (11,22,33,44 are columns)
                {9,8,7,6},            // row 3, (9,8,7,6 are columns)
        };

        System.out.println(num[2][3]);

        num[3][1] = 1000;   // re-assigning value
        System.out.println(num[3][1]);

        System.out.println(num[0].length);

        for (int i = 0; i < num[0].length; i++) {   // looping the values of row 0
            System.out.print(num[0][i] + "\t");
        }

        System.out.println("<<<>>>");
        System.out.println();

        //////


        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                System.out.print(num[row][col] + "\t");
            }
            System.out.println();
        }

        //
        System.out.println("<<<<>>>>");
        //

        // reversed loop
        for (int a = num.length - 1; a >= 0; a--){
            for (int b = num[a].length - 1; b >= 0; b--){
                System.out.print(num[a][b] + "\t");
            }
            System.out.println();
        }

        //
        System.out.println("<<<<>>>>");
        //

        // forEach loop
        for (int[] integer : num) {             // Add [] behind int, because arrays are coming out.
            for (int n : integer) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }


    }

}
