package org.example.model;

import org.example.enums.GENDER;

import java.util.List;

public class Applicant extends Users{
    private String classApplied;

    public Applicant(String name, int age, GENDER gender, String classApplied) {
        super(name, age, gender);
        this.classApplied = classApplied;
    } public Applicant(String name, int age, GENDER gender) {
        super(name, age, gender);
    }

    public String getClassApplied() {
        return classApplied;
    }

    public void setClassApplied(String classApplied) {
        this.classApplied = classApplied;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                ", classApplied=" + classApplied +
                '}';
    }
}
