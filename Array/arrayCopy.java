package Lessons;

public class arrayCopy {
    public static void main(String[] args) {
        int num [] = {11,22,33,44,55,66,77,88};

        System.out.println(num.getClass().getName());

        int copy [] = new int[5];   // [5] == new array shall have 5 values

        System.arraycopy(num,3,copy,0,5);

        for(int i = 0; i<copy.length; i++){
            System.out.print(copy[i] + "\t");
        }

        //
        System.out.println();
        //

        /**
         * srcPos  == Position where you start copy.
         * length  == length of values you want to copy
         * destPos == Position where you start writing the data you copied
         */

//         Clone ရိုက်မည်

        int fake[] = copy.clone();             // Clone ရိုက်မည်။
        for (int i = 0; i < fake.length; i++) {
            System.out.print(fake[i]+"\t");
        }

        //
        System.out.println();
        //

        if (fake == copy){               // System.arrayCopy != clone
            System.out.println("Yep");
        }else{
            System.out.println("nope");
        }
}
}
