package org.example.utilities.implementation;

import org.example.model.Course;
import org.example.utilities.CourseUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CourseUtilImpl implements CourseUtils {
    private final String COURSEFILE = "src/main/resources/CourseDetails.csv";
    public List<Course> readCourseList(){
            List<Course> courseList = new ArrayList<>();
            String line = "";
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(COURSEFILE))){
                bufferedReader.readLine();
                while ((line = bufferedReader.readLine()) != null){
                    String[] row = line.split(",");
                    courseList.add(new Course(row[0], row[1]));
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
            return courseList;
        }
    }
