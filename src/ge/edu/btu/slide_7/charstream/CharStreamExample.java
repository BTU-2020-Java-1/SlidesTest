package ge.edu.btu.slide_7.charstream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

    public static void main(String[] args) {
        File sourceFile = new File("resource/charStream.txt");
        File destinationFile = new File("resource/copyCharStream.txt");
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
        } catch (IOException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა " + ex.getMessage());
        }
    }
}

