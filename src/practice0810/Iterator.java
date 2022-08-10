package practice0810;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {
    /*
    Bir listedeki ilk n elemani iterator kullanarak 5 artirin
    list:[2,13,56,23,45,14,40]
    artilarmasi istenen eleman sayisi :3
    output:[7,18,61,23,45,14,40]
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        System.out.println(list);

        ListIterator li1 = list.listIterator();

        li1.next();
        li1.set(list.get(0)+5);

        li1.next();
        li1.set(list.get(1)+5);

        li1.next();
        li1.set(list.get(2)+5);

        System.out.println(list);


        int []arr={2,13,56,23,45,14,40};
        List<Integer> liste=new ArrayList<>();
        ListIterator li2 = list.listIterator();
        for (int each:arr) {
            liste.add(each);
        }
        int n=6;
        int i = 0;
        while (i <n) {
            liste.set(i, liste.get(i)+5);
            li2.next();
            i++;
        }
        System.out.println(liste);

    }
}
