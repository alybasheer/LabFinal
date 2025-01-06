package View;

import Model.IoTDevice;
import Model.RoomAppliance;
import Model.KitchenDevice;

public class IoTView {
    public void displayDeviceDetails(IoTDevice device) {
        System.out.println("Device Name: " + device.getName());
        System.out.println("Specification: " + device.getSpecification());
        System.out.println("Price: " + device.getPrice());
        if (device instanceof RoomAppliance) {
            System.out.println("Room Number: " + ((RoomAppliance) device).getRoomNo());
        } else if (device instanceof KitchenDevice) {
            System.out.println("Kitchen Number: " + ((KitchenDevice) device).getKitchenNo());
        }
    }
}
