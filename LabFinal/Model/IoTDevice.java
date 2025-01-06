package Model;

public class IoTDevice {
    private String name;
    private String specification;
    private int price;

    public IoTDevice(String name, String specification, int price) {
        this.name = name;
        this.specification = specification;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSpecification() {
        return specification;
    }

    public int getPrice() {
        return price;
    }
}
