public class Computer {
    // inheritance 1 - For a parent class add 3 properties, 2 methods, and a constructor.
    private String product;
    private int gigabyte;
    private int battery;

    Computer (String product, int gigabyte, int battery) {
        this.product = product;
        this.gigabyte = gigabyte;
        this.battery = battery;
    }

    public void information () {
        System.out.println("Device: " + product + ", " + "GB: " + gigabyte + ", " + "Battery: " + battery);
    }
    public void wasBought() {
        System.out.println("This " + this.product + " was bought today");
    }


}

