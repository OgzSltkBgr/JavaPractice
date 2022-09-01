package miracHoca2608;

public class SaatAciSorusu {
    /*
    Kullanıcıdan 2 sayı girmesini isteyeceğiz, girilen bu değerlerden
biri saati diğeri de dakikayı temsil edecek. Bize akrep ile yelkovan
arasındaki küçük açıyı hesaplayıp değeri açısal olarak döndüren metodu yazınız

Örnek :

input : hour : 12,  minutes : 30
Output: 165
     */
    public static void main(String[] args) {

        System.out.println(angleClock(26, 30));

    }

    public static double angleClock(int hour, int minutes) {

        double ek = (double) minutes/12;// akrep yelkovanın 12 de 1 i kadar hareket ettiği için bunu yaptık.
        double hourAngle = ((hour%12)*30)+ (ek*6);
        double newMinute = (double)minutes/5;
        double minuteAngle = newMinute*30;
        double angle = Math.abs(hourAngle-minuteAngle); // abs--> mutlak değer methodu

        if (angle>180) return (360-angle);
        else return angle;

    }
}
