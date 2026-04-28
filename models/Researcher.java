package models;

import java.util.Comparator;
import java.util.List;

public interface Researcher {
    int getHIndex();
    List<ResearchPaper> getResearchPapers();
    List<ResearchProject> getResearchProjects();
    void printPapers(Comparator<ResearchPaper> comparator);
    void addResearchPaper(ResearchPaper paper);
    void joinResearchProject(ResearchProject project);
}
