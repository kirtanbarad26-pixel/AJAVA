import java.io.*;
import java.net.*;

public class myclient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.50.57.91s", 6666);

        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Hello Server!");
        dos.flush();

        dos.close();
        s.close();
    }
}