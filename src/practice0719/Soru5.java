package practice0719;

public class Soru5 {
    public static void main(String[] args) {
        for (int i = 1; i <14 ; i+=2) {
            for (int j =i+1; j <14 ; j+=2) {
                System.out.print(" ");
            }
            for (int j =0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <12 ; i+=2) {
            for (int j = 0; j <i ; j+=2) {
                System.out.print(" ");
            }
            for (int j =i; j <12 ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
