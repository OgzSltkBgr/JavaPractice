package practice0811.depoYonetimi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReplitCol3 {
    /*
    iki sayıyı kıyaslayan Java kodunu yazınınz.
**Kullanılacak Operatörler**
**Büyüktür >**
**Küçüktür <**
**Büyük yada eşit =>**
**Küçük yada eşit =<**
**Eşittir ==**
**Eşit değildir !=**
**Kullanılacak sayılar 25 ile 39**
Beklenen Örnek Çıktı:
25 != 39
25 < 39
25 <= 39
     */
    public static void main(String[] args) throws FileNotFoundException {
        int [] arr1 ={25};
        int [] arr2= {39};

        if (arr1[0]<arr2[0]) {
            System.out.println(arr1[0]+" < "+arr2[0]);
        }
        FileInputStream fis = new FileInputStream("src/practice0811/depoYonetimi/dreamtv.png");
        System.out.println(fis);


    }
}
