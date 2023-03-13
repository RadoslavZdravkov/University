import java.io.*;

public class Electronics extends Product{
    private String manufacturer;
    private String  model;

    public Electronics(String inventoryNumber, double price, int quantity, Provider provider, String manufacturer, String model) {
        super(inventoryNumber,price,quantity,provider);
        this.manufacturer = manufacturer;
        this.model = model;
    }
    public Electronics(){};

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPromotionalPrice(){
        return getPrice()-getPrice()*0.1;
    }
    public boolean sellProduct(int piece){
        if(this.getQuantity()>piece){
            this.setQuantity(this.getQuantity()-piece);
            return true;
        }else return false;
    }

    public void serializeProduct()throws IOException {
        FileOutputStream fileOut = new FileOutputStream("file.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this);
        fileOut.close();
        out.close();
    }
    public Electronics deserializeProduct()throws IOException, ClassNotFoundException{
        FileInputStream fileIn = new FileInputStream("file.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Electronics electronics=(Electronics) in.readObject();
        return electronics;
    }
}
