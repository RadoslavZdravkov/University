import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Provider provider = new Provider("Radoslav","0878665370");
        Book b1 = new Book("123",12,3,provider, "title","author");
        Electronics e1=new Electronics("345",15,4,provider,"Sony","X1");
        try{
            b1.serializeProduct();
            e1.serializeProduct();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        Book b2=null;
        Electronics e2=null;
        try{
           b2= b1.deserializeProduct();
           e2=e1.deserializeProduct();
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println(b2.getAuthor());
    }
}