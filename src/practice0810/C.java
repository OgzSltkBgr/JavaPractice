package practice0810;

public class C extends B{
    /*============================ CLASS ==================================================================*/
        static int sayi=10;
        String name="Java";

    public static void main(String[] args) {
        /*============================ MAiN METHOD ==================================================================*/
        sayi=5;
        // name="fail";
        int sayi1=3;
       // int i=0;
        for (int i = 0; i <5 ; i++) {

        }
        // System.out.println(i);

        C c = new C();
        c.name = "fail";

    }

    /*============================ STATIC METHOD ==================================================================*/
    public static void staticMethod(){
    sayi=7;
   // sayi1=4;
    }

    /*============================ STATIC OlMAYAN METHOD ==================================================================*/
    public  void staticOlmayanMethod(){
        sayi=8;
       // sayi1=5;

        name="fail";
    }

}
