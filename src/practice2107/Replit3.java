package practice2107;

public class Replit3 {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
         */

        String str ="Javaisalsoeasy";
        String tekrarlanan="";

        for (int i = 0; i <str.length() ; i++) {

                if ((str.equals(str.substring(i, i + 1)))) {
                    tekrarlanan+=str.substring(i,i+1);
                }
            }System.out.println(tekrarlanan);
        }

    }

