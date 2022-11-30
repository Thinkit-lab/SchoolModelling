package org.example.model;

import org.example.enums.GENDER;

public abstract class NonAcademicStaff extends Staff{

    public NonAcademicStaff(String name, int age, GENDER gender, boolean isPresent) {
        super(name, age, gender, isPresent);
    }
}
