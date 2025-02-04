/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AchievementDemo {

    public static void main(String[] args)
    {
        // Create an object to read achievements from a text file
        AchievementFileReader reader = new AchievementFileReader();
        // Declare the achievement manager so it has scope to the entire main program
        AchievementManager manager = null;
        // Set up the scanner to read from console
        Scanner sc = new Scanner(System.in);

        // todo: there is a problem with this line that prevents the program from compiling. Fix it.
        try {
            manager = reader.readAchievements("Assignment4/achievements.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error reading achievements.txt: " + e.getMessage());
            manager = new AchievementManager();
        }


        boolean isQuit = false;

        while(!isQuit)
        {
            System.out.println("- - - - - -");
            System.out.println("Currently reading from " + reader.getCurrentFilePath());
            System.out.println("- - - - - -");
            System.out.println("Please make a selection:");
            System.out.println("\t 1. Save current achievement list");
            System.out.println("\t 2. Add an Achievement");
            System.out.println("\t 3. Print current achievement list");
            System.out.println("\t 0. Quit without saving");

            int choice = sc.nextInt();

            switch(choice)
            {
                case 0:
                    isQuit = true;
                    break;
                case 1:
                    // todo: there is a problem with this line that prevents the program from compiling. Fix it.
                    try {
                        reader.writeAchievements(manager);
                        System.out.println("Achievement saved successfully.");
                    } catch (FileNotFoundException e) {
                        System.out.println("Error saving achievements.txt: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter achievement name:");
                    // This line is needed to clear out any possible junk still in the Scanner Object
                    // It will not affect the program, but without it, reading achievementName will sometimes
                    // be skipped
                    sc.nextLine();
                    String achievementName = sc.nextLine();
                    System.out.println("Enter achievement description:");
                    String achievementDescription = sc.nextLine();
                    // todo: create a new achievement object and add it to the achievement manager
                    Achievement newAchievement = new Achievement(achievementName, achievementDescription);
                    manager.addAchievement(newAchievement);
                    System.out.println("Achievement added successfully.");
                    break;
                case 3:
                    System.out.println(manager);
                    break;
            }
        }
    }
}
