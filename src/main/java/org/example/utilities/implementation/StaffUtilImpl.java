package org.example.utilities.implementation;

import org.example.enums.GENDER;
import org.example.enums.STAFF;
import org.example.model.Course;
import org.example.model.Principal;
import org.example.model.Teacher;
import org.example.utilities.StaffUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collectors;

public class StaffUtilImpl implements StaffUtils {
    public final String FILE = "src/main/resources/StaffList.csv";

    public List<Teacher> readTeacherDetails() {
        List<Teacher> teacherList = new ArrayList<>();
        CourseUtilImpl courseUtil = new CourseUtilImpl();
        List<Course> newCourseList = courseUtil.readCourseList();
        String line = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE))){
            bufferedReader.readLine();
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] row = line.split(",");
                List<Course> teacherCourseList = new ArrayList<>();
                String[] need = row[5].substring(1,row[5].length()-1).split(" ");
                for(String str: need){
                    for(Course c : newCourseList){
                        if(Objects.equals(c.getCourseCode(), str)){
                            teacherCourseList.add(c);
                        }
                    }
                }
                teacherList.add(new Teacher(row[0], Integer.parseInt(row[1]), GENDER.valueOf(row[2]), Boolean.parseBoolean(row[3]), STAFF.valueOf(row[4]), teacherCourseList)
                );
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return teacherList;
    }

    public Principal readPrincipalDetails() {
        Principal principal = null;
        String line = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE))){
            bufferedReader.readLine();
            String[] row = bufferedReader.readLine().split(",");
            principal = new Principal(row[0], Integer.parseInt(row[1]), GENDER.valueOf(row[2]), Boolean.parseBoolean(row[3]), STAFF.valueOf(row[4]));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return principal;
    }

    public void addCourseToTeacher(Teacher teacher, String courseTitle, String courseCode){
        List<Teacher> teacherList = readTeacherDetails();
        for(Teacher t : teacherList){
            if(Objects.equals(t.getName(), teacher.getName())){
                t.getCourse().add(new Course(courseTitle, courseCode));
            }
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/TeacherList.csv"))){
            StringBuilder stringBuilder = new StringBuilder();
            StaffUtilImpl staffUtil1 = new StaffUtilImpl();
            stringBuilder.append(staffUtil1.readPrincipalDetails().getName()).append("\t");
            stringBuilder.append(staffUtil1.readPrincipalDetails().getAge()).append("\t");
            stringBuilder.append(staffUtil1.readPrincipalDetails().getGender()).append("\t");
            stringBuilder.append(staffUtil1.readPrincipalDetails().isPresent()).append("\t");
            stringBuilder.append(staffUtil1.readPrincipalDetails().getRole());
            stringBuilder.append("\n");
            for(Teacher list : teacherList) {
                stringBuilder.append(list.getName()).append("\t");
                stringBuilder.append(list.getAge()).append("\t");
                stringBuilder.append(list.getGender()).append("\t");
                stringBuilder.append(list.isPresent()).append("\t");
                stringBuilder.append(list.getRole()).append("\t");
                stringBuilder.append(list.getCourse().stream().map(Course::getCourseCode).collect(Collectors.joining(" ", "[", "]")));
                stringBuilder.append("\n");
            }
            bufferedWriter.write(stringBuilder.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(teacher.getName() + " course list has been updated successfully");
    }
}
