package org.example.model;

import org.example.enums.GENDER;

public class Users {
    private String name;
    private int age;
    private GENDER gender;

    public Users(String name, int age, GENDER gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Users(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
