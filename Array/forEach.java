package Lessons;

public class forEach {

    public static void main(String[] args) {
            String names[] = new String [] {"MgMg","KyawKyaw","TunTun","MinMin"};

        for (String name : names) {                      // for each loop
            System.out.print(name+"\t");
        }

        //
        System.out.println();
        //

        for(int i = names.length - 1; i >= 2; i--){      // for reverse loop
            System.out.print(names[i] + "\t");
        }

        for (String nn : names){
            System.out.println(nn);
        }
    }
}
