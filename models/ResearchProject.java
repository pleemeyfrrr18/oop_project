package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResearchProject implements Serializable {
    private String projectId;
    private String topic;
    private List<Researcher> participants = new ArrayList<>();
    private List<ResearchPaper> publishedPapers = new ArrayList<>();

    public ResearchProject(String projectId, String topic) {
        this.projectId = projectId;
        this.topic = topic;
    }

    public void addParticipant(Researcher researcher) {
        participants.add(researcher);
        researcher.joinResearchProject(this);
    }

    public void removeParticipant(Researcher researcher) {
        participants.remove(researcher);
    }

    public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    public List<Researcher> getParticipants() {
        return participants;
    }

    @Override
    public String toString() {
        return "ResearchProject{" +
                "projectId='" + projectId + '\'' +
                ", topic='" + topic + '\'' +
                ", participants=" + participants.size() +
                '}';
    }
}
