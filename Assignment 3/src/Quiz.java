/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

public class Quiz extends Assessment {
    public Quiz(int total, int score) {
        super(total, score);
    }

    public String toString() {
        return "Quiz: " + score + "/" + total;
    }

    public static void main(String[] args) {
        // Regression tests
        Quiz quiz = new Quiz(50, 45);
        System.out.println(quiz.toString().equals("Quiz: 45/50") ? "Pass" : "Fail");
    }
}
