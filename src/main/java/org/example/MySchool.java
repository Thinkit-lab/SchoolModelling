package org.example;

import org.example.model.*;
import org.example.services.implementation.PrincipalImpl;
import org.example.services.implementation.StudentImpl;
import org.example.services.implementation.TeacherImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySchool {

    public static void main(String[] args) {
        StudentImpl studentImpl = new StudentImpl();
        TeacherImpl teacherImpl = new TeacherImpl();
        PrincipalImpl principalImpl = new PrincipalImpl();

        Course math = new Course("Mathematics", "MTH101");
        Course english = new Course("English", "ENG102");
        Course government = new Course("Government", "GOV101");
        Course history = new Course("History", "HIS102");
        List<Course> scienceCourseList = new ArrayList<>(Arrays.asList(math, english));
        List<Course> artCourseList = new ArrayList<>(Arrays.asList(government, history));

        Student s1 = new Student("Olukunle", 30, "M", "100L", scienceCourseList, "Good", false);
        Student s2 = new Student("Oladele", 32, "M", "100L", scienceCourseList, "Good", false);
        Student s3 = new Student("Stephen", 30, "M", "100L", artCourseList, "Good", false);
        Student s4 = new Student("Thompson", 35, "M", "100L", artCourseList, "Good", false);
        List<Student> scienceStudentList = new ArrayList<>();
        scienceStudentList.addAll(Arrays.asList(s1,s2));
        List<Student> artStudentList = new ArrayList<>();
        artStudentList.addAll(Arrays.asList(s3,s4));

        Classes science = new Classes("Science", scienceStudentList, scienceCourseList);
        Classes art = new Classes("Art", artStudentList, artCourseList);
        List<Classes> classesList = new ArrayList<>();
        classesList.addAll(Arrays.asList(science,art));

        Teacher teacher1 = new Teacher("Johnson", 35, "M", true, scienceCourseList);
        Teacher teacher2 = new Teacher("Daniel", 45, "M", true, artCourseList);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.addAll(Arrays.asList(teacher2, teacher1));

        Principal principal = new Principal("Mr. Fadipe", 50, "M", true, scienceStudentList,classesList);
        Applicant applicant1 = new Applicant("Adebisi", 30, "F", classesList);

        School school = new School("SOS",teacherList,scienceStudentList,classesList,scienceCourseList,principal,applicant1);
        System.out.println(teacherImpl.canTeachCourse("ENG102", school, teacher1));
        System.out.println(studentImpl.canTakeCourse("GOV101", school, s1));
        principalImpl.canExpelStudent("good", false, school);
        principalImpl.canExpelStudent("bad", false, school);
        principalImpl.canAdmitApplicant(school);
    }
}