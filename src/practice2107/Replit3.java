package practice2107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Replit3 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */

        String str ="Javaisalsoeasy";
        String tekrarlanan="";

        String [] arr=str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        List<String> strList = new ArrayList<String>();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1 ; i++) {

            if (arr[i].equals(arr[i+1])&& !strList.contains(arr[i])){
                strList.add(arr[i]);
            }
        }
        System.out.println(strList);


        }

    }

