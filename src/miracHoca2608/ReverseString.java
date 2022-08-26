package miracHoca2608;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Javar Dünyası";
        System.out.println(reverse(name));
    }

    public static String reverse(String name){
        String str2="";
     /*   StringBuilder str2= new StringBuilder();
        String [] str = name.split("");
        for(int i=str.length-1; i>=0; i--){
            str2.append(str[i]);
        }
    */
        String [] str = name.split("");
        String tmp ="";
        for (int i = 0; i <str.length; i++) {
            String start = str[i];
            String end = str[str.length-(i+1)];
            //if(start==end) break;
           tmp=start;
           start=end;
           end=tmp;
            str2=str2+start;
        }
        return str2;
    }
}
