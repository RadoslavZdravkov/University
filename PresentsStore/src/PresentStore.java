import java.util.ArrayList;

public class PresentStore {
    public ArrayList<GetProductsTo> products;
    public ArrayList<DeliveryAPI>devApi;

    public ArrayList<GetProductsTo> returnByLowerPrice(double price){
        ArrayList<GetProductsTo> lowerPriceProducts = new ArrayList<>();
        for(GetProductsTo product : products){
            if(product.getPrice()<price){
                lowerPriceProducts.add(product);
            }
        }
        return lowerPriceProducts;
    }

    public ArrayList<DeliveryAPI> returnByIdOfProvider(int id){
        ArrayList<DeliveryAPI> similarProviderProducts = new ArrayList<>();
        for(DeliveryAPI product: devApi){
            if(product.getIdOfProvider() == id){
                similarProviderProducts.add(product);
            }
        }
        return similarProviderProducts;
    }

}
