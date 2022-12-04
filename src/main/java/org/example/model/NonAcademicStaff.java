package org.example.model;

import org.example.enums.GENDER;
import org.example.enums.STAFF;

public abstract class NonAcademicStaff extends Staff{

    public NonAcademicStaff(String name, int age, GENDER gender, boolean isPresent, STAFF role) {
        super(name, age, gender, isPresent, role);
    }
}
