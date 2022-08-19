package practice0811;
import jm.JMC;
import jm.music.data.*;
import jm.util.Play;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;

// https://www.youtube.com/watch?v=9VluMvijNB4&list=RDCLAK5uy_n1j1GACZO4o7U1m708pa7jV1q7zR-cY44&index=14
public class bing implements JMC{
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
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
      //  URL url = bing.getClass().getResource("src/practice0811/Anne-Marie - Ciao Adios [Official Video].mp3");
       // bing.getResourceAsStream

       // File file = new File(bing.class.getResource("src/practice0811/Anne-Marie - Ciao Adios [Official Video].mp3").toURI());
       // BufferedReader reader = new BufferedReader(new FileReader("Anne-Marie - Ciao Adios [Official Video].mp3"));

    }


}

