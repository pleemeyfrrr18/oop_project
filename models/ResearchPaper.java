package models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ResearchPaper implements Serializable {
    private String title;
    private List<Researcher> authors;
    private String journal;
    private int pages;
    private LocalDate publicationDate;
    private String doi;
    private int citations;

    public ResearchPaper(String title, List<Researcher> authors, String journal,
                         int pages, LocalDate publicationDate, String doi, int citations) {
        this.title = title;
        this.authors = authors;
        this.journal = journal;
        this.pages = pages;
        this.publicationDate = publicationDate;
        this.doi = doi;
        this.citations = citations;
    }

    public List<Researcher> getAuthors() {
        return authors;
    }

    public String getDoi() {
        return doi;
    }

    public int getLength() {
        return pages;
    }

    public int getCitations() {
        return citations;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void addCitation() {
        citations++;
    }

    @Override
    public String toString() {
        return "ResearchPaper{" +
                "title='" + title + '\'' +
                ", journal='" + journal + '\'' +
                ", pages=" + pages +
                ", date=" + publicationDate +
                ", citations=" + citations +
                '}';
    }
}
