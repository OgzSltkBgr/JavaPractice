package practice0727;

import java.util.ArrayList;
import java.util.List;

public class ReplitEngList2 {
    public static void main(String[] args) {
        String arr[]={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> list = new ArrayList<>();

        for(int i=0; i<arr.length;i++){
            list.add(arr[i]);
        }

        list.remove(2);
        list.remove(6);
        System.out.println(list);
        list.add(2,"Furkan");
        list.add(7,"Kemal");
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
