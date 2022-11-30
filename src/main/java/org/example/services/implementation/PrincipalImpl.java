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

    public String canExpelStudent(String behaviour, boolean violateRule, Principal principal, Student student){
        if(student.getBehaviour() == behaviour && student.isViolateRule() == violateRule){
            return principal.getName() + " cannot expel " + student.getName();
        }
        return principal.getName() + " can expel " + student.getName();
    }

    public String canAdmitApplicant(Applicant applicant, Staff principal) {
        final int maxAge = 15;
        final int minAge = 9;
        if (applicant.getAge() > maxAge || applicant.getAge() < minAge) {
            return  principal.getName() + " cannot admit " + applicant.getName() + " into the school";
        } else {
            return principal.getName() + " can admit " + applicant.getName() + " into the school";
        }
    }

}
