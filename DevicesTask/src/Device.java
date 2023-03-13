import java.io.Serializable;
import java.util.Scanner;

public class Device implements Serializable {
    private String brand;
    private String model;
    private double price;

    public Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public Device(){}

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void printDeviceInfo(){
        System.out.println("Brand: "+this.getBrand()+"; Model: "+this.getModel()+"; "+this.getPrice());
    }
    public void enterDevice(Scanner scanner){
        System.out.println("Enter device brand: ");
        this.brand = scanner.nextLine();
        System.out.println("Enter device model: ");
        this.model = scanner.nextLine();
        System.out.println("Enter device price: ");
        this.price = scanner.nextDouble();
    }
}
