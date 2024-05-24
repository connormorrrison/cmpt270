/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 * Represents an exam
 */
public class Exam {
    protected int total;
    protected int score;

    /**
     * Constructs an Exam with a total possible score and obtained score
     * @param total the total possible score
     * @param score the score obtained
     */
    public Exam(int total, int score) {
        this.total = total;
        this.score = score;
    }

    /**
     * Returns the percentage score obtained in the exam
     * @return percentage score obtained
     */
    public double getPercentage() {
        return ((double) score / (double) total) * 100;
    }

    /**
     * Main method for regression testing
     * @param args testing arguments
     */
    public static void main(String[] args) {
        // Regression test #1 for '+ Exam(total : int, score : int)'
        Exam exam1 = new Exam(100, 85);

        // Regression test #1 for '+ getPercentage() : double'
        if (exam1.getPercentage() == 85.0) {
            System.out.println("getPercentage() Test: Passed");
        } else {
            System.out.println("getPercentage() Test: Failed: Expected 85.0, but got " + exam1.getPercentage());
        }

        // Regression test #2 for '+ Exam(total : int, score : int)'
        Exam exam2 = new Exam(100, 0);

        // Regression test #2 for '+ getPercentage() : double'
        if (exam2.getPercentage() == 0.0) {
            System.out.println("getPercentage() Test: Passed");
        } else {
            System.out.println("getPercentage() Test: Failed for 0 score: Expected 0.0, but got " + exam2.getPercentage());
        }

        // Regression test #3 for '+ Exam(total : int, score : int)'
        Exam exam3 = new Exam(100, 100);

        // Regression test #3 for '+ Exam(total : int, score : int)'
        if (exam3.getPercentage() == 100.0) {
            System.out.println("getPercentage() Test: Passed");
        } else {
            System.out.println("getPercentage() Test: Failed for full score: Expected 100.0, but got " + exam3.getPercentage());
        }
    }
}
