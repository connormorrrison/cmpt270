/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 *
 */
public class Assignment extends Assessment {
    public Assignment(int total, int score) {
        super(total, score);
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "Assignment: " + score + "/" + total;
    }
}
