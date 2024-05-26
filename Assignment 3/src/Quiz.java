/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 * Represents a quiz which is a type of Assessment
 */
public class Quiz extends Assessment {
    /**
     * Constructs a Quiz with a total possible score and obtained score
     * @param total the total possible score
     * @param score the score obtained
     */
    public Quiz(int total, int score) {
        super(total, score);
    }

    /**
     * Returns a string representation of the quiz
     * @return string representation of the quiz
     */
    public String toString() {
        return "Quiz: " + score + "/" + total;
    }
}
