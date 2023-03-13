import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class SerializeToFile implements Serializable {
    public static void serializeDevice(List<Device> deviceList) {
        try{
            FileOutputStream fileOut = new FileOutputStream("devices.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Device device : deviceList){
                out.writeObject(device);
            }
            fileOut.close();
            out.close();
        }
        catch(IOException e){
            System.out.println("Couldn't write to file!");
        }
    }

    public static void serializeBrokenDevice(List<BrokenDevice> BrokenDeviceList) {
        try{
            FileOutputStream fileOut = new FileOutputStream("brokenDevices.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Device brokenDevice: BrokenDeviceList){
                out.writeObject(brokenDevice);
            }
            fileOut.close();
            out.close();
        }
        catch(IOException e){
            System.out.println("Couldn't write to file!");
        }
    }
}
