package practice2607;

import java.util.Scanner;

public class SwitchTernary2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name = scan.nextLine().toUpperCase();

        System.out.println("Lutfen soyadinizi giriniz");
        String surName = scan.nextLine().toUpperCase();
        System.out.println("Lutfen kart numarasını giriniz");
        String num = scan.next();

        if (num.length() == 16) {

        name = name.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("\\w", "*");
        surName = surName.substring(0, 1).toUpperCase() + surName.substring(1).replaceAll("\\w", "*");
        num = num.substring(0, 12).replaceAll("\\d", "*") + num.substring(12);


        System.out.println("Name :" + name + " " + surName);
        System.out.println("CCN  :" + num.substring(0, 4) + " " + num.substring(4, 8) + " "
                + num.substring(8, 12) + " " + num.substring(12, 16));
        } else {
            System.out.println("Lutfen gecerli kart numarası giriniz");

        }
    }
}