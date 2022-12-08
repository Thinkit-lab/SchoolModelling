package org.example.services.implementation;

import org.example.model.Course;
import org.example.model.School;
import org.example.model.Student;
import org.example.services.StudentServices;
import org.example.utilities.implementation.StudentUtilImpl;

import java.util.List;

public class StudentImpl implements StudentServices {
    StudentUtilImpl studentUtil = new StudentUtilImpl();
    public void canTakeCourse(String courseCode, String courseTitle, Student student){
        List<Course> courseList = student.getCourseList();
        for(int i=0; i<courseList.size(); i++){
            if(student.getCourseList().get(i).getCourseCode().equalsIgnoreCase(courseCode)){
                System.out.println(student.getName() + " can take " + courseCode);
            }
        }
        studentUtil.addCourseToStudent(student, courseCode, courseTitle);
        System.out.println(student.getName() + " cannot take " + courseCode);
    }
}
