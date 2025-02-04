/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

import java.util.Arrays;

/**
 * Represents a course with assignments, quizzes, midterm, lab exam and final exam
 */
public class Course {
    private String courseName;
    private Assignment[] assignments;
    private int assignmentIdx;
    private Quiz[] quizzes;
    private int quizIdx;
    private Midterm midterm;
    private LabExam labExam;
    private FinalExam finalExam;

    /**
     * Constructs a Course with a name, number of assignments and number of quizzes
     * @param name the name of the course
     * @param numAssignments the number of assignments
     * @param numQuizzes the number of quizzes
     */
    public Course(String name, int numAssignments, int numQuizzes) {
        this.courseName = name;
        this.assignments = new Assignment[numAssignments];
        this.assignmentIdx = 0;
        this.quizzes = new Quiz[numQuizzes];
        this.quizIdx = 0;
    }

    /**
     * Adds an assignment to the course
     * @param total the total possible score for the assignment
     * @param score the score obtained on the assignment
     */
    public void addAssignment(int total, int score) {
        if (this.assignmentIdx < this.assignments.length) {
            this.assignments[this.assignmentIdx] = new Assignment(total, score);
            this.assignmentIdx++;
        }
    }

    /**
     * Adds a quiz to the course
     * @param total the total possible score for the quiz
     * @param score the score obtained on the quiz
     */
    public void addQuiz(int total, int score) {
        if (this.quizIdx < this.quizzes.length) {
            this.quizzes[this.quizIdx] = new Quiz(total, score);
            this.quizIdx++;
        }
    }

    /**
     * Adds a midterm to the course
     * @param total the total possible score for the midterm
     * @param score the score obtained on the midterm
     */
    public void addMidterm(int total, int score) {
        this.midterm = new Midterm(total, score);
    }

    /**
     * Adds a lab exam to the course
     * @param total the total possible score for the lab exam
     * @param score the score obtained on the lab exam
     */
    public void addLabExam(int total, int score) {
        this.labExam = new LabExam(total, score);
    }

    /**
     * Adds a final exam to the course
     * @param total the total possible score for the final exam
     * @param score the score obtained on the final exam
     */
    public void addFinalExam(int total, int score) {
        this.finalExam = new FinalExam(total, score);
    }

    /**
     * Calculates and returns the final grade for the cours
     * @return the final grade for the course
     */
    public double getFinalGrade() {
        double assignmentScore = 0;
        double assignmentTotal = 0;
        for (Assignment assignment : this.assignments) {
            if (assignment != null) {
                assignmentScore += assignment.getScore();
                assignmentTotal += assignment.getTotal();
            }
        }

        double quizScore = 0;
        double quizTotal = 0;
        for (Quiz quiz : this.quizzes) {
            if (quiz != null) {
                quizScore += quiz.getScore();
                quizTotal += quiz.getTotal();
            }
        }

        // Calculate assignment percentage from aggregate marks
        double assignmentPercentage;
        if (assignmentTotal == 0) {
            assignmentPercentage = 0;
        } else {
            assignmentPercentage = (assignmentScore / assignmentTotal) * 100;
        }

        // Calculate quiz percentage from aggregate marks
        double quizPercentage;
        if (quizTotal == 0) {
            quizPercentage = 0;
        } else {
            quizPercentage = (quizScore / quizTotal) * 100;
        }

        double midtermPercentage;
        if (this.midterm == null) {
            midtermPercentage = 0;
        } else {
            midtermPercentage = this.midterm.getPercentage();
        }

        double labExamPercentage;
        if (this.labExam == null) {
            labExamPercentage = 0;
        } else {
            labExamPercentage = this.labExam.getPercentage();
        }

        double finalExamPercentage;
        if (this.finalExam == null) {
            finalExamPercentage = 0;
        } else {
            finalExamPercentage = this.finalExam.getPercentage();
        }

        double finalGrade = (assignmentPercentage * 0.15) +
                (quizPercentage * 0.05) +
                (midtermPercentage * 0.20) +
                (labExamPercentage * 0.15) +
                (finalExamPercentage * 0.45);

        return finalGrade;
    }

    /**
     * Returns the name of the course
     * @return the name of the course
     */
    public String getCourseName() {
        return this.courseName;
    }

    /**
     * Returns a string representation of the course
     * @return string representation of the course
     */
    public String toString() {
        return "Course: " + this.courseName + "\n" +
                "Assignments: " + Arrays.toString(this.assignments) + "\n" +
                "Quizzes: " + Arrays.toString(this.quizzes) + "\n" +
                "Midterm: " + this.midterm + "\n" +
                "Lab Exam: " + this.labExam + "\n" +
                "Final Exam: " + this.finalExam;
    }

    /**
     * Main method for regression testing
     * @param args testing arguments
     */
    public static void main(String[] args) {
        // Regression test for '+ Course(name : String, numAssignments : int, numQuizzes : int)'
        Course course = new Course("CMPT 270", 3, 2);

        // Regression test for '+ addAssignment(total : int, score : int) : void'
        course.addAssignment(100, 85);
        course.addAssignment(100, 90);
        course.addAssignment(100, 95);
        if (course.assignments.length == 3 &&
                course.assignments[0].getScore() == 85 &&
                course.assignments[1].getScore() == 90 &&
                course.assignments[2].getScore() == 95) {
            System.out.println("addAssignment() Test: Passed");
        } else {
            System.out.println("addAssignment() Test: Failed");
        }

        // Regression test for '+ addQuiz(total : int, score : int) : void'
        course.addQuiz(50, 45);
        course.addQuiz(50, 40);
        if (course.quizzes.length == 2 &&
                course.quizzes[0].getScore() == 45 &&
                course.quizzes[1].getScore() == 40) {
            System.out.println("addQuiz() Test: Passed");
        } else {
            System.out.println("addQuiz() Test: Failed");
        }

        // Regression test for '+ addMidterm(total : int, score : int) : void'
        course.addMidterm(100, 80);
        if (course.midterm != null && course.midterm.total == 100 && course.midterm.score == 80) {
            System.out.println("addMidterm() Test: Passed");
        } else {
            System.out.println("addMidterm() Test: Failed");
        }

        // Regression test for '+ addLabExam(total : int, score : int) : void'
        course.addLabExam(100, 85);
        if (course.labExam != null && course.labExam.total == 100 && course.labExam.score == 85) {
            System.out.println("addLabExam() Test: Passed");
        } else {
            System.out.println("addLabExam() Test: Failed");
        }

        // Regression test for '+ addFinalExam(total : int, score : int) : void'
        course.addFinalExam(100, 90);
        if (course.finalExam != null && course.finalExam.total == 100 && course.finalExam.score == 90) {
            System.out.println("addFinalExam() Test: Passed");
        } else {
            System.out.println("addFinalExam() Test: Failed");
        }

        // Regression test for '+ getFinalGrade() : double'
        double finalGrade = course.getFinalGrade();
        double expectedFinalGrade = 87.00;
        if (finalGrade == expectedFinalGrade) {
            System.out.println("getFinalGrade() Test: Passed");
        } else {
            System.out.println("getFinalGrade() Test: Failed: Expected " + expectedFinalGrade + ", but got " + finalGrade);
        }

        // Regression test for '+ getCourseName() : String'
        String courseName = course.getCourseName();
        if (courseName.equals("CMPT 270")) {
            System.out.println("getCourseName() Test: Passed");
        } else {
            System.out.println("getCourseName() Test: Failed: Expected 'CMPT 270', but got " + courseName);
        }
    }
}
