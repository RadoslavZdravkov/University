import java.io.*;
import java.net.Socket;

public class Client {
    private Socket socket;
    public void connect(int port)throws IOException {
        socket = new Socket("localhost",port);
    }
    public void writeToServer()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
        writer.println(line);
        System.out.println(line);
    }
}
