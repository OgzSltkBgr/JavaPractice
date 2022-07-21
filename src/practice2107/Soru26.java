package practice2107;

import java.util.ArrayList;
import java.util.List;

public class Soru26 {
    public static void main(String[] args) {
        /*
        Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
​
    Beklenen Çıktı:
    [Python, JAVA, PHP, Perl, C#, C++]
         */
        String arr []={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < arr.length ; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
