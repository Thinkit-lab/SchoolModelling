package org.example.model;

import org.example.enums.GENDER;
import org.example.enums.STAFF;

public abstract class Staff extends Users{
    private boolean isPresent;
    private STAFF role;

    public Staff(String name, int age, GENDER gender, boolean isPresent, STAFF role) {
        super(name, age, gender);
        this.isPresent = isPresent;
        this.role = role;
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

    public STAFF getRole() {
        return role;
    }

    public void setRole(STAFF role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "isPresent=" + isPresent +
                ", role=" + role +
                '}';
    }
}
