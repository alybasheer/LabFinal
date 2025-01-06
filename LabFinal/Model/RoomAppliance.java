package Model;

public class RoomAppliance extends IoTDevice {
    private int roomNo;

    public RoomAppliance(String name, String specification, int price, int roomNo) {
        super(name, specification, price);
        this.roomNo = roomNo;
    }

    public int getRoomNo() {
        return roomNo;
    }
}
