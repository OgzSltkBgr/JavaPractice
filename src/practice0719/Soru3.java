package practice0719;

public class Soru3 {
    public static void main(String[] args) {
        //belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.

        int input =5;

        for (int i =input; i <input+1 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                int carpim =i*j;
                System.out.println(i+ " x "+ j + " = "+ carpim);
            }

        }
    }
}
