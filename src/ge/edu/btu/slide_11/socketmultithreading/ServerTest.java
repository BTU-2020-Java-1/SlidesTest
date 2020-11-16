package ge.edu.btu.slide_11.socketmultithreading;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8080);
            while (true) {
                Socket socket = server.accept();
                ServerSocketThread serverSocketThread = new ServerSocketThread(socket);
                serverSocketThread.start();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

