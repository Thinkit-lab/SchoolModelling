package org.example.utilities;

import org.example.model.Principal;
import org.example.model.Teacher;

import java.util.List;

public interface StaffUtils {
    List<Teacher> readTeacherDetails();
    Principal readPrincipalDetails();
}
