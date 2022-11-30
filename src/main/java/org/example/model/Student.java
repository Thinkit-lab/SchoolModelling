package org.example.model;

import java.util.List;

public class Student extends Users{
    private String studentClass;
    private List<Course> courseList;
    private String behaviour;
    private boolean violateRule;

    public Student(String name, int age, String gender, String studentClass, List<Course> courseList, String behaviour, boolean violateRule){
        super(name, age, gender);
        this.studentClass = studentClass;
        this.courseList = courseList;
        this.behaviour = behaviour;
        this.violateRule = violateRule;
    }

    public Student(){

    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public boolean isViolateRule() {
        return violateRule;
    }

    public void setViolateRule(boolean violateRule) {
        this.violateRule = violateRule;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentClass='" + studentClass + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
