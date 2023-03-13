
public class Provider {
    private String name;
    private String phoneNumber;

    public Provider(String name, String phoneNumber)throws WrongPhoneNumberException {
        this.name = name;
        if(ValidatePhoneNumber.validatePhoneNumber(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }
        else throw new WrongPhoneNumberException();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
