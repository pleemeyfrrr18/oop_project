package services;

import models.Teacher;
import models.Student;
import models.Course;
import models.Mark;

public class MarkService {
    public void putMark(Teacher teacher, Student student, Course course, Mark mark) {
        teacher.putMark(student, course, mark);
    }

    public String getTranscript(Student student) {
        return student.getTranscript();
    }
}
