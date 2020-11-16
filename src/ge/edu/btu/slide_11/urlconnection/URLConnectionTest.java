package ge.edu.btu.slide_11.urlconnection;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://btu.edu.ge/ka/stsavla-btu-shi/programebi");
            URLConnection connection = url.openConnection();
            InputStream in = connection.getInputStream();
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

