package practice0811.depoYonetimi;
import jm.JMC;
import jm.music.data.*;
import jm.util.Play;
// https://www.youtube.com/watch?v=9VluMvijNB4&list=RDCLAK5uy_n1j1GACZO4o7U1m708pa7jV1q7zR-cY44&index=14
public class bing implements JMC{
    public static void main(String[] args) {
        int i =1;
     while(i<5){
         Play.midi(new Note(G3,0.75*TN));
         Play.midi(new Note(G3,TN*0.5));
         Play.midi(new Note(A3,TN));
         Play.midi(new Note(G3,TN));
         Play.midi(new Note(C4,TN));
         Play.midi(new Note(B3,TN+TN));
         i++;
     }
        //Play.audioFile("src/practice0811/depoYonetimi/1.m4a");
       // Play.mid("src/practice0811/depoYonetimi/Anne-Marie - Ciao Adios [Official Video].mp3");
       // Play.audioFile("src/practice0811/depoYonetimi/Vursalar Ölemem Melek MOSSO.mp3");
        //Play.au("https://www.youtube.com/watch?v=9VluMvijNB4&list=RDCLAK5uy_n1j1GACZO4o7U1m708pa7jV1q7zR-cY44&index=14");
      //Play.audioClip("src/practice0811/depoYonetimi/ScreenRecorderProject5.mp4");
        //Play.au("src/practice0811/depoYonetimi/Anne-Marie - Ciao Adios [Official Video].mp3");
    }
}
