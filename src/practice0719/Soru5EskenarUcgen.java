package practice0719;

public class Soru5EskenarUcgen {
    public static void main(String[] args) {
        /*
        Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
         */
        int input = 14;

        for (int i = 1; i <input ; i=i+2) {
            for (int j = i; j <input ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
                System.out.print(" ");
            } System.out.println(" ");

        }

        for (int i = 1; i <input ; i=i+2) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = input-2; j >i ; j--) {

                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
}
