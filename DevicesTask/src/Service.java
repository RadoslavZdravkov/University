import java.util.ArrayList;
import java.util.List;

public class Service {
    static List<Device>devices = new ArrayList<>();
    static List<BrokenDevice>brokenDevices = new ArrayList<>();
    public static int deviceCount=0;
    public static int brokenDeviceCount=0;

    public static void addDevice(Device device){
        devices.add(device);
        Service.deviceCount++;
        SerializeToFile.serializeDevice(devices);
    }
    public static BrokenDevice addBrokenDeviceToService(Device device, String symptom, int daysToRepair){
        brokenDevices.add(new BrokenDevice(device.getBrand(), device.getModel(),device.getPrice(),symptom,daysToRepair ));
        devices.remove(device);
        SerializeToFile.serializeBrokenDevice(brokenDevices);
        SerializeToFile.serializeDevice(devices);
        Service.brokenDeviceCount++;
        return new BrokenDevice(device.getBrand(), device.getModel(),device.getPrice(),symptom,daysToRepair);
    }
    public static void repairBrokenDevice(BrokenDevice brokenDevice)
    {
        brokenDevices.remove(brokenDevice);
        devices.add(new Device(brokenDevice.getBrand(),brokenDevice.getModel(), brokenDevice.getPrice()));
        SerializeToFile.serializeDevice(devices);
        SerializeToFile.serializeBrokenDevice(brokenDevices);
        Service.brokenDeviceCount--;
        Service.deviceCount++;
    }

}
