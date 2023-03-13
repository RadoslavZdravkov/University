import java.io.IOException;

public abstract class Product {
    private String inventoryNumber;
    private double price;
    private int quantity;
    private Provider provider;

    public Product(String inventoryNumber, double price, int quantity, Provider provider) {
        this.inventoryNumber = inventoryNumber;
        this.price = price;
        this.quantity = quantity;
        this.provider = provider;
    }
    public Product(){}

    public String getInventoryNumber() {
        return inventoryNumber;
    }
    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Provider getProvider() {
        return provider;
    }
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public abstract double getPromotionalPrice();
    public abstract boolean  sellProduct(int  piece);
    public abstract void serializeProduct()throws IOException;
    //public abstract void deserializeProduct()throws IOException,ClassNotFoundException;
}
