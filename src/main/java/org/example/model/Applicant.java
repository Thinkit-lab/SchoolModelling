package org.example.model;

import org.example.enums.GENDER;

import java.util.List;

public class Applicant extends Users{
    List<Classes> classApplied;

    public Applicant(String name, int age, GENDER gender, List<Classes> classApplied) {
        super(name, age, gender);
        this.classApplied = classApplied;
    } public Applicant(String name, int age, GENDER gender) {
        super(name, age, gender);
    }

    public List<Classes> getClassApplied() {
        return classApplied;
    }

    public void setClassApplied(List<Classes> classApplied) {
        this.classApplied = classApplied;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                ", classApplied=" + classApplied +
                '}';
    }
}
