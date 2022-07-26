package practice2607;

public class Replit_EngArray7 {
    public static void main(String[] args) {
        /*
        Write a method that accepts an array as parameter and returns sum
        off all elements in the array Then print the result in the main method.
Eg :
input : {1,2,3,4,5,6,7,8};
output: 36
         */
      int [] input ={1,2,3,4,5,6,7,8};
      sumElements(input);

    }

    private static int sumElements(int[] input) {
        int sum=0;
        for (int i = 0; i <input.length ; i++) {
            sum+=input[i];
        }
        System.out.println(sum);
        return sum;
    }
}
