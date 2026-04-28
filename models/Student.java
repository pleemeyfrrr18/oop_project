package models;

import java.util.ArrayList;
import java.util.List;
import exceptions.CreditLimitExceededException;

public class Student extends User {
    protected String studentId;
    protected int year;
    protected double gpa;
    protected int totalCredits;
    protected int failedCoursesCount;
    protected List<Course> courses = new ArrayList<>();
    protected List<Mark> marks = new ArrayList<>();

    public Student(int id, String username, String password, String email,
                   String firstName, String lastName,
                   String studentId, int year, double gpa) {
        super(id, username, password, email, firstName, lastName);
        this.studentId = studentId;
        this.year = year;
        this.gpa = gpa;
        this.totalCredits = 0;
        this.failedCoursesCount = 0;
    }

    public void registerForCourse(Course course) throws CreditLimitExceededException {
        if (totalCredits + course.getCredits() > 21) {
            throw new CreditLimitExceededException("Student cannot have more than 21 credits.");
        }

        courses.add(course);
        course.addStudent(this);
        totalCredits += course.getCredits();

        System.out.println(getFullName() + " registered for course: " + course.getCourseName());
    }

    public List<Mark> viewMarks() {
        return marks;
    }

    public String getTranscript() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transcript for ").append(getFullName()).append("\n");

        for (Mark mark : marks) {
            sb.append(mark).append("\n");
        }

        return sb.toString();
    }

    public void addMark(Mark mark) {
        marks.add(mark);
    }

    public void rateTeacher(Teacher teacher, int rating) {
        System.out.println(getFullName() + " rated " + teacher.getFullName() + " with " + rating + "/10");
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public int getYear() {
        return year;
    }
}
