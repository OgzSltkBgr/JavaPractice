package practice0720;

public class Arrays03 {
    public static void main(String[] args) {
        /*
        Verilen arrayde toplamlari istenen degere esi,t olan sayi ciftlerini
        yazdiran bir method yaziniz. int [] arr = {5,7,-6,4,2,15,3,8,1};
        İstenenToplam=9;
         */

        int [] arr = {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;

        elemanTopla(arr,istenenToplam);
    }

    public static void elemanTopla(int[] arr, int istenenToplam) {

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==9) {
                    System.out.println(arr[i]+ " ve "+ arr[j] + " toplam :" + istenenToplam);
                }
            }

        }
    }
}
