package ge.edu.btu.slide_7.bufferedstream;

import java.io.*;

public class BufferedStreamExample {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("resource/bufferedStream.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("resource/copyBufferedStream.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა " + ex.getMessage());
        }
    }
}

