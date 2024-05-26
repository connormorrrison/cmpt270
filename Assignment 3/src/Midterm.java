/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 * Represents a midterm which is a type of Exam
 */
public class Midterm extends Exam {
    /**
     * Constructs a Midterm with a total possible score and obtained score
     * @param total the total possible score
     * @param score the score obtained
     */
    public Midterm(int total, int score) {
        super(total, score);
    }

    /**
     * Returns a string representation of the midterm
     * @return string representation of the midterm
     */
    public String toString() {
        return "Midterm: " + score + "/" + total;
    }
}
