package practice2407;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplitArray8 {
    public static void main(String[] args) {
        int arr[]={1232,2345,5467,678,3454,2312,3451};
        Arrays.sort(arr);

        List<Integer> list= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }

        System.out.println(list.get(list.size()-2));
    }
}
