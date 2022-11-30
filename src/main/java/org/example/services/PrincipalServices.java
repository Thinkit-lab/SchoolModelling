package org.example.services;
import org.example.model.*;


public interface PrincipalServices {
    String canExpelStudent(String behaviour, boolean violateRule, Principal principal, Student student);
    String canAdmitApplicant(Applicant applicant, Staff principal);

}
