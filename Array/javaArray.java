package Lessons;

public class javaArray {

    public static void main(String[] args) {

        int nam = 11;                       // initialize a variable

        int num[] = {11,22,33,44,55,66};    // initialize an Array

        System.out.println(num[2]);
        num[3] = 99;                        // re-changing the value
        System.out.println(num[3]);

        ///
        String names[] = new String [] {"MgMg","KyawKyaw","TunTun","Thiha",null,"ThelSu"};
        System.out.println(names[3]);
        System.out.println(names.length);       // finding length of Array

        names[2] = "MinMawKun";             // changing value
        System.out.println(names[2]);

        String cars[] = new String[4];
        cars[0] = "Maserati";
        cars[1] = "Ferrari";
        cars[3] = "Audi";

        System.out.println(cars[2]);    // null   (no value is assigned)

        System.out.println(names);

        System.out.println("<<<<<>>>>>");
        /////////////////////////////

        String units[] = new String[] {null,"Ohm","Aph","Volt"};

        for (int i = 0; i< units.length; i++){
            System.out.println(units[i]);


            String unit[] = new String [] {"tat","rrr","rerre","trt"};

            for (int f = 0; f < unit.length; f++) {
                System.out.println(unit[f]);
            }
        }
    }

}
