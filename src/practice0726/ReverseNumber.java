package practice0726;

public class ReverseNumber {
    public static void main(String[] args) {
        int input=12345;
        int reverse=0;

       while (input>0){
           reverse= reverse*10+input%10;
           input/=10;
       }
        System.out.println(reverse);

        for (int i = input; i >0 ; i--) {
            reverse= reverse*10+input%10;
            input/=10;
        }System.out.println(reverse);
    }
}
