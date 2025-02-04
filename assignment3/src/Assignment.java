/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 * Represents an assignment which is a type of Assessment
 */
public class Assignment extends Assessment {
    /**
     * Constructs an Assignment with a total possible score and obtained score
     * @param total the total possible score
     * @param score the score obtained
     */
    public Assignment(int total, int score) {
        super(total, score);
    }

    /**
     * Returns a string representation of the assignment
     * @return string representation of the assignment
     */
    public String toString() {
        return "Assignment: " + score + "/" + total;
    }
}
