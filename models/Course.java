package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable {
    private String courseId;
    private String courseName;
    private int credits;
    private List<Student> students = new ArrayList<>();
    private List<Teacher> instructors = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void addInstructor(Teacher teacher) {
        if (!instructors.contains(teacher)) {
            instructors.add(teacher);
        }
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return courseId + " - " + courseName + " (" + credits + " credits)";
    }
}
