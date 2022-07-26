package practice2607;

public class Replit_EngArray5 {
    public static void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements
input[]= {1,2,3,4,5,6,7}
Output : 4
         */
        int input[]= {1,2,3,4,5,6,7};
        int toplam=0;
        for (int i = 0; i <input.length ; i++) {
            toplam+=input[i];
        }
        System.out.println(toplam/ input.length);
    }
}
