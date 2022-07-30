package practice0721;

public class Soru23 {
    public static void main(String[] args) {
        /*
        Aşağıdaki grid şeklini yazan Java Kodunu yazınız.
​
    Beklenen Çıktı:
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
     0  0  0  0  0  0  0  0  0  0
         */
     // int outer =10;
     // int inner = 10;
     // for (int i = 0; i <outer ; i++) {
     //     for (int j = 0; j <inner ; j++) {
     //         System.out.print("0 ");
     //     }
     //     System.out.println();

            // bunu arrayle yapalim

            int sayilar[]= {0};

            for (int j = 0; j <10 ; j++) {
                for (int k = 0; k <10 ; k++) {
                    System.out.print(sayilar[0]+ " ");
                }
                System.out.println();



        }

    }
}
