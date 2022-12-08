package org.example.services;

import org.example.model.Course;
import org.example.model.School;
import org.example.model.Teacher;

import java.util.List;


public interface TeacherServices {
    void teachCourse(String courseCode, String courseTitle, Teacher teacher);
}
