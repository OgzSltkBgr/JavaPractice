package practice2107;

public class Replit6 {
    public static void main(String[] args) {
        /*
        Konsolda Alfabeyi Yazdıran programi yaziniz.

OUTPUT :

a b c .. .. .. .. y z
         */
        int a =97;
        do {
            char karakter = (char) a;
            System.out.print( karakter+ " ");
            a++;
        }while (a <= 122);
    }
}
