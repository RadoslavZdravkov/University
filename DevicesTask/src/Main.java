import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main implements Serializable {
    public static void main(String[] args) {
        Device d = new Device("Samsung", "A52", 630);
        Device d2 = new Device("Samsung", "A32", 400);
        BrokenDevice bd = Service.addBrokenDeviceToService(d,"wet",2);
        Service.addDevice(d);
        Service.addDevice(d2);
        Service.repairBrokenDevice(bd);
        Deserialize.deserializeDevices();
        System.out.println("-----------");
        Deserialize.deserializeBrokenDevices();
    }
}