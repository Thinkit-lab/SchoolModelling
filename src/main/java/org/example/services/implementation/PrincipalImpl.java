package org.example.services.implementation;
import org.example.model.*;
import org.example.services.PrincipalServices;
import org.example.utilities.implementation.StudentUtilImpl;

public class PrincipalImpl implements PrincipalServices {
    private static PrincipalImpl singleInstance = new PrincipalImpl();
    private final StudentUtilImpl studentUtil = new StudentUtilImpl();
    public static PrincipalImpl getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new PrincipalImpl();
        }
        return singleInstance;
    }
    public void expelStudent(String behaviour, boolean violateRule, Principal principal, Student student) {
        if (student.getBehaviour() == behaviour && student.isViolateRule() == violateRule) {
            System.out.println(principal.getName() + " cannot expel " + student.getName());
        }
        else {
             studentUtil.expelStudent(student);
        }
    }
    public void admitApplicant(Applicant applicant, Staff principal) {
        final int maxAge = 15;
        final int minAge = 9;
        if (applicant.getAge() > maxAge || applicant.getAge() < minAge) {
            System.out.println("Sorry " + applicant.getName() + " you were not admitted");
        }
        else {
            studentUtil.addApplicantToStudentList(applicant);
        }
    }
}
