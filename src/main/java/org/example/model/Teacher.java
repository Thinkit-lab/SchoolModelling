package org.example.model;

import java.util.List;

public class Teacher extends Staff{
    List<Course> teacherCourseList;

    public Teacher(String name, int age, String gender, boolean isPresent, List<Course> course) {
        super(name, age, gender, isPresent);
        this.teacherCourseList = course;
    }
    public Teacher(){

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
