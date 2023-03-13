import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePassword {
    public static void validate(String password)throws WrongPasswordException{
        Pattern pattern = Pattern.compile("^[a-zA-Z]{11,}");
        Matcher matcher = pattern.matcher(password);
        if(!matcher.find()){
            throw new WrongPasswordException();
        }
    }
}
