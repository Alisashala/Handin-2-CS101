package Inheritance1;

// For a child class add at least 1 additional property and 1 additional method.
public class Laptop extends Computer {
    private String color;

    public Laptop(String product, int gigabyte, int battery, String color) {
        super(product, gigabyte, battery);
        this.color = color;
    }
    public String getColor () {
        return this.color;
    }

    public void colorOfLaptop () {
        System.out.println("The color of the laptop is " + color);
    }

}