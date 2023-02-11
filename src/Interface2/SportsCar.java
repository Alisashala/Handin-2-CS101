package Interface2;

public class SportsCar implements Vehicle {
    private String brand;
    private double price;
    private int year;

    public SportsCar(String brand, double price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }
    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public void changeGear(int a) {
    }

    @Override
    public void speedUp(int a) {
    }

    @Override
    public void applyBrakes(int a) {
    }

    @Override
    public String toString() {
        return "Sports car{" +
                "Name ='" + brand + '\'' +
                ", Price =" + price +
                ", Year =" + year +
                '}';
    }
}
