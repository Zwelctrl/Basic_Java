package Lessons;

public class duplicateElement {

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,4,6,9,8,5,3,1,7,4};

        for(int a = 0; a<num.length; a++){
            for(int b= a+1; b<num.length; b++){
                if(num[a]==num[b]){
                    System.out.println(num[b]);
                }
            }
        }
    }

}
