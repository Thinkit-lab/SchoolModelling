package models;

import org.example.model.Course;
import org.example.model.Teacher;
import org.example.services.implementation.TeacherImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    Teacher teacher1;
    TeacherImpl teacherImpl;
    Teacher teacher2;
    List<Course> courseList;
    Course course2;
    Course course1;
@BeforeEach
    void setUp(){
    teacherImpl = TeacherImpl.getSingleInstance();
    course1 = new Course("Mathematics", "MTH101");
    course2 = new Course("English", "ENG101");
    List<Course>  courseList = new ArrayList<>(Arrays.asList(course1, course2));
    teacher1 = new Teacher("Mr. Falolu", courseList);
    teacher2 = new Teacher("Mrs. Fayemi", courseList);

}
@Test
@DisplayName("A teacher can take a course if the course parameter is among the teacher's course list")
    void canTeachCourse(){
        String expected = teacher1.getName() + " can teach " + course1;
        assertEquals(expected, teacherImpl.canTeachCourse("MTH101", courseList, teacher1));
}
}
