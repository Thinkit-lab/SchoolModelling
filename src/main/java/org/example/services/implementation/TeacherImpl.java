package org.example.services.implementation;

import org.example.model.Course;
import org.example.model.School;
import org.example.model.Teacher;

import java.util.List;
import java.util.Objects;


public class TeacherImpl {
    private static TeacherImpl singleInstance = new TeacherImpl();

    public static TeacherImpl getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new TeacherImpl();

        }
        return singleInstance;
    }
    public String canTeachCourse(String courseCode, List<Course> courseList, Teacher teacher) {
        for(int i=0; i<courseList.size(); i++ ) {
            if(Objects.equals(teacher.getCourse().get(i).getCourseCode(), courseCode)){
                return teacher.getName() + " can teach " + courseCode;
            }

        }
        return  teacher.getName() + " cannot teach " + courseCode;
    }
}
