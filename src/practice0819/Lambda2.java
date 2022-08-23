package practice0819;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {
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
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        tekElemanlarinKaresiniYazdirStructured(liste);
        System.out.println();
        tekElemanlarinKupunuYazdirStructured(liste);
    }
    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(LambdaMethods::ayniSatirdaBosluklaYazdir);
    }
    //2)Çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list){
        list.stream().filter(LambdaMethods::ciftElemaniSec).forEach(LambdaMethods::ayniSatirdaBosluklaYazdir);
    }
//3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekElemanlarinKaresiniYazdirStructured(List<Integer> list){
        list.stream().filter(LambdaMethods::tekElemaniSec).map(LambdaMethods::kareYazdir).forEach(LambdaMethods::ayniSatirdaBosluklaYazdir);
    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekElemanlarinKupunuYazdirStructured(List<Integer> list){
        list.stream().distinct().filter(LambdaMethods::tekElemaniSec).map(LambdaMethods::kupYazdir).forEach(LambdaMethods::ayniSatirdaBosluklaYazdir);
    }
}
