import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
    public static void validate(String username)throws WrongUserException{
        Pattern pattern = Pattern.compile("^[-?a-z0-9_?]{3,15}$");
        Matcher matcher = pattern.matcher(username);
        if(!matcher.find()){
            throw new WrongUserException();
        }
    }

}
