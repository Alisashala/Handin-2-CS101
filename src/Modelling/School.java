package Modelling;

import java.util.ArrayList;

public class School {
    ArrayList<String> classes;
    ArrayList<String> employees;

    public School (ArrayList<String> classes, ArrayList<String> employees) {
        this.classes = classes;
        this.employees = employees;
    }

    public ArrayList<String> getClasses () {
        return this.classes;
    }

    public ArrayList<String> getEmployees () {
        return this.employees;
    }
}
