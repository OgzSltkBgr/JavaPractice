package practice2207;

import java.util.Arrays;

public class ReplitArray1 {

    /*
    verilen arrayi terse ceviren array yaziniz
     */
    public static void main(String[] args) {
        int myArrays[]={1,2,3,4,5,};
        Arrays.sort(myArrays);

        for (int i = myArrays.length-1; i>=0 ; i--) {
            System.out.print(myArrays[i]);
        }

    }

}
