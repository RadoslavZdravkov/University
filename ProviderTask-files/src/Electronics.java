public class Electronics extends Product{
    private String manufacturer;
    private String model;

    public Electronics(String inventoryNumber, double price, int quantity, Provider provider, String manufacturer, String model) {
        super(inventoryNumber, price, quantity, provider);
        this.manufacturer = manufacturer;
        this.model = model;
    }

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
