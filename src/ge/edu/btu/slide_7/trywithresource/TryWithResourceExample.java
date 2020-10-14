package ge.edu.btu.slide_7.trywithresource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("resource/byteStream.png");
             FileOutputStream out = new FileOutputStream("resource/copyByteStream.png")) {
            int b;
            while (true) {
                b = in.read();
                if (b == -1) {
                    break;
                } else {
                    out.write(b);
                }
            }
        } catch (IOException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა " + ex.getMessage());
        }
    }
}


