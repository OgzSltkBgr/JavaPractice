package practice2007;

import java.util.Scanner;

public class PınKodu {
    public static void main(String[] args) {

        //String olan pin kodunuzu kontrol eden bir kod yaziniz

        Scanner scan = new Scanner(System.in);
        String pin1="Mehmet.1234";
        String puk = "123456789";
        int girisHakki =3;

        while(true){
            System.out.println("pin kodunu giriniz");
           String pin =scan.nextLine();

            if(pin.equals(pin1)){
                System.out.println("Pin kodu basarili");
                break;
            }else {

                girisHakki--;
                System.out.println("Yanlis giris yaptiniz, kalan giris hakkiniz : " +girisHakki);
            }
            if (girisHakki == 0){
                System.out.println("Giris hakkiniz kalmadi, pin bloke oldu");
                break;
                }


        }


    }
}
