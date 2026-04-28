package comparators;

import java.util.Comparator;
import models.ResearchPaper;

public class ResearchPaperLengthComparator implements Comparator<ResearchPaper> {
    public int compare(ResearchPaper p1, ResearchPaper p2) {
        return Integer.compare(p1.getLength(), p2.getLength());
    }
}
