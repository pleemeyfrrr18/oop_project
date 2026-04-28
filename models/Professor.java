package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import enums.TeacherTitle;

public class Professor extends Teacher implements Researcher {
    private int hIndex;
    private List<ResearchPaper> researchPapers = new ArrayList<>();
    private List<ResearchProject> researchProjects = new ArrayList<>();

    public Professor(int id, String username, String password, String email,
                     String firstName, String lastName,
                     String employeeId, double salary, LocalDate hireDate,
                     int hIndex) {
        super(id, username, password, email, firstName, lastName,
                employeeId, salary, hireDate, TeacherTitle.PROFESSOR);
        this.hIndex = hIndex;
    }

    public int getHIndex() {
        return hIndex;
    }

    public List<ResearchPaper> getResearchPapers() {
        return researchPapers;
    }

    public List<ResearchProject> getResearchProjects() {
        return researchProjects;
    }

    public void printPapers(Comparator<ResearchPaper> comparator) {
        researchPapers.sort(comparator);
        researchPapers.forEach(System.out::println);
    }

    public void addResearchPaper(ResearchPaper paper) {
        researchPapers.add(paper);
    }

    public void joinResearchProject(ResearchProject project) {
        researchProjects.add(project);
    }
}
