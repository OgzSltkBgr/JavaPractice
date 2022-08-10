package practice0810;

public class B {

    /*============================ CLASS ==================================================================*/
    static int sayi=0;
    String ders="Java";

    public static void main(String[] args) {
        /*============================ MAiN METHOD ==================================================================*/
        sayi=100;
        // ders=".....";
        int mainSayi=20;
        // ders2="API";

        B b=new B();
        b.ders=".....";
       // int i=0;

        for ( int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            String ders3="SQL";
        }
        // System.out.println(i);
        // System.out.println(ders3);
    }

    /*============================ STATIC METHOD ==================================================================*/
    public static void staticMethod(){
        sayi=110;
        // System.out.println(ders);
        // mainSayi=10;
        // System.out.println(ders2);

    }

    /*============================ STATIC OlMAYAN METHOD ==================================================================*/
    public  void staticOlmayanMethod(){
        sayi=110;
        System.out.println(ders);
        // mainSayi=10;
        String ders2="Selenium";
    }
}
