import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface ValidatePhoneNumber {
    static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.find()){
            return true;
        }
        else return false;
    }
}
