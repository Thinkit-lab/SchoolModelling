package org.example.services;

import org.example.model.School;
import org.example.model.Teacher;


public interface TeacherServices {
    String canTeachCourse(String courseCode, School school, Teacher teacher);
}
