public class Ship extends Vehicle implements IsSeaVessel{
    private double deadweight;

    public Ship(int maxSpeed, String model, double price, double deadweight) {
        super(maxSpeed, model, price);
        this.deadweight = deadweight;
    }

    public double getDeadweight() {
        return deadweight;
    }
    public void setDeadweight(double deadweight) {
        this.deadweight = deadweight;
    }

    public double checkPromo(){
        return getPrice()-0.003*getPrice();
    }

    public void enterSea(){
        System.out.println("Ship Enters sea!");
    }
}
