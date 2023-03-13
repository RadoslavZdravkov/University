import java.io.Serializable;
import java.util.Scanner;

public class BrokenDevice extends Device implements Serializable {
    private String symptoms;
    private int daysToRepair;

    public BrokenDevice(String brand, String model, double price, String symptoms, int daysToRepair) {
        super(brand, model, price);
        this.symptoms = symptoms;
        this.daysToRepair = daysToRepair;
    }

    public String getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDaysToRepair() {
        return daysToRepair;
    }
    public void setDaysToRepair(int daysToRepair) {
        this.daysToRepair = daysToRepair;
    }

    public void printDeviceInfo(){
        System.out.println("Brand: "+this.getBrand()+"; Model: "+this.getModel()+"; "+this.getPrice()+
                "; "+this.symptoms+"; "+this.daysToRepair);
    }
    public void enterDevice(Scanner scanner){
        System.out.println("Enter broken device brand: ");
        this.setBrand(scanner.nextLine());
        System.out.println("Enter broken device model: ");
        this.setModel(scanner.nextLine());
        System.out.println("Enter broken device price: ");
        this.setPrice(scanner.nextDouble());
        System.out.println("Enter broken device symptoms: ");
        this.symptoms = scanner.nextLine();
        System.out.println("Enter broken device days to repair: ");
        this.daysToRepair = scanner.nextInt();
    }
}
