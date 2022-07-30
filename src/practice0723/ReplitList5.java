package practice0723;

import java.util.ArrayList;
import java.util.List;

public class ReplitList5 {
    public static void main(String[] args) {


            int input=5;


        List<Integer> list = new ArrayList<>();
        int adet = list.size();

        for (int i = input+1; i <Integer.MAX_VALUE; i++) {
            if(i%5!=0 && i%3!=0 && i%2!=0 ){
                list.add(i);
                if(list.size()==10){
                    break;
                }
            }

        }
        System.out.println(list);


    }
}
