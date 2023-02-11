package Modelling;

public class ItAdmin extends Employee {
    private int ItAdminId;
    public ItAdmin(String name, int age, int departmentNumber, int itAdminId) {
        super(name, age, departmentNumber);
        this.ItAdminId = itAdminId;
    }

    public int getItAdminId () {
        return this.ItAdminId;
    }
}
