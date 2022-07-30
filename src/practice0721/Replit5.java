package practice0721;

public class Replit5 {
    public static void main(String[] args) {
        /*
        100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT : 100 98 96 94 92 … … … … 2 0
         */
        for (int i = 100; i >=0 ; i--) {
            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
    }
}
