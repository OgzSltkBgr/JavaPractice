package practice0727;

import java.util.Arrays;

public class de {
    public static void main(String[] args) {

       /*
        ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
        ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
        ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10
        */
            int[] array= {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
            int[]input={1, 2, 3, 5, 6, 7, 8, 10,9};
            int olmayanSayi=array[0];
            Arrays.sort(input);
            for (int i = 0; i < array.length-1 ; i++) {
                if(array[i]!=input[i]) {
                    olmayanSayi=array[i];
                    break;
                }else{
                    olmayanSayi=array[array.length-1];
                }
            }
            System.out.println(olmayanSayi);

    }
}
