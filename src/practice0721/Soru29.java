package practice0721;

public class Soru29 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
​
    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
​
         */
        String str="Java is fun";
        String arrStr[]=str.split(" ");
        String tersArr[];

        for (int i = arrStr.length-1; i >=0 ; i--) {
            System.out.print(arrStr[i]+" ");
        }





    }
}
