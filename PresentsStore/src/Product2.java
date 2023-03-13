public class Product2 implements GetProductsTo, DeliveryAPI{
    public String type;
    public double price;
    public int idOfProvider;
    public int number;

    public Product2(String type, double price, int idOfProvider, int number) {
        this.type = type;
        this.price = price;
        this.idOfProvider = idOfProvider;
        this.number = number;
    }

    public double getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
    public int getNumber(int idOfProvider){
        return number;
    }
    public String getType(int idOfProvider){
        return type;
    }
    public int getIdOfProvider(){
        return idOfProvider;
    }
}
