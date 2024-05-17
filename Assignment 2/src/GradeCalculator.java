/*
Name: Morrison, Connor
NSID: tvi340
Student Number: 11374770
Course: CMPT 270-01 2024
*/

import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the course: ");
        String courseName = sc.nextLine();

        // Variables to store totals and counts of marks
        float assignmentTotal = 0;
        int assignmentCount = 0;
        float quizTotal = 0;
        int quizCount = 0;

        // Variables to store the marks for the midterm, lab exam, and final exam
        float midtermMark = 0;
        float labExamMark = 0;
        float finalExamMark = 0;

        while (true)
        {
            System.out.println("Menu:");
            System.out.println("1. Add assignment mark");
            System.out.println("2. Add quiz mark");
            System.out.println("3. Add midterm mark");
            System.out.println("4. Add lab exam mark");
            System.out.println("5. Add final exam mark");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter assignment mark: ");
                    float assignmentMark = sc.nextFloat();
                    assignmentTotal += assignmentMark;
                    assignmentCount++;
                    break;
                case 2:
                    System.out.print("Enter quiz mark: ");
                    float quizMark = sc.nextFloat();
                    quizTotal += quizMark;
                    quizCount++;
                    break;
                case 3:
                    System.out.print("Enter midterm mark: ");
                    midtermMark = sc.nextFloat();
                    break;
                case 4:
                    System.out.print("Enter lab exam mark: ");
                    labExamMark = sc.nextFloat();
                    break;
                case 5:
                    System.out.print("Enter final exam mark: ");
                    finalExamMark = sc.nextFloat();
                    break;
                case 6:
                    // Calculate the average marks for assignments and quizzes
                    float assignmentAverage = (assignmentCount == 0) ? 0 : assignmentTotal / assignmentCount;
                    float quizAverage = (quizCount == 0) ? 0 : quizTotal / quizCount;

                    // Calculate the final grade based on the weightings from the syllabus
                    float finalGrade = (assignmentAverage * 0.15f) +
                            (quizAverage * 0.05f) +
                            (midtermMark * 0.20f) +
                            (labExamMark * 0.15f) +
                            (finalExamMark * 0.45f);

                    System.out.println("\nCourse: " + courseName);
                    System.out.printf("Final Grade: %.2f\n", finalGrade);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}