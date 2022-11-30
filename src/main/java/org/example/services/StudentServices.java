package org.example.services;

import org.example.model.School;
import org.example.model.Student;

public interface StudentServices{
    String canTakeCourse(String courseCode, School school, Student student);

}
