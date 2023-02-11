package Modelling;

public class Employee {
    private String name;
    private int age;
    private int departmentNumber;

    public Employee(String name, int age, int departmentNumber) {
        this.name = name;
        this.age = age;
        this.departmentNumber = departmentNumber;
    }
    public String getName () {
        return this.name;
    }

    public int getAge () {
        return this.age;
    }

    public int getDepartmentNumber() {
        return this.departmentNumber;
    }
}
