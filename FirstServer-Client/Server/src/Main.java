import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.IllegalBlockingModeException;

public class Main {
    public static void main(String[] args){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStreamReader reader = null;
        OutputStreamWriter writer = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try{
            serverSocket = new ServerSocket(7777);
            while(true) {
                try {
                    socket = serverSocket.accept();
                    reader = new InputStreamReader(socket.getInputStream());
                    writer = new OutputStreamWriter(socket.getOutputStream());
                    bufferedReader = new BufferedReader(reader);
                    bufferedWriter = new BufferedWriter(writer);

                    while(true){
                        String messageFromClient = bufferedReader.readLine();
                        System.out.println("Client: " +messageFromClient );
                        bufferedWriter.write("MSG received!");
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                        if(messageFromClient.equalsIgnoreCase("exit")){
                            break;
                        }
                    }
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        catch(IOException e){
            System.out.println("Something's wrong with the server.");
        }
    }
}
