import java.io.*;
import java.net.*;

public class myserver {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(6666);
        System.out.println("Waiting for client...");

        Socket s = ss.accept();
        System.out.println("Client connected");

        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = dis.readUTF();

        System.out.println("Client says: " + str);

        dis.close();
        s.close();
        ss.close();
    }
}
