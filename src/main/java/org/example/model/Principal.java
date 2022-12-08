package org.example.model;

import org.example.enums.GENDER;
import org.example.enums.STAFF;

import java.util.List;

public class Principal extends Staff{
    List<Student> studentList;
    List<Classes> classesList;

    public Principal(String name, int age, GENDER gender, boolean isPresent, STAFF role, List<Student> studentList, List<Classes> classesList) {
        super(name, age, gender, isPresent, role);
        this.studentList = studentList;
        this.classesList = classesList;
    }
    public Principal(String name, int age, GENDER gender, boolean isPresent, STAFF role) {
        super(name, age, gender, isPresent, role);
    }
    public Principal(){

    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }


    @Override
    public String toString() {
        return "Principal: " + super.toString();
    }
}
