/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 * Represents a final exam which is a type of Exam
 */
public class FinalExam extends Exam {
    /**
     * Constructs a FinalExam with a total possible score and obtained score
     * @param total the total possible score
     * @param score the score obtained
     */
    public FinalExam(int total, int score) {
        super(total, score);
    }

    /**
     * Returns a string representation of the final exam
     * @return a string representation of the final exam
     */
    public String toString() {
        return "Final Exam: " + score + "/" + total;
    }
}
