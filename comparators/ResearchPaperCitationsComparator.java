package comparators;

import java.util.Comparator;
import models.ResearchPaper;

public class ResearchPaperCitationsComparator implements Comparator<ResearchPaper> {
    public int compare(ResearchPaper p1, ResearchPaper p2) {
        return Integer.compare(p2.getCitations(), p1.getCitations());
    }
}
