package practice2407;

import java.util.Arrays;

public class ReplitArray6 {
    public static void main(String[] args) {
        int arr []={12,15,43,23,56,76,78,90,77,43};

        Arrays.sort(arr);



        System.out.println(Arrays.binarySearch(arr,56));
    }
}
