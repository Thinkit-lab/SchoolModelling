package org.example.services.implementation;

import org.example.model.Course;
import org.example.model.School;
import org.example.model.Student;
import org.example.services.StudentServices;
import java.util.List;

public class StudentImpl implements StudentServices {
    public String canTakeCourse(String courseCode, School school, Student student){
        List<Student> studentList = school.getStudentList();
        List<Course> courseList = school.getCourseList();
        for(int i=0; i<courseList.size(); i++){
            if(student.getCourseList().get(i).getCourseCode().equalsIgnoreCase(courseCode)){
                return student.getName() + " can take " + courseCode;
            }
        }
        return student.getName() + " cannot take " + courseCode;
    }
}
