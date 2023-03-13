import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        final int port = 7777;
        Server server = new Server();
        Client client = new Client();
        try{
            server.startServer(port);
            client.connect(port);
            client.writeToServer();
            server.readFromClient();
        }
        catch (IOException e){
            System.out.println("Something's wrong with the server!");
        }
    }
}