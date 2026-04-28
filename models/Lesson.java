package models;

import java.io.Serializable;
import java.time.LocalDate;
import enums.LessonType;

public class Lesson implements Serializable {
    private int lessonId;
    private String topic;
    private LessonType lessonType;
    private LocalDate date;

    public Lesson(int lessonId, String topic, LessonType lessonType, LocalDate date) {
        this.lessonId = lessonId;
        this.topic = topic;
        this.lessonType = lessonType;
        this.date = date;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void startLesson() {
        System.out.println("Lesson started: " + topic);
    }

    public void endLesson() {
        System.out.println("Lesson ended: " + topic);
    }

    @Override
    public String toString() {
        return lessonType + ": " + topic + " on " + date;
    }
}
