public class Hovercraft extends Vehicle implements IsLandVehicle, IsSeaVessel{
    private int passengers;

    public Hovercraft(int maxSpeed, String model, double price, int passengers) {
        super(maxSpeed, model, price);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double checkPromo(){
        return getPrice()-0.03*getPrice();
    }

    public void enterLand(){
        System.out.println("Hovercraft Enters land!");
    }
    public void enterSea(){
        System.out.println("Hovercraft Enters sea!");
    }
}
