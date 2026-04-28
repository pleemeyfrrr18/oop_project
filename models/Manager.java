package models;

import java.time.LocalDate;
import enums.ManagerType;
import exceptions.InvalidSupervisorException;

public class Manager extends Employee {
    private ManagerType managerType;

    public Manager(int id, String username, String password, String email,
                   String firstName, String lastName,
                   String employeeId, double salary, LocalDate hireDate,
                   ManagerType managerType) {
        super(id, username, password, email, firstName, lastName, employeeId, salary, hireDate);
        this.managerType = managerType;
    }

    public ManagerType getManagerType() {
        return managerType;
    }

    public void approveRegistration(Student student, Course course) {
        System.out.println("Manager approved registration of " + student.getFullName()
                + " for course " + course.getCourseName());
    }

    public void assignCourse(Teacher teacher, Course course) {
        course.addInstructor(teacher);
        teacher.addCourse(course);
        System.out.println("Manager assigned " + teacher.getFullName() + " to " + course.getCourseName());
    }

    public String generateReport() {
        return "Academic performance report generated.";
    }

    public void manageNews(String news) {
        System.out.println("News added: " + news);
    }

    public void assignResearchSupervisor(Student student, Researcher researcher)
            throws InvalidSupervisorException {
        if (researcher.getHIndex() < 3) {
            throw new InvalidSupervisorException("Supervisor h-index must be at least 3.");
        }

        System.out.println("Research supervisor assigned to " + student.getFullName());
    }
}
