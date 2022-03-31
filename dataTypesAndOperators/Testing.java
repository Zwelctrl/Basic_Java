package dataTypesAndOperators;

public class Testing {

    public static void main(String[] args) {
        int num = 22;
        int nam = 33;

        int f = (true)?num:nam;
        int g = (11>2)?nam:num;

        boolean h = (20>22)?true:false;

        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
