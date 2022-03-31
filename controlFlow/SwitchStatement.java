package controlFlow;

public class SwitchStatement {

    public static void main(String[] args) {

        int A = 12;

        switch (A) {
            case 9:
                System.out.println("A is 9");
                break;
            case 10:
                System.out.println("A is 10");
                break;
            case 11:
                System.out.println("A is 11");
                break;
            default:
                System.out.println("Incorrect Password");
        }

        /**
         * switch  () {
         *     case  :
         *          break;
         *     case  :
         *          break;
         *     default :
         * }
         *
         */

        // Example

        String day = "Sunday";
        String str = " is Office Day";

        switch (day) {
            case "Tuesday":
                System.out.println( day + str );
                break;
            case "Wednesday":
                System.out.println( day + str );
                break;
            case "Monday":
                System.out.println( day + str) ;
                break;
            default:
                System.out.println("No schedules left, Enjoy your day");
        }
    }

}
