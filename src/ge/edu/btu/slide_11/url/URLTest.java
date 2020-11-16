package ge.edu.btu.slide_11.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://btu.edu.ge/ka/stsavla-btu-shi/programebi");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
            System.out.println("Query: " + url.getQuery());
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


