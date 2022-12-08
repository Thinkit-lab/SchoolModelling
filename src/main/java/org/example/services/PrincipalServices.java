package org.example.services;
import org.example.model.*;


public interface PrincipalServices {
    void expelStudent(String behaviour, boolean violateRule, Principal principal, Student student);
    void admitApplicant(Applicant applicant, Staff principal);

}
