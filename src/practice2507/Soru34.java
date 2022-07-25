package practice2507;

public class Soru34 {
    public static void main(String[] args) {
        /*
        String array dizisindeli 4 harfli kelimeleri return eden methodu yazınız.
​
​
    Test Data:
    isFourLetters(["Tomato", "Potato", "Pair"])
​
     ["Pair"]
         */

        String arr []= {"Tomato", "Potato", "Pair"};
        isFourLetters(arr);
    }

    private static void isFourLetters(String[] arr) {


        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length() == 4){
                System.out.println(arr[i]);
            }
        }


    }
}
