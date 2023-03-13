import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    public void startServer(int port)throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Started: "+serverSocket);
        System.out.println("Waiting for connection...");
        socket = serverSocket.accept();
        System.out.println("Connected!");
    }
    public void readFromClient()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while(!(line=reader.readLine()).equals("exit")){
            System.out.println(line);
        }
    }
    public void closeServer()throws IOException{
        serverSocket.close();
        socket.close();
    }
}
