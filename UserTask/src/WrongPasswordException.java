public class WrongPasswordException extends Exception{
    public String getMessage(){
        return "Wrong username or password!";
    }
}
