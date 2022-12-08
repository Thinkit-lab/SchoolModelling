package org.example.model;

import java.util.List;

public class School {
    private String name;
    private List<Teacher> teacherList;
    private List<Student> studentList;
    private List<Classes> classesList;
    private static List<Course> courseList;
    private Staff principal;
    private Applicant applicant;

    public School(String name, List<Teacher> teacherList, List<Student> studentList, List<Classes> classesList, List<Course> courseList, Staff principal, Applicant applicant) {
        this.name = name;
        this.teacherList = teacherList;
        this.studentList = studentList;
        this.classesList = classesList;
        this.courseList = courseList;
        this.applicant = applicant;
        this.principal = principal;
    }
    public School(String name, Staff principal, Applicant applicant){
        this.name = name;
        this.principal =principal;
        this.applicant = applicant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Staff getPrincipal() {
        return principal;
    }

    public void setPrincipal(Staff principal) {
        this.principal = principal;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", teacherList=" + teacherList +
                ", studentList=" + studentList +
                ", classesList=" + classesList +
                ", courseList=" + courseList +
                ", principal=" + principal +
                ", applicant=" + applicant +
                '}';
    }
}
