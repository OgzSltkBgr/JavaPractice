package practice0810;

public class Scope {
    static int sc1Static=5;
    static int ivInitialize;
    String sc2Instance="asdf";
    // sc6Lokal="dsdfs"; // Static olmayan method da olusturdugum icin sadece o method icinde kullanilabilir
    public static void main(String[] args) {
        System.out.println(ivInitialize); // Java initialize olan instance variable lara default deger atar
        int lvInitialize;
       // System.out.println(lvInitialize); // İnitalize olan lokal variable lar deger atanmadan yazdirilmaz.
        sc1Static=9;
        int sc5Lokal=40;
        //System.out.println(sc2Instance); Static olmadigi icin tanimlanamadi...
       // sc6Lokal="asdasd"; // Static olmayan method da olusturdugum icin sadece o method icinde kullanilabilir
        for (int i = 0; i <10 ; i++) {
            System.out.print(i);
            int sc6Loop=35;
        }
       // System.out.println(i); // Loop icisinde olustugu icin sadece loop icinde kullanilabilir
       // sc6Loop=40; // Loop icisinde olustugu icin sadece loop icinde kullanilabilir
    }

    public static void staticMethod(){
        sc1Static=4;
       // sc5Lokal=55; // Lokal variable oldugu için kullanılamaz
    }

    public void staticOlmayanMethod(){
        sc1Static=9;
        sc2Instance="Static olmadigi icin tanimlanabildi";
        String sc6Lokal= "Baska mahalleden ulasilamaz";
    }

}
