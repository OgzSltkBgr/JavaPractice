package practice0726;

public class Replit_EngArray2 {
    public static void main(String[] args) {
        String str="Coding is greate.";
        String arr[]=str.split("");

        for(int i= arr.length-1; i>=0;i--)
            System.out.print(arr[i]);
    }
    }

