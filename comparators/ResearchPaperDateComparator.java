package comparators;

import java.util.Comparator;
import models.ResearchPaper;

public class ResearchPaperDateComparator implements Comparator<ResearchPaper> {
    public int compare(ResearchPaper p1, ResearchPaper p2) {
        return p1.getPublicationDate().compareTo(p2.getPublicationDate());
    }
}
