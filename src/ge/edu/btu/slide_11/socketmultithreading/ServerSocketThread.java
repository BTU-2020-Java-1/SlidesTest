package ge.edu.btu.slide_11.socketmultithreading;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerSocketThread extends Thread {

    private Socket socket;

    public ServerSocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String str = in.readUTF();
            System.out.println(str);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
