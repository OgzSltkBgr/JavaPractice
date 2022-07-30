package practice0728;

import java.util.*;

public class RandomArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("ilk array :"+ Arrays.toString(arr));
        Random rnd = new Random();
        List<Integer> result = new ArrayList<>();
        int arr1[] = new int[9];

        while(result.size()<9){
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] =1+ rnd.nextInt(10);
                if (!result.contains(arr1[i])) {
                    result.add(arr1[i]);
                }
            }
        } Collections.sort(result);

        Integer [] yeniarr=new Integer[9];
        for (int i = 0; i < yeniarr.length ; i++) {
            yeniarr[i]=result.get(i);
        }
        System.out.println("random    :"+Arrays.toString(yeniarr));

        int olmayanSayi=arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]!=yeniarr[i]) {
                olmayanSayi=arr[i];
                break;
            }else{
                olmayanSayi=arr[arr.length-1];
            }
        }
        System.out.println("eksik olan array :"+olmayanSayi);
    }
}
