package ge.edu.btu.slide_7.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("resource/byteStream.png");
            out = new FileOutputStream("resource/copyByteStream.png");
            int b;
            while (true) {
                b = in.read();
                if (b == -1) {
                    break;
                } else {
                    out.write(b);
                }
            }
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }
}


