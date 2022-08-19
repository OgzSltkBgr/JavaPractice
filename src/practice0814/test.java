package practice0814;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String str= "coderbyte";
        String tersStr="";

        for (int i=str.length()-1; i>=0; i--){
            tersStr+=str.charAt(i);
        }
        System.out.println(tersStr);
    }
}
