package Modelling;

public class Headmaster extends Employee {
    private int headmasterId;
    public Headmaster(String name, int age, int departmentNumber, int headmasterId) {
        super(name, age, departmentNumber);
        this.headmasterId = headmasterId;
    }

    public int getHeadmasterId () {
        return this.headmasterId;
    }
}
