package practice2407;

public class ReplitArray9 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int tekSayi=0;
        int ciftSayi=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                ciftSayi++;
            }else{
                tekSayi++;
            }
        }
        System.out.println("Tek Sayilar: "+ tekSayi);
        System.out.println("Cift Sayilar: " + ciftSayi);
    }
}
