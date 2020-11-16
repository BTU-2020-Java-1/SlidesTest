package ge.edu.btu.slide_11.socketmultithreading;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientTest {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Test Message");

            out.close();
            socket.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

