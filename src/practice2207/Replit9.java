package practice2207;

public class Replit9 {
    public static void main(String[] args) {

        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)
Input :1238
Output :Girilen Numananin Tersi: 8321
         */
        String sayi="1238";

        String tersSayi=sayi.substring(sayi.length()-1) ;
        String istenenTersSayi="";

     //   for (int i = tersSayi.length()-1; i >=0 ; i--) {
     //       istenenTersSayi+=tersSayi.charAt(i);
     //   }
//
     //   System.out.println(istenenTersSayi);
        for (int i = sayi.length()-2; i >=0 ; i--) {
            tersSayi=tersSayi.concat(sayi.substring(i,i+1));
        }
        System.out.println(tersSayi);
    }
}
