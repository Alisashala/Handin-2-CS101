package Modelling;

public class Janitor extends Employee {
    private int janitorId;
    public Janitor(String name, int age, int departmentNumber, int janitorId) {
        super(name, age, departmentNumber);
        this.janitorId = janitorId;
    }

    public int getJanitorId () {
        return this.janitorId;
    }
}
