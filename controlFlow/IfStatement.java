package controlFlow;

public class IfStatement {

    public static void main(String[] args) {

        // syntax =>  Datatypes  variable name assignment operators value  end operatprs

        /**
         * Three main statements in ControlFlow
         *
         * 1. Decision-Making Statement  (if, switch)
         * 2. Loop Statement
         * 3. Jump Statement
         */

        /**
         * Two types of Decision-Making Statements
         *
         * 1. if statement
         * 2. switch statement
         */

        /**
         * if( boolean condition ) {
         *     do something (if true)
         * }
         *
         * *** Only if condition is true, use if statement
         */

        // if
        int a = 33;
        int b = 32;

        if(a>b) {
            System.out.println(a + " is greater than " + b );
        }

        // if () {} else {}

        int aa = 22;
        int bb = 33;

        if (aa>bb){
            System.out.println((aa>bb) + " first statement");
        }else{
            System.out.println((aa>bb) + " second statement");
        }

        System.out.println("<<<<<>>>>");
        // if () {} else if () {} else {}

        int score = 60;

        if (score < 40) {
            System.out.println("FAIL");
        } else if (score >= 40 && score <= 80){
            System.out.println("PASS");
        } else {
            System.out.println("DESTINATION");
        }
    }

}
