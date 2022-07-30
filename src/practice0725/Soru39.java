package practice0725;

import java.util.ArrayList;
import java.util.List;

public class Soru39 {
    public static void main(String[] args) {
        /*
        Bir dizi içerisindeki pozitif tam sayı sayısını ve
    negatif tam sayıların toplamını return (array olarak) eden bir method yazınız.
    Örnek:
    countPositivesSumNegative ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
    [10, -65]
    // Toplam 10 pozitif sayı var.
    // Tüm negatif sayıların toplamı -65'tir.
    Notlar :
    Boş bir dizi verilirse, boş bir dizi döndürür: []
    0 pozitif değil.
         */
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        countPositivesSumNegative(arr);
    }

    private static int countPositivesSumNegative(int[] arr) {
        int count =0;
        int toplam =0;
        int donen[]={count,toplam};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0){
                count++;
            }else if (arr[i]<0)
                toplam+=arr[i];
        }
        List<Integer> yeni=new ArrayList<>();
        yeni.add(count);
        yeni.add(toplam);
        System.out.print(yeni);

        return count;

    }
}
