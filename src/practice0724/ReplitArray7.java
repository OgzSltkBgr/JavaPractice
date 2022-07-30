package practice0724;

import java.util.ArrayList;
import java.util.List;

public class ReplitArray7 {
    public static void main(String[] args) {
        String arr []={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> list = new ArrayList<>();

        for(int i=0; i< arr.length; i++){
            list.add(arr[i]);
        }

        System.out.println(list);
    }
}
