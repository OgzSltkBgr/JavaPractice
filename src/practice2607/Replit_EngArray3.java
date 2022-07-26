package practice2607;

public class Replit_EngArray3 {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
input : ade1r4d3
output : 8
         */
        String input = "ade1r4d3";

        input = input.replaceAll("\\D", "");
        int sayi =Integer.parseInt(input);
        int toplam =0;
        for (int i = sayi; i >0 ; i--) {
            toplam +=sayi%10;
            sayi/=10;
        }
        System.out.println(toplam);
    }
}
