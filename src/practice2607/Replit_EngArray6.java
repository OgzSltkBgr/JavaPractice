package practice2607;

import java.util.Arrays;

public class Replit_EngArray6 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6
         */
        int input []= {3,2,5,4,1,6};
        Arrays.sort(input);
        int min =input[0];
        int max =input[input.length - 1];
        System.out.println(min);
        System.out.println(max);
    }
}
