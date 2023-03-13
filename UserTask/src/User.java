import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User implements ValidatePhoneNumber{
    private String username;
    private String password;
    private String phoneNumber;

    public User(String username, String password, String phoneNumber)throws WrongUserException, WrongPasswordException,
            WrongPhoneNumberException{
        try{
            ValidateUsername.validate(username);
        }
        catch(WrongUserException wue){
            System.out.println(wue.getMessage());
        }
        this.username = username;
        try {
            ValidatePassword.validate(password);
        }
        catch(WrongPasswordException wpe)
        {
            System.out.println(wpe.getMessage());
        }
        this.password = password;
        try{
            validatePhoneNumber(phoneNumber);
        }
        catch(WrongPhoneNumberException wpne){
            System.out.println(wpne.getMessage());
        }
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public boolean validatePhoneNumber(String phoneNumber)throws WrongPhoneNumberException{
        Pattern pattern = Pattern.compile("^08[0-9]{8}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        if(!matcher.find()){
            throw new WrongPhoneNumberException();
        }
        return matcher.find();
    }
}
