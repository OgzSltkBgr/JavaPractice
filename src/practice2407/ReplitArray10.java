package practice2407;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReplitArray10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen stringi giriniz");
        String sentence = input.nextLine();

        String reversed = "";
       String arr [] = sentence.split(" ");
       for (int i = arr.length-1; i >=0 ; i--){
           reversed+=arr[i]+" ";
       }
        System.out.println(reversed);
    }
}
