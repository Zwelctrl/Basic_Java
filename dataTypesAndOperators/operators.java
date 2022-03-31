package dataTypesAndOperators;

public class operators {

    public static void main(String[] args) {

                        /**
                         * There are Only three Operators in JAVA.
                         *
                         * 1) Unary Operator    (pocess 1 operand beside it)
                         * 2) Binary Operator   (pocess 2 operands beside it)
                         * 3) Tynary Operator   (pocess 3 operands beside it)
                         *
                         */


                        /** UNARY OPERATORS */

                        int z = 22;
                        z++; // Postfix
                        z--;
                        --z; // Prefix
                        ++z;

                        System.out.println(z);

                        /** TYNARY OPERATORS */

                        int number1 = 11;
                        int number2 = 22;
                        int f = (false)?number1:number2;
                        int n = (true)?number2:number1;         // if int, the outcome must be a int value
                        boolean h = (20>22)?true:false;         // if boolean, the outcome must be a boolean value


                        System.out.println(f);
                        System.out.println(n);
                        System.out.println(h);


                        /** BINARY OPERATORS */

                        /**
                         * There are six types of binary operators
                         *
                         * 1. Arithmetic operators      ( + - * / % )
                         * 2. Comparison / Relational Operators       ( < > <= => )
                         * 3. Bitwise operators         ( &, ^, | )
                         * 4. Logical operators         ( && , || )
                         * 5. Shift Operators           ( << , >> , >>> )
                         * 6. Assignment operators      ( = , += , -= , *= , /= , %= , &= , |= , <<= , >>= , >>>= )               // ordered as program calculates first
                         *
                         *
                         * // Arithmetic Operators  ->    + - * / %
                         *
                         * // Relational & Comparison Operators  ->   <  > <= =>//
                         *
                         * // Logical Operator  ->  &&   ||  (and & or)
                         *
                         * // Bitwise Operator  ->  & (Bitwise AND) ,
                         *                      ->  ^ (Bitwise exclusive Or),
                         *                      ->  | (Bitwise inclusive Or )
                         *
                         * // == !-
                         */

                        // Assignment Operators

                        int digit = 101;
                        System.out.println(digit);

                        // +=

                        int aa = 10;
                        aa = aa + 15;   // +15
                        aa += 15;       // +15

                        System.out.println(aa);


                        // Arithmetic Operators

                        int num = 65;       // num & 65 are operands
                        int num1 = 45;

                        System.out.println(num1 % 4);       // answer is 1, not 11.
                        System.out.println(num1 / 4);       // answer  is 11

                        int num2 = 4;
                        int num3 = 5;

                        // relational ( comparison ) operators

                        boolean stat = num2 >= num3;
                        System.out.println(stat);

                        //Logical Operator

                        int a = 10;
                        int b = 9;
                        int c = 8;

                        boolean flag = a<b && b>c;  // if one is false, all false   (sensitive)
                        boolean flag1 = a<=b || b==c; // if one is false, the output still can be true..if both are false, all false.

                        System.out.println(flag + " is one");
                        System.out.println(flag1 + " is two");


                        ///////////////////

                        //Bitwise operators

                        // Bitwise AND (&)

                        boolean test = true & false;        // false
                        boolean test2 = true & true;        // true
                        boolean test3 = false & false;      // false

                        /**
                         *  1 * 0 = 0
                         *  1 * 1 = 1
                         *  0 * 0 = 0
                         *
                         *  Similar with logical &&
                         */

                        System.out.println(test);
                        System.out.println(test2);
                        System.out.println(test3);

                        System.out.println("<<<<>>>>>");

                        // Bitwise exclusive OR ( ^ )

                        boolean test4 = true ^ false;       // true
                        boolean test5 = false ^ false;      // false
                        boolean test6 = true ^ true;        // false

                        /**
                         * 1 * 0 = 1
                         * 0 * 0 = 0
                         * 1 * 1 = 0
                         */

                        System.out.println(test4);
                        System.out.println(test5);
                        System.out.println(test6);

                        System.out.println("<<<<<>>>>>");

                        // Bitwise inclusive OR ( | )

                        boolean test7 = true | true;        // true
                        boolean test8 = true | false;       // true
                        boolean test9 = false | false;      // false

                        System.out.println(test7);
                        System.out.println(test8);
                        System.out.println(test9);

                        /**
                         *1 * 1 = 1;
                         *1 * 0 = 1;
                         *0 * 0 = 0;
                         *
                         * Similar with Logical ||
                         */

                        System.out.println("<<<<>>>>");

                        /** Shift Operators*/

                        // <<       left shift
                        // >>       right shift
                        // >>>      right shift 0 fill

                        /**
                         * How this process works?
                         *
                         * find the binary value,
                         * add 0s,
                         * calculate the values,
                         * send the outcome.
                         *
                         */

                        System.out.println(10<<2);          //left shift   * add 0s on the right side of binary value, DO NOT delete 0s on the left side
                        System.out.println(10>>2);          //right shift  * add 0s on the left side of binary value, DO delete 0s on the right side
                        System.out.println(10>>3);          //

                        // Homework (left shift)
                        System.out.println(20<<2);
                        System.out.println(15<<4);

                        // Homework (Right Shift)
                        System.out.println(20>>2);
                        System.out.println(20>>3);

                        System.out.println("<<<<>>>>");

                        System.out.println(33>>3);
                        System.out.println(45<<6);

    }
}
