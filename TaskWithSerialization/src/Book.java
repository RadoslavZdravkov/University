import java.io.*;

public class Book extends Product{
    private String author;
    private String title;

    public Book(String inventoryNumber, double price, int quantity, Provider provider,String author, String title) {
        super(inventoryNumber,price,quantity,provider);
        this.author = author;
        this.title = title;
    }
    public Book(){};

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPromotionalPrice(){
        return getPrice()-getPrice()*0.5;
    }
    public boolean sellProduct(int piece) {
        if (this.getQuantity() > piece) {
            this.setQuantity(this.getQuantity() - piece);
            return true;
        } else return false;
    }
    public void serializeProduct()throws IOException {
        FileOutputStream fileOut = new FileOutputStream("file.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this);
        fileOut.close();
        out.close();
    }

    public Book deserializeProduct()throws IOException, ClassNotFoundException{
        FileInputStream fileIn = new FileInputStream("file.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Book book = (Book)in.readObject();
        return book;
    }
}
