package org.example.services;

import org.example.model.School;
import org.example.model.Student;

public interface StudentServices{
    void canTakeCourse(String courseCode, String courseTitle, Student student);

}
