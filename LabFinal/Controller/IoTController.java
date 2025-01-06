package Controller;

import Model.IoTDevice;
import Model.RoomAppliance;
import Model.KitchenDevice;

public class IoTController {
    private IoTDevice device;

    public void createDevice(String type, String name, String specification, int price, int additionalAttribute) {
        if (type.equals("RoomAppliance")) {
            device = new RoomAppliance(name, specification, price, additionalAttribute);
        } else if (type.equals("KitchenDevice")) {
            device = new KitchenDevice(name, specification, price, additionalAttribute);
        }
    }

    public IoTDevice getDevice() {
        return device;
    }
}
