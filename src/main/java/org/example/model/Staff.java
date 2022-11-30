package org.example.model;

import org.example.enums.GENDER;

public abstract class Staff extends Users{
    private boolean isPresent;

    public Staff(String name, int age, GENDER gender, boolean isPresent) {
        super(name, age, gender);
        this.isPresent = isPresent;
    }
    public Staff(String name){
        super(name);
    }

    public Staff(){

    }


    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    @Override
    public String toString() {
        return "Staff{" +
                ", isPresent=" + isPresent +
                '}';
    }
}
