/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

public class Assessment {
    protected int total;
    protected int score;

    public Assessment(int total, int score) {
        this.total = total;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        // Regression tests
        Assessment assessment = new Assessment(100, 75);
        System.out.println(assessment.getScore() == 75 ? "Pass" : "Fail");
        System.out.println(assessment.getTotal() == 100 ? "Pass" : "Fail");
    }
}
