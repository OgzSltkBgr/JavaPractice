package practice2607;

import java.util.Scanner;

public class SwitchTernary1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double weight = scan.nextDouble();
        System.out.println("Lutfen boy uzunlugunuzu metre cinsinden giriniz");
        double height = scan.nextDouble();
        double BMI = weight / (height *height);

        System.out.println(BMI < 18.5 ? "Your BMI is : " + BMI + "You re weak"
                : (BMI >= 18.5 && BMI < 25) ? "Your BMI is : "
                + BMI + " \nYour weight is ideal"
                : (BMI >= 25 && BMI < 30) ? "Your BMI is : " + BMI + "you re fat"
                : "Your BMI is : " + BMI + "you re opose");
    }
}
