package org.example.model;

public class Course {
    private String courseTitle;
    private String courseCode;

    public Course(String courseTitle, String courseCode) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTitle='" + courseTitle + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
