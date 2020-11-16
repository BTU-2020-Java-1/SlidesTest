package ge.edu.btu.slide_11.socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8080);
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String str = in.readUTF();
            System.out.println(str);

            in.close();
            socket.close();
            server.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
