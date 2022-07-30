package practice0726;

import java.util.Arrays;

public class Replit_EngArray8 {
    public static void main(String[] args) {
        /*
        Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
Input1={1,2,3,4}
Input2={5,6}
Output={1,2,3,4,5,6}
         */
        int []input1={1,2,3,4};
        int []input2={5,6};
        newArrays(input1,input2);
    }

    private static int newArrays(int[] input1, int[] input2) {
        int input3[] = new int[input1.length + input2.length];

        int currentPosition = 0;

        for( int i = 0; i < input1.length; i++) {
            input3[currentPosition] = input1[i];
            currentPosition++;
        }

        for( int j = 0; j < input2.length; j++) {
            input3[currentPosition] = input2[j];
            currentPosition++;
        }
        System.out.println(Arrays.toString(input3));

return currentPosition;
    }
}
