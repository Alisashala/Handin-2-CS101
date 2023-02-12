package Inheritance1;

//For a child class add at least 1 additional property and 1 additional method.

public class SmartPhone extends Computer {
    private int nrOfCamera;

    public SmartPhone(String product, int gigabyte, int battery, int nrOfCamera) {
        super(product, gigabyte, battery);
        this.nrOfCamera = nrOfCamera;
    }

    public int getNrOfCamera () {
        return this.nrOfCamera;
    }

    public void howManyCameras () {
        System.out.println("The smartphone has " + nrOfCamera + " cameras");
    }
}
