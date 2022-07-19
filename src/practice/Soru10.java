package practice;

public class Soru10 {
    public static void main(String[] args) {
/*
Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

    Test Data:
    Java is easy
    Aranan String: is
    Bektenen Çıktı:
        True
    Aranan String: and
    Beklenen Çıktı:False
 */

        String input = " Java is easy";
        String search = "and";

        if(input.contains(search)) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }
}
