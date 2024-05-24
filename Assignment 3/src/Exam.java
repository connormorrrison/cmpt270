/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

public class Exam {
    protected int total;
    protected int score;

    public Exam(int total, int score) {
        this.total = total;
        this.score = score;
    }

    public double getPercentage() {
        return (double) score / total * 100;
    }

    public static void main(String[] args) {
        // Regression tests
        Exam exam = new Exam(100, 85);
        System.out.println(exam.getPercentage() == 85.0 ? "Pass" : "Fail");
    }
}
