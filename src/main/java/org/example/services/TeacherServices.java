package org.example.services;

import org.example.model.Course;
import org.example.model.School;
import org.example.model.Teacher;

import java.util.List;


public interface TeacherServices {
    String canTeachCourse(String courseCode, List<Course> courseList, Teacher teacher);
}
