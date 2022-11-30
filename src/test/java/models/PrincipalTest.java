package models;

import org.example.enums.GENDER;
import org.example.model.*;
import org.example.services.implementation.PrincipalImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    School school;
    Principal principal;
    PrincipalImpl principalImpl;
    Applicant applicant1;
    Applicant applicant2;
    Student student1;
    Student student2;

    @BeforeEach
    void setUp() {
        principal = new Principal("Olaoye", 54, GENDER.MALE, true);
        principalImpl = PrincipalImpl.getSingleInstance();
        applicant1 = new Applicant("Obi", 14, GENDER.MALE);
        applicant2 = new Applicant("Obi", 25, GENDER.MALE);
        school = new School("SOS", principal, applicant1);
        student1 = new Student("Oluremi", "Good", false);
        student2 = new Student("AdeOba", "bad", true);
    }

    @Test
    @DisplayName("Principal can admit applicant if applicant is between 9 and 15 years old")
    void admitGoodApplicant() {

        String expected = principal.getName() + " can admit " + applicant2.getName() + " into the school";
        assertEquals(expected, principalImpl.canAdmitApplicant(applicant1, principal));
    }

    @Test
    @DisplayName("Principal cannot admit applicant if applicant is  not between 9 and 15 years old")
    void rejectBadApplicant() {

        String expected = principal.getName() + " cannot admit " + applicant2.getName() + " into the school";
        assertEquals(expected, principalImpl.canAdmitApplicant(applicant2, principal));
    }

    @Test
    @DisplayName("Principal can expel student whose behaviour is bad and also who violate school rules")
    void canExpelStudent() {

        String expected = principal.getName() + " cannot expel " + student1.getName();
        assertEquals(expected, principalImpl.canExpelStudent("Good", false, principal, student1));
    }

    @Test
    @DisplayName("Principal cannot expel student whose behaviour is good and also who does not violate school rules")
    void cannotExpelStudent() {

        String expected = principal.getName() + " can expel " + student2.getName();
        assertEquals(expected, principalImpl.canExpelStudent("Good", false, principal, student2));
    }
}