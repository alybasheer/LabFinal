package Model;

public class KitchenDevice extends IoTDevice {
    private int kitchenNo;

    public KitchenDevice(String name, String specification, int price, int kitchenNo) {
        super(name, specification, price);
        this.kitchenNo = kitchenNo;
    }

    public int getKitchenNo() {
        return kitchenNo;
    }
}
