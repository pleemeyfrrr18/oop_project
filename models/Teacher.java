package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import enums.TeacherTitle;

public class Teacher extends Employee {
    protected TeacherTitle title;
    protected List<Course> courses = new ArrayList<>();

    public Teacher(int id, String username, String password, String email,
                   String firstName, String lastName,
                   String employeeId, double salary, LocalDate hireDate,
                   TeacherTitle title) {
        super(id, username, password, email, firstName, lastName, employeeId, salary, hireDate);
        this.title = title;
    }

    public void putMark(Student student, Course course, Mark mark) {
        student.addMark(mark);
        System.out.println(getFullName() + " put mark for " + student.getFullName() + " in " + course.getCourseName());
    }

    public List<Student> viewStudents(Course course) {
        return course.getStudents();
    }

    public void createAssignment(Course course, String title) {
        System.out.println("Assignment '" + title + "' created for course " + course.getCourseName());
    }

    public TeacherTitle getTitle() {
        return title;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
