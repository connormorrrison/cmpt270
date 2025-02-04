/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 * Represents an assessment with a total score and obtained score
 */
public class Assessment {
    protected int total;
    protected int score;

    /**
     * Constructs an Assessment with a total possible score and obtained score
     * @param total the total possible score
     * @param score the score obtained
     */
    public Assessment(int total, int score) {
        this.total = total;
        this.score = score;
    }

    /**
     * Returns the score obtained
     * @return the score obtained
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns the total possible score
     * @return the total possible score
     */
    public int getTotal() {
        return total;
    }

    /**
     * Main method for regression testing
     * @param args testing arguments
     */
    public static void main(String[] args) {
        // Regression test for '+ Assessment(total : int, score : int)'
        Assessment assessment = new Assessment(100, 75);

        // Regression test for '+ getScore() : int'
        if (assessment.getScore() == 75) {
            System.out.println("getScore() Test: Passed");
        } else {
            System.out.println("getScore() Test: Failed: Expected 75, but got " + assessment.getScore());
        }

        // Regression test for '+ getTotal() : int'
        if (assessment.getTotal() == 100) {
            System.out.println("getTotal() Test: Passed");
        } else {
            System.out.println("getTotal() Test: Failed: Expected 100, but got " + assessment.getTotal());
        }
    }
}
