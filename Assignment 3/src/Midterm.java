/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 *
 */
public class Midterm extends Exam {
    /**
     *
     * @param total
     * @param score
     */
    public Midterm(int total, int score) {
        super(total, score);
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "Midterm: " + score + "/" + total;
    }
}
