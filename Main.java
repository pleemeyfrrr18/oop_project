import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import enums.*;
import models.*;
import services.*;
import comparators.*;

public class Main {
    public static void main(String[] args) {
        try {
            Student student = new Student(
                    1, "student1", "123", "student@mail.com",
                    "Arsen", "Student", "S001", 4, 3.4
            );

            Professor professor = new Professor(
                    2, "prof1", "123", "prof@mail.com",
                    "John", "Professor", "E001",
                    500000, LocalDate.of(2020, 1, 1), 5
            );

            Manager manager = new Manager(
                    3, "manager1", "123", "manager@mail.com",
                    "Dana", "Manager", "E002",
                    400000, LocalDate.of(2021, 5, 10), ManagerType.OR
            );

            Course oop = new Course("CSCI2106", "Object-Oriented Programming", 5);
            oop.addLesson(new Lesson(1, "Classes and Objects", LessonType.LECTURE, LocalDate.now()));

            RegistrationService registrationService = new RegistrationService();
            registrationService.register(student, oop);
            manager.approveRegistration(student, oop);

            MarkService markService = new MarkService();
            Mark mark = new Mark(25, 25, 40);
            markService.putMark(professor, student, oop, mark);

            System.out.println(student.getTranscript());

            ResearchPaper paper1 = new ResearchPaper(
                    "OOP in University Systems",
                    List.of(professor),
                    "KBTU Journal",
                    12,
                    LocalDate.of(2024, 5, 20),
                    "10.1234/oop",
                    15
            );

            ResearchPaper paper2 = new ResearchPaper(
                    "Research-Oriented Education",
                    List.of(professor),
                    "Education Journal",
                    8,
                    LocalDate.of(2023, 3, 15),
                    "10.5678/research",
                    30
            );

            professor.addResearchPaper(paper1);
            professor.addResearchPaper(paper2);

            ResearchService researchService = new ResearchService();
            researchService.assignSupervisor(student, professor);

            System.out.println("\nPapers sorted by citations:");
            professor.printPapers(new ResearchPaperCitationsComparator());

            ResearchProject project = new ResearchProject("RP001", "AI in Education");
            project.addParticipant(professor);
            project.addPublishedPaper(paper1);

            System.out.println(project);

            AuthenticationService auth = new AuthenticationService();
            List<User> users = new ArrayList<>();
            users.add(student);
            users.add(professor);
            users.add(manager);

            auth.login("student1", "123", users);

            DataStorage storage = new DataStorage();
            storage.saveData(users);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
