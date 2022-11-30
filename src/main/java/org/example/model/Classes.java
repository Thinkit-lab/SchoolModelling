package org.example.model;

import java.util.List;

public class Classes {
    private String className;
    private List<Student> studentList;
    private List<Course> courseList;

    public Classes(String className, List<Student> studentList, List<Course> courseList) {
        this.className = className;
        this.studentList = studentList;
        this.courseList = courseList;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", studentList=" + studentList +
                ", courseList=" + courseList +
                '}';
    }
}
