package models;

import org.example.model.*;
import org.example.services.implementation.PrincipalImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    School school;
    Principal principal;
    PrincipalImpl principalImpl;
    Applicant applicant;
    Student student;
    List<Classes> classesList;

    @BeforeEach
    void setUp() {
        principal = new Principal("Olaoye", 54, "Male",true);
        principalImpl =  PrincipalImpl.getSingleInstance();
        applicant = new Applicant("Obi", 25, "M");
    }

    @Test
    @DisplayName("Principal can admit applicant if applicant is between 9 and 15 years old")
    void admitGoodApplicant() {

        String expected = principal.getName() + " can admit " + applicant.getName() + " into the school";
        assertEquals(expected, principalImpl.canAdmitApplicant(school));
    }

    @Test
    @DisplayName("Principal cannot admit applicant if applicant is  not between 9 and 15 years old")
    void admitBadApplicant() {

        String expected = principal.getName() + " can admit " + applicant.getName() + " into the school";
        assertEquals(expected,principalImpl.canExpelStudent(student.getBehaviour(),student.isViolateRule(),school));
    }

    @Test
    @Disabled
    void expelStudent() {
    }
}