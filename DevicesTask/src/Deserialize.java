import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialize {
    public static void deserializeDevices(){
        try{
            FileInputStream fileIn = new FileInputStream("devices.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Device d;
            for(int i=0;i<Service.deviceCount;i++){
                d = (Device) in.readObject();
                System.out.println(d.getBrand()+" -> "+d.getModel()+" -> "+d.getPrice()+"\n");
            }
            fileIn.close();
            in.close();
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Couldn't read from file!");
        }
    }

    public static void deserializeBrokenDevices(){
        try{
            FileInputStream fileIn = new FileInputStream("brokenDevices.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            BrokenDevice bd;
            for(int i=0;i<Service.brokenDeviceCount;i++){
                bd = (BrokenDevice) in.readObject();
                System.out.println(bd.getBrand()+" -> "+bd.getModel()+" -> "+bd.getPrice()+
                        " -> "+bd.getDaysToRepair()+"\n");
            }
            fileIn.close();
            in.close();
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("Couldn't read from file!");
        }
    }

}
