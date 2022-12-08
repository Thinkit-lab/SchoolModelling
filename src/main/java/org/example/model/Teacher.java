package org.example.model;

import org.example.enums.GENDER;
import org.example.enums.STAFF;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Staff{
    private List<Course> teacherCourseList = new ArrayList<>();

    public Teacher(String name, int age, GENDER gender, boolean isPresent, STAFF role, List<Course> course) {
        super(name, age, gender, isPresent, role);
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



//name...age...gender...


    @Override
    public String toString() {
        return super.toString()+" teacherCourseList=" + teacherCourseList ;
    }
}
