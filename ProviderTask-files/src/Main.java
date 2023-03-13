import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("salesproducts.txt"));
            writer.write("1#K&K Electronics LTD#0878457123#868978787#1500.0#200#LG#86UH955V#\n");
            writer.write("1#K&K Electronics LTD#0878457123#868973463#1590.99#300# Dell#ALIENWARE 15#\n");
            writer.write("2#Ciela LTD#0878453453#673568573#25.99#1000#Terry Pratchett#Small Gods#\n");
            writer.write("2#Bard LTD#0884345098#569703349#16.78#950#Timothy Zahn#Star Wars: Heir to the Empire#");
            writer.close();
        }
        catch (IOException e){
            System.out.println("Couldn't write to the file!");
        }
        ProductLoader productLoader = new ProductLoader();

        try {
            Product[]products = productLoader.importDataFromFile();
            for(Product p : products){
                System.out.println(p.getProvider().getName());
            }
        }
        catch (IOException e){
            System.out.println("Error reading from file!");
        }
    }
}