package practice1907;

public class Soru7 {
    public static void main(String[] args) {

        int input=25;

        if (input<=0) {
             } else if (input%1==0 || input%2==0 || input%3==0 || input%5==0){
                System.out.println("Ugly number");
            }else {
                System.out.println("Ugly number degil");

        }
    }
}
