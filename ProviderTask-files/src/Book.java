public class Book extends Product{
    private String author;
    private String title;

    public Book(String inventoryNumber, double price, int quantity, Provider provider, String author, String title) {
        super(inventoryNumber, price, quantity, provider);
        this.author = author;
        this.title = title;
    }

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
        return this.getPrice()-0.5*this.getPrice();
    }

    public boolean sellProduct(int peace)throws NoMoreProductsException{
        if(this.getQuantity()>peace){
            this.setQuantity(this.getQuantity()-peace);
            return true;
        }
        else throw new NoMoreProductsException();
    }
}
