package services;

import models.Student;
import models.Course;
import exceptions.CreditLimitExceededException;

public class RegistrationService {
    public void register(Student student, Course course) throws CreditLimitExceededException {
        student.registerForCourse(course);
    }

    public void approve(Student student, Course course) {
        System.out.println("Registration approved for " + student.getFullName()
                + " in " + course.getCourseName());
    }

    public boolean checkCreditLimit(Student student, Course course) {
        return student.getTotalCredits() + course.getCredits() <= 21;
    }
}
