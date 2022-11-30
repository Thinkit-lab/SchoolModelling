package org.example.services.implementation;

import org.example.model.Course;
import org.example.model.School;
import org.example.model.Teacher;

import java.util.List;

public class TeacherImpl {
    public String canTeachCourse(String courseCode, School school, Teacher teacher) {
        List<Course> courseList = school.getCourseList();
        for(int i=0; i<courseList.size(); i++ ) {
            if(teacher.getCourse().get(i).getCourseCode() == courseCode){
                return teacher.getName() + " can teach " + courseCode;
            }

        }
        return  teacher.getName() + " cannot teach " + courseCode;
    }
}
