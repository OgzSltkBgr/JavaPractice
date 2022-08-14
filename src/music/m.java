package music;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class m {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);


        File file =new File("src/music/Akcent - Rita Official Video (online-audio-converter.com).wav");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();

        System.out.println("Muziği durdurmak için dur yaziniz");
        String yanıt=scanner.next();
    }
}
