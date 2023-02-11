package Modelling;

public class Teacher extends Employee {
    private int employeeId;
    public Teacher(String name, int age, int departmentNumber, int employeeId) {
        super(name, age, departmentNumber);
        this.employeeId = employeeId;
    }

    public int getEmployeeId () {
      return this.employeeId;
    }
}
