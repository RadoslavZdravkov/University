public class Car extends Vehicle implements IsLandVehicle{
    private int enginePower;

    public Car(int maxSpeed, String model, double price, int enginePower) {
        super(maxSpeed, model, price);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public double checkPromo(){
        return getPrice()-0.2*getPrice();
    }

    public void enterLand(){
        System.out.println("Car Enters land!");
    }

}
