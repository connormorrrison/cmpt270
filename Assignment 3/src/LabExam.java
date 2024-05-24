/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

public class LabExam extends Exam {
    public LabExam(int total, int score) {
        super(total, score);
    }

    public String toString() {
        return "Lab Exam: " + score + "/" + total;
    }

    public static void main(String[] args) {
        // Regression tests
        LabExam labExam = new LabExam(100, 85);
        System.out.println(labExam.toString().equals("Lab Exam: 85/100") ? "Pass" : "Fail");
    }
}
