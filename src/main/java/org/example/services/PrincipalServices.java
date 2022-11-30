package org.example.services;
import org.example.model.*;


public interface PrincipalServices {
    String canExpelStudent(String behaviour, boolean violateRule, School school);
    String canAdmitApplicant(School school);

}
