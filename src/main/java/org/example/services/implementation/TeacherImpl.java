package org.example.services.implementation;
import org.example.model.Teacher;
import org.example.services.TeacherServices;
import org.example.utilities.implementation.StaffUtilImpl;
import java.util.Objects;


public class TeacherImpl implements TeacherServices {
    private static TeacherImpl singleInstance = new TeacherImpl();
    private final StaffUtilImpl staffUtil = new StaffUtilImpl();

    public static TeacherImpl getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new TeacherImpl();
        }
        return singleInstance;
    }
    public void teachCourse(String courseCode, String courseTitle, Teacher teacher) {
        for(int i=0; i<teacher.getCourse().size(); i++ ) {
            if(Objects.equals(teacher.getCourse().get(i).getCourseCode(), courseCode)){
                System.out.println(courseCode + " is already available for " + teacher.getName());
            }
        }
        staffUtil.addCourseToTeacher(teacher, courseTitle, courseCode);
    }
}