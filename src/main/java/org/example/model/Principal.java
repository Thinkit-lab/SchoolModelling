package org.example.model;

import org.example.enums.GENDER;

import java.util.List;

public class Principal extends Staff{
    List<Student> studentList;
    List<Classes> classesList;

    public Principal(String name, int age, GENDER gender, boolean isPresent, List<Student> studentList, List<Classes> classesList) {
        super(name, age, gender, isPresent);
        this.studentList = studentList;
        this.classesList = classesList;
    }
    public Principal(String name, int age, GENDER gender, boolean isPresent) {
        super(name, age, gender, isPresent);
    }
    public Principal(){

    }

//    private static Principal singleInstance = new Principal();
//    public static Principal getSingleInstance() {
//        if (singleInstance == null) {
//            singleInstance = new Principal();
//
//        }
//        return singleInstance;
//    }

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
        return "Principal{" +
                "studentList=" + studentList +
                ", classesList=" + classesList +
                '}';
    }
}
