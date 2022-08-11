package practice0811;

import java.util.ArrayList;
import java.util.List;

public class ReplitCol1 {
    /*
    Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
Array elemanları:  siyah,sari,mavi,turuncu
Beklenen Çıktı:
siyah
sari
mavi
turuncu

Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

Array List:  siyah,mavi,kirmizi,beyaz
en başa: **pembe**
mavi-kirmizi arasına **yesil**  renk eklenecek.
Beklenen Çıktı:
[pembe,siyah,mavi,yesil,kirmizi,beyaz]
    */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String [] arr ={"siyah","mavi","kirmizi","beyaz"};

        for(String each: arr){
            list.add(each);
        }
        System.out.println(list);

        list.add(0,"pembe");
        list.add((list.size()/2+1), "yesil");

        System.out.println(list);





    }


}
