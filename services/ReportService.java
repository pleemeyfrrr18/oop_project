package services;

import java.util.List;
import models.Student;

public class ReportService {
    public String generateAcademicReport(List<Student> students) {
        return "Academic report generated. Number of students: " + students.size();
    }
}
