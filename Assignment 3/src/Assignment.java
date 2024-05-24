/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

public class Assignment extends Assessment {
    public Assignment(int total, int score) {
        super(total, score);
    }

    public String toString() {
        return "Assignment: " + score + "/" + total;
    }

    public static void main(String[] args) {
        // Regression tests
        Assignment assignment = new Assignment(100, 90);
        System.out.println(assignment.toString().equals("Assignment: 90/100") ? "Pass" : "Fail");
    }
}
