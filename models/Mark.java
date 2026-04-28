package models;

import java.io.Serializable;

public class Mark implements Serializable {
    private double firstAttestation;
    private double secondAttestation;
    private double finalExam;

    public Mark(double firstAttestation, double secondAttestation, double finalExam) {
        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
        this.finalExam = finalExam;
    }

    public double calculateTotal() {
        return firstAttestation + secondAttestation + finalExam;
    }

    public boolean isPassed() {
        return calculateTotal() >= 50;
    }

    @Override
    public String toString() {
        return "Mark{att1=" + firstAttestation +
                ", att2=" + secondAttestation +
                ", final=" + finalExam +
                ", total=" + calculateTotal() +
                ", passed=" + isPassed() + "}";
    }
}
