public class WrongUserException extends Exception{
    public String getMessage(){
        return "Wrong username or password!";
    }
}
