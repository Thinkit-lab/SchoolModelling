package org.example.model;

public abstract class Staff extends Users{
    private boolean isPresent;

    public Staff(String name, int age, String gender, boolean isPresent) {
        super(name, age, gender);
        this.isPresent = isPresent;
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
