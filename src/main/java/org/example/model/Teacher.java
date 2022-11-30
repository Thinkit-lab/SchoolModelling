package org.example.model;

import org.example.enums.GENDER;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff{
    private List<Course> teacherCourseList = new ArrayList<>();

    public Teacher(String name, int age, GENDER gender, boolean isPresent, List<Course> course) {
        super(name, age, gender, isPresent);
        this.teacherCourseList = course;
    }
    public Teacher(String name, List<Course> course){
        super(name);
        this.teacherCourseList = course;
    }

    public List<Course> getCourse() {
        return teacherCourseList;
    }

    public void setCourse(List<Course> course) {
        this.teacherCourseList = course;
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "course=" + teacherCourseList +
                '}';
    }
}
