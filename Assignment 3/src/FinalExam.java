/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 *
 */
public class FinalExam extends Exam {
    /**
     *
     * @param total
     * @param score
     */
    public FinalExam(int total, int score) {
        super(total, score);
    }

    /**
     *
     * @return
     */
    public String toString() {
        return "Final Exam: " + score + "/" + total;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Regression tests
        FinalExam finalExam = new FinalExam(100, 90);
        System.out.println(finalExam.toString().equals("Final Exam: 90/100") ? "Pass" : "Fail");
    }
}
