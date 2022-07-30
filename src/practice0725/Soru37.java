package practice0725;

public class Soru37 {
    public static void main(String[] args) {
        /*
        Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m
    İpucu harfleri değiştirin ve ekrana yazdırın.
         */

        String cumle = "javayı severim";
        hackerDili(cumle);
    }

    private static void hackerDili(String cumle) {
        String arr[]= new String[cumle.length()];
        for (int i = 0; i <cumle.length() ; i++) {
            arr[i] = cumle.substring(i,i+1);

            if(arr[i].contains("s")){
                arr[i]="5";
            }
            if(arr[i].contains("a")) {
                arr[i] = "4";
            }
            if(arr[i].contains("e")) {
                arr[i] = "3";
            }
            if(arr[i].contains("i")) {
                arr[i] = "1";
            }
            if(arr[i].contains("o")) {
                arr[i] = "0";
            }
            System.out.print(arr[i]);
        }

    }
}
