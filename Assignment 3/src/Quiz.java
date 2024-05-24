/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 *
 */
public class Quiz extends Assessment {
    /**
     *
     * @param total
     * @param score
     */
    public Quiz(int total, int score) {
        super(total, score);
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "Quiz: " + score + "/" + total;
    }
}
