package Main;

import Controller.IoTController;
import View.IoTView;

public class Main {
    public static void main(String[] args) {
        IoTController controller = new IoTController();
        IoTView view = new IoTView();

        // Creating a Room Appliance
        controller.createDevice("RoomAppliance", "Smart LED", "LED TV with 4K Resolution", 50000, 101);
        view.displayDeviceDetails(controller.getDevice());

        System.out.println();

        // Creating a Kitchen Device
        controller.createDevice("KitchenDevice", "Microwave", "Microwave with convection mode", 20000, 202);
        view.displayDeviceDetails(controller.getDevice());
    }
}
