public class NoMoreProductsException extends Exception{
    public String getMessage(){
        return "Not enough products!";
    }
}
