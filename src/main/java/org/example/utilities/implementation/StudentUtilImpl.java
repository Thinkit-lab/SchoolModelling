package org.example.utilities.implementation;
import org.example.enums.GENDER;
import org.example.model.Applicant;
import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.utilities.StudentUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StudentUtilImpl implements StudentUtils {
    private final String FILE = "src/main/resources/StudentDetails.csv";

//    Creates a list of students from the student csv file
    public List<Student> readStudentList(){
        CourseUtilImpl courseUtil = new CourseUtilImpl();
        List<Course> newCourseList = courseUtil.readCourseList();
        List<Student> studentList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE))){
            bufferedReader.readLine();
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] row = line.split(",");
                List<Course> studentCourseList = new ArrayList<>();
                String[] need = row[4].split(" ");
                for(String str: need){
                    for(Course c : newCourseList){
                        if(Objects.equals(c.getCourseCode(), str)){
                            studentCourseList.add(c);
                        }
                    }
                }
                studentList.add(new Student(row[0], Integer.parseInt(row[1]), GENDER.valueOf(row[2]), row[3], studentCourseList, row[5], Boolean.parseBoolean(row[6])));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return studentList;
    }

//    Separates the header from the list of students being read from the csv file
    public List<String> readHeader() {
        List<String> header = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE))){
            String[] row = bufferedReader.readLine().split(",");
            header.addAll(Arrays.asList(row[0], row[1], row[2], row[3], row[4], row[5], row[6]));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return header;
    }

//    Adds Applicant to the list of student if he/she meets the criteria
    public void addApplicantToStudentList(Applicant applicant){
        List<Student> studentList = readStudentList();
        List<String> headerList = readHeader();
        List<Course> applicantCourse = new ArrayList<>();
        applicantCourse.add(new Course("Mathematics", "MTH101"));
        applicantCourse.add(new Course("Physics", "PHY101"));

        studentList.add(new Student(applicant.getName(), applicant.getAge(), applicant.getGender(), applicant.getClassApplied(), applicantCourse, "Good", false));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE))) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String header : headerList) {
                stringBuilder.append(header).append(",");
            }
            stringBuilder.append("\n");

            for (Student list : studentList) {
                stringBuilder.append(list.getName()).append(",");
                stringBuilder.append(list.getAge()).append(",");
                stringBuilder.append(list.getGender()).append(",");
                stringBuilder.append(list.getStudentClass()).append(",");
                stringBuilder.append(list.getCourseList().stream().map(Course::getCourseCode).collect(Collectors.joining(" "))).append(",");
                stringBuilder.append(list.getBehaviour()).append(",");
                stringBuilder.append(list.isViolateRule());
                stringBuilder.append("\n");
            }
            bufferedWriter.write(stringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Congratulations, you have been successfully admitted into ABC School");
    }

    //    Expel student from school if student violate rule and has bad behaviour
    public void expelStudent(Student student){
        List<Student> studentList = readStudentList();
        int index = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (Objects.equals(studentList.get(i), student.getName())) {
                index = i;
            }
        }
        studentList.remove(studentList.get(index));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE))) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Student list : studentList) {
                stringBuilder.append(list.getName()).append(",");
                stringBuilder.append(list.getAge()).append(",");
                stringBuilder.append(list.getGender()).append(",");
                stringBuilder.append(list.getStudentClass()).append(",");
                stringBuilder.append(list.getCourseList().stream().map(Course::getCourseCode).collect(Collectors.joining(" "))).append(",");
                stringBuilder.append(list.getBehaviour()).append(",");
                stringBuilder.append(list.isViolateRule());
                stringBuilder.append("\n");
            }
            bufferedWriter.write(stringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Student has been expelled and removed from list");
    }

//    Add course to Student

    public void addCourseToStudent(Student student1, String courseTitle, String courseCode){
        List<Student> studentList = readStudentList();
        List<String> headerList = readHeader();
        for(Student student : studentList){
            if(Objects.equals(student.getName(), student1.getName())){
                student.getCourseList().add(new Course(courseTitle, courseCode));
            }
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE))){
            StringBuilder stringBuilder = new StringBuilder();
            for (String header : headerList) {
                stringBuilder.append(header).append(",");
            }
            stringBuilder.append("\n");
            for(Student list : studentList) {
                stringBuilder.append(list.getName()).append(",");
                stringBuilder.append(list.getAge()).append(",");
                stringBuilder.append(list.getGender()).append(",");
                stringBuilder.append(list.getStudentClass()).append(",");
                stringBuilder.append(list.getCourseList().stream().map(Course::getCourseCode).collect(Collectors.joining(" "))).append(",");
                stringBuilder.append(list.getBehaviour()).append(",");
                stringBuilder.append(list.isViolateRule());
                stringBuilder.append("\n");
            }
            bufferedWriter.write(stringBuilder.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
            System.out.println(student1.getName() + " course list has been updated successfully");
}
}
