/*
Name: Morrison, Connor
NSID: tvi340
Student Number: 11374770
Course: CMPT 270-01 2024
*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for course name
        System.out.print("Enter the name of the course: ");
        String courseName = sc.nextLine();

        // Variables to store assessment totals and mark counts
        float assignmentTotal = 0;
        float assignmentPossibleTotal = 0;
        float quizTotal = 0;
        float quizPossibleTotal = 0;
        float midtermTotal = 0;
        float midtermPossibleTotal = 0;
        float labExamTotal = 0;
        float labExamPossibleTotal = 0;
        float finalExamTotal = 0;
        float finalExamPossibleTotal = 0;

        while (true) {
            // Display menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add assignment mark");
            System.out.println("2. Add quiz mark");
            System.out.println("3. Add midterm mark");
            System.out.println("4. Add lab exam mark");
            System.out.println("5. Add final exam mark");
            System.out.println("6. Quit");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            // Handle menu choice
            switch (choice) {
                case 1:
                    // Add assignment mark
                    System.out.print("Enter assignment mark: ");
                    float assignmentMark = sc.nextFloat();
                    System.out.print("Enter total possible marks for this assignment: ");
                    float assignmentPossibleMarks = sc.nextFloat();
                    assignmentTotal += assignmentMark;
                    assignmentPossibleTotal += assignmentPossibleMarks;
                    break;
                case 2:
                    // Add quiz mark
                    System.out.print("Enter quiz mark: ");
                    float quizMark = sc.nextFloat();
                    System.out.print("Enter total possible marks for this quiz: ");
                    float quizPossibleMarks = sc.nextFloat();
                    quizTotal += quizMark;
                    quizPossibleTotal += quizPossibleMarks;
                    break;
                case 3:
                    // Add one midterm mark
                    System.out.print("Enter midterm mark: ");
                    midtermTotal = sc.nextFloat();
                    System.out.print("Enter total possible marks for the midterm: ");
                    midtermPossibleTotal = sc.nextFloat();
                    break;
                case 4:
                    // Add one lab exam mark
                    System.out.print("Enter lab exam mark: ");
                    labExamTotal = sc.nextFloat();
                    System.out.print("Enter total possible marks for the lab exam: ");
                    labExamPossibleTotal = sc.nextFloat();
                    break;
                case 5:
                    // Add one final exam mark
                    System.out.print("Enter final exam mark: ");
                    finalExamTotal = sc.nextFloat();
                    System.out.print("Enter total possible marks for the final exam: ");
                    finalExamPossibleTotal = sc.nextFloat();
                    break;
                case 6:
                    // Calculate average marks for assignments
                    float assignmentAverage;
                    if (assignmentPossibleTotal == 0) {
                        assignmentAverage = 0;
                    } else {
                        assignmentAverage = (assignmentTotal / assignmentPossibleTotal) * 100;
                    }

                    // Calculate average marks for quizzes
                    float quizAverage;
                    if (quizPossibleTotal == 0) {
                        quizAverage = 0;
                    } else {
                        quizAverage = (quizTotal / quizPossibleTotal) * 100;
                    }

                    float midtermAverage;
                    if (midtermPossibleTotal == 0) {
                        midtermAverage = 0;
                    } else {
                        midtermAverage = (midtermTotal / midtermPossibleTotal) * 100;
                    }

                    float labExamAverage;
                    if (labExamPossibleTotal == 0) {
                        labExamAverage = 0;
                    } else {
                        labExamAverage = (labExamTotal / labExamPossibleTotal) * 100;
                    }

                    float finalExamAverage;
                    if (finalExamPossibleTotal == 0) {
                        finalExamAverage = 0;
                    } else {
                        finalExamAverage = (finalExamTotal / finalExamPossibleTotal) * 100;
                    }

                    // Calculate the final grade per weightings
                    float finalGrade = (assignmentAverage * 0.15f) +
                            (quizAverage * 0.05f) +
                            (midtermAverage * 0.20f) +
                            (labExamAverage * 0.15f) +
                            (finalExamAverage * 0.45f);

                    // Print out the course name and final grade
                    System.out.println("\nCourse: " + courseName);
                    System.out.printf("Final Grade: %.2f%%\n", finalGrade);
                    sc.close();
                    return;
                default:
                    // Invalid menu choice
                    System.out.println("Invalid choice.");
            }
        }
    }
}
