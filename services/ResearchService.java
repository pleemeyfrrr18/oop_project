package services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Student;
import models.Researcher;
import models.ResearchPaper;
import exceptions.InvalidSupervisorException;

public class ResearchService {
    public void assignSupervisor(Student student, Researcher researcher)
            throws InvalidSupervisorException {
        if (student.getYear() == 4 && researcher.getHIndex() < 3) {
            throw new InvalidSupervisorException("Supervisor must have h-index >= 3.");
        }
        System.out.println("Supervisor assigned successfully.");
    }

    public void printAllPapers(List<Researcher> researchers, Comparator<ResearchPaper> comparator) {
        List<ResearchPaper> allPapers = new ArrayList<>();

        for (Researcher researcher : researchers) {
            allPapers.addAll(researcher.getResearchPapers());
        }

        allPapers.sort(comparator);

        for (ResearchPaper paper : allPapers) {
            System.out.println(paper);
        }
    }

    public Researcher getTopCitedResearcher(List<Researcher> researchers) {
        Researcher top = null;
        int maxCitations = -1;

        for (Researcher researcher : researchers) {
            int total = 0;
            for (ResearchPaper paper : researcher.getResearchPapers()) {
                total += paper.getCitations();
            }

            if (total > maxCitations) {
                maxCitations = total;
                top = researcher;
            }
        }

        return top;
    }
}
