package org.example.services.implementation;

import org.example.model.*;
import org.example.services.PrincipalServices;

import java.util.List;

public class PrincipalImpl implements PrincipalServices {

    private static PrincipalImpl singleInstance = new PrincipalImpl();
    public static PrincipalImpl getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new PrincipalImpl();

        }
        return singleInstance;
    }

    public String canExpelStudent(String behaviour, boolean violateRule, School school){
        List<Student> studentList = school.getStudentList();
        Staff principal = school.getPrincipal();
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).getBehaviour().equalsIgnoreCase(behaviour) && studentList.get(i).isViolateRule() == violateRule){
                return principal.getName() + " cannot expel " + studentList.get(i).getName();
            }
            else if(studentList.get(i).getBehaviour().equalsIgnoreCase(behaviour) && studentList.get(i).isViolateRule() != violateRule) {
                return principal.getName() + " issues warning to " + studentList.get(i).getName();
            }
            else if (!studentList.get(i).getBehaviour().equalsIgnoreCase(behaviour) && studentList.get(i).isViolateRule() != violateRule){
                return principal.getName() + " can expel " + studentList.get(i).getName();
            }
        }
        return "";
    }

    public String canAdmitApplicant(School school) {
        Applicant applicant = school.getApplicant();
        Staff principal = school.getPrincipal();
        final int maxAge = 15;
        final int minAge = 9;
        if (applicant.getAge() > maxAge || applicant.getAge() < minAge) {
            return  principal.getName() + " cannot admit " + applicant.getName() + " into the school";
        } else {
            return principal.getName() + " can admit " + applicant.getName() + " into the school";
        }
    }

}
