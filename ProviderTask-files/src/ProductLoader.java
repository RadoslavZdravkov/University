import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductLoader implements ImportData {
    public static int getNumberOfRows()throws IOException{
        int rowsCount=0;
        BufferedReader reader = new BufferedReader(new FileReader("salesproducts.txt"));
        String line;
        while((line = reader.readLine())!=null){
            rowsCount+=1;
        }
        reader.close();
        return rowsCount;
    }

    public Product[] importDataFromFile()throws IOException{
        int productsCount = 0;
        int currentProduct = 0;
        try {
            productsCount = ProductLoader.getNumberOfRows();
        }
        catch(IOException e)
        {
            System.out.println("Error reading from file!");
        }
        Product[]products = new Product[productsCount];
        BufferedReader reader = new BufferedReader(new FileReader("salesproducts.txt"));
        String line;
        while((line = reader.readLine())!=null){
            String[]arr = line.split("#");
            Provider currentProvider = null;
            try {
                currentProvider = new Provider(arr[1], arr[2]);
            }
            catch(WrongPhoneNumberException wpne){
                System.out.println(wpne.getMessage());
            }
            if(arr[0].equals("1")){
                products[currentProduct] = new Book(arr[3],Double.parseDouble(arr[4]),Integer.parseInt(arr[5]),
                        currentProvider,arr[6],arr[7]);
                currentProduct+=1;
            }
            else {
                products[currentProduct] = new Electronics(arr[3],Double.parseDouble(arr[4]),Integer.parseInt(arr[5]),
                        currentProvider,arr[6],arr[7]);
                currentProduct+=1;
            }
            }
        reader.close();
        return products;
        }
    }

