package org.example;
import org.example.enums.GENDER;
import org.example.enums.STAFF;
import org.example.model.*;
import org.example.services.implementation.PrincipalImpl;
import org.example.services.implementation.StudentImpl;
import org.example.services.implementation.TeacherImpl;
import org.example.utilities.implementation.CourseUtilImpl;
import org.example.utilities.implementation.StaffUtilImpl;
import org.example.utilities.implementation.StudentUtilImpl;
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

        Student s1 = new Student("Olukunle", 30, GENDER.MALE, "100L", scienceCourseList, "Good", false);
        Student s2 = new Student("Oladele", 32, GENDER.FEMALE, "100L", scienceCourseList, "Good", false);
        Student s3 = new Student("Stephen", 30, GENDER.MALE, "100L", artCourseList, "Good", false);
        Student s4 = new Student("Thompson", 35, GENDER.MALE, "100L", artCourseList, "Good", false);
        List<Student> scienceStudentList = new ArrayList<>();
        scienceStudentList.addAll(Arrays.asList(s1,s2));
        List<Student> artStudentList = new ArrayList<>();
        artStudentList.addAll(Arrays.asList(s3,s4));

        Classes science = new Classes("Science", scienceStudentList, scienceCourseList);
        Classes art = new Classes("Art", artStudentList, artCourseList);
        List<Classes> classesList = new ArrayList<>();
        classesList.addAll(Arrays.asList(science,art));

        Teacher teacher1 = new Teacher("Johnson", 35, GENDER.MALE, true, STAFF.TEACHER, scienceCourseList);
        Teacher teacher2 = new Teacher("Daniel", 45, GENDER.MALE, true, STAFF.TEACHER, artCourseList);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.addAll(Arrays.asList(teacher2, teacher1));

        Principal principal = new Principal("Mr. Fadipe", 50, GENDER.MALE, true, STAFF.PRINCIPAL,scienceStudentList,classesList);
        Applicant applicant1 = new Applicant("Adebisi", 12, GENDER.MALE, "100L");
        Applicant applicant2 = new Applicant("Adebayo Faleti", 14, GENDER.MALE, "200L");

        School school = new School("SOS",teacherList,scienceStudentList,classesList,scienceCourseList,principal,applicant1);


        StaffUtilImpl staffUtil = new StaffUtilImpl();
        CourseUtilImpl courseUtil = new CourseUtilImpl();
        StudentUtilImpl studentUtil = new StudentUtilImpl();
        List<Student> studentList = studentUtil.readStudentList();
        List<Teacher> teachers = staffUtil.readTeacherDetails();
        Principal principal1 = staffUtil.readPrincipalDetails();
        List<Course> courseList = courseUtil.readCourseList();
        teachers.forEach(System.out::println);
//        courseList.forEach(System.out::println);
//        teacherImpl.teachCourse("GEO101", "Geology", teachers.get(0));
//        studentList.forEach(System.out::println);
//        System.out.println(studentUtil.readHeader());
//        principalImpl.expelStudent("Bad", true, principal1, studentList.get(1));
//        System.out.println(principalImpl.canAdmitApplicant(applicant1, principal1));
//        principalImpl.admitApplicant(applicant2, principal1);
    }
}