package practice0721;

public class Replit4 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
Input : 6
Output: 6!=65432*1=720
         */
        int input =6;
        int faktöriyel=1;

        for (int i = input; i >0 ; i--) {
            faktöriyel*=i;
        }
        System.out.println(input+"!="+ faktöriyel);

    }
}
