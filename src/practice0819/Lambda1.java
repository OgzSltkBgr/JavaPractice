package practice0819;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda1 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        enBuyukBul(liste);
        enBuyukBul2(liste);
        enKucukBul2(liste);
        yedidenBuyukEnKucukCift(liste);
        yedidenBuyukEnKucukCift2(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun
    private static void enBuyukBul(List<Integer> list) {
        Integer max=list.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE,(t,u) ->t>u ? t:u);
        System.out.println(max);
    }
    //2.yol
    private static void enBuyukBul2(List<Integer> list){
        Integer max=list.stream().
                distinct().
                sorted().
                reduce(Integer.MIN_VALUE,(t,u) ->u);
        System.out.println(max);
    }
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
    private static void enKucukBul2(List<Integer> list){
        Integer min=list.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE,(t, u) ->u);
        System.out.println(min);
    }
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    private static void yedidenBuyukEnKucukCift(List<Integer> list){
        Integer min=list.
                stream().
                distinct().
                filter(t->t>7).
                filter(t-> t%2==0).
                reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
        System.out.println(min);
    }
    //2.yol
    private static void yedidenBuyukEnKucukCift2(List<Integer> list){
        Integer min=list.
                stream().
                distinct().
                filter(t->t%2==0).
                filter(t->t>7).
                sorted(Comparator.
                reverseOrder()).
                reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println(min);
    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    private static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){
       List<Double>sonuc= list.stream().
               distinct().
               filter(t->t>5).
               map(t->t/2.0).
               sorted(Comparator.reverseOrder()).
               collect(Collectors.toList());
        System.out.println(sonuc);
    }
}
