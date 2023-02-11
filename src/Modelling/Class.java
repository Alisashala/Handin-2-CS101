package Modelling;

import java.util.ArrayList;

public class Class {
    private String className;
    private ArrayList<String> students;

    public Class (String className, ArrayList<String> students) {
        this.className = className;
        this.students = students;
}

public String getClassName () {
    return this.className;
}

public ArrayList<String> getStudentName () {
    return this.students;
}
}