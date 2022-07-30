package practice0725;

public class Soru36 {
    public static void main(String[] args) {
        /*
        Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
​
    Test Data:
​
    isPrime(31)
    true
​
    isPrime(18)
    false
         */

        int input =31;
        isPrime(input);
    }

    private static int isPrime(int input) {

        for (int i = 2; i <input ; i++) {
            if (input%i!=0) {
                System.out.println(true);
                break;
            }else System.out.println(false);
            break;
        }


        return  input;
    }
}
