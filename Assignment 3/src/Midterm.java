/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

public class Midterm extends Exam {
    public Midterm(int total, int score) {
        super(total, score);
    }

    public String toString() {
        return "Midterm: " + score + "/" + total;
    }

    public static void main(String[] args) {
        // Regression tests
        Midterm midterm = new Midterm(100, 80);
        System.out.println(midterm.toString().equals("Midterm: 80/100") ? "Pass" : "Fail");
    }
}
