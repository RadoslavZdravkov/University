import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Socket socket = null;
        InputStreamReader reader = null;
        OutputStreamWriter writer = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        Scanner scanner = new Scanner(System.in);
        try{
            socket = new Socket("localhost",7777);
            writer = new OutputStreamWriter(socket.getOutputStream());
            reader = new InputStreamReader(socket.getInputStream());
            bufferedWriter = new BufferedWriter(writer);
            bufferedReader = new BufferedReader(reader);
            while(true){
                String message = scanner.nextLine();
                bufferedWriter.write(message);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                System.out.println("Server's response: "+bufferedReader.readLine());
                if(message.equalsIgnoreCase("exit")){
                    break;
                }
            }
        }
        catch(IOException e){
            System.out.println("Something's wrong with the client.");
        }
        finally {
            try{
                if(socket !=null)socket.close();
                if(reader !=null)socket.close();
                if(writer !=null)socket.close();
                if(bufferedReader !=null)socket.close();
                if(bufferedWriter !=null)socket.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}