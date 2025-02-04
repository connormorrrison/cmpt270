/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 * Represents a lab exam which is a type of Exam
 */
public class LabExam extends Exam {
    /**
     * Constructs a LabExam with a total possible score and obtained score
     * @param total the total possible score
     * @param score the score obtained
     */
    public LabExam(int total, int score) {
        super(total, score);
    }

    /**
     * Returns a string representation of the lab exam
     * @return string representation of the lab exam
     */
    public String toString() {
        return "Lab Exam: " + score + "/" + total;
    }
}
