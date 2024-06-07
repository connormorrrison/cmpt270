/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AchievementManager {

    /**
     * Map storing all achievements, keyed by unique IDs
     */
    private Map<Integer, Achievement> achievements;

    /**
     * Constructor, sets up achievements Map
     */
    public AchievementManager() {
        // todo: set up achievements class variable as a HashMap
        achievements = new HashMap<>();
    }

    /**
     * Adds a new achievement
     * @param achievement the achievement object to be added
     * @throws IllegalArgumentException if achievement is null
     */
    public void addAchievement(Achievement achievement) {
        // todo: adds achievement to achievements map, key should be next available integer
        if (achievement == null) {
            throw new IllegalStateException("Achievement cannot be null.");
        }

        // Find next available key
        int nextId = achievements.size() + 1;
        while (achievements.containsKey(nextId)) {
            nextId++;
        }
        achievements.put(nextId, achievement);
    }

    /**
     * Gets an achievement corresponding to specified id
     * @param id the unique identifier for the achievement
     * @return the achievement corresponding to the provided id
     * @throws IllegalArgumentException if id does not exist in collection
     */
    public Achievement getAchievement(int id)
    {
        // todo: returns Achievement object stored in map with specified integer key
        if (!achievements.containsKey(id)) {
            throw new IllegalStateException("Achievement does not exist.");
        }

	    // this is here for stub purposes, remove and replace with correct return
        return achievements.get(id);
    }

    /**
     * Returns a List of all achievements that are currently locked
     * @return a List containing all currently locked achievements
     */
    public List<Achievement> getLockedAchievements()
    {
        // todo: implement this method
        List<Achievement> lockedAchievements = new ArrayList<>();
        for (Achievement achievement : achievements.values()) {
            if (!achievement.getAchievementUnlocked()) {
                lockedAchievements.add(achievement);
            }
        }

        // this is here for stub purposes, remove and replace with correct return
        return lockedAchievements;
    }

    /**
     * Returns a list of all achievements that are currently unlocked
     * @return A List containing all currently unlocked achievements
     */
    public List<Achievement> getUnlockedAchievements()
    {
        // todo: implement this method
        List<Achievement> unlockedAchievements = new ArrayList<>();
        for (Achievement achievement : achievements.values()) {
            if (achievement.getAchievementUnlocked()) {
                unlockedAchievements.add(achievement);
            }
        }

        // this is here for stub purposes, remove and replace with correct return statement
        return unlockedAchievements;
    }

    /**
     * Returns a list of all Achievement objects currently stored in the map
     * @return a List of Achievements
     */
    public List<Achievement> getAllAchievements()
    {
        // Create a new ArrayList
        List<Achievement> a = new ArrayList<Achievement>();
        // Iterate through all achievements stored in the map
        for(Achievement achievement : achievements.values())
        {
            // Add each achievement to the end of the List
            a.add(achievement);
        }
        // Return the List containing all Achievements
        return a;
    }

    /**
     * Returns a list containing all integer keys
     * @return a List of Integers
     */
    public List<Integer> getAllKeys()
    {
        // Create a new Array List
        List<Integer> keys = new ArrayList<Integer>();
        // Iterate through all keys in the map
        for(int key: achievements.keySet())
        {
            // add each unique integer key to the list
            keys.add(key);
        }
        // return the final list of keys
        return keys;
    }

    /**
     * Returns a string representation of the AchievementManager object
     * Should display each achievement with its associated id
     * @return the string representation
     */
    public String toString()
    {
        // todo: implement the toString method
        String result = "";
        for (Map.Entry<Integer, Achievement> entry : achievements.entrySet()) {
            result += "ID: " + entry.getKey() + "\n" +
                    "Name: " + entry.getValue().getAchievementName() + "\n" +
                    "Description: " + entry.getValue().getAchievementDescription() + "\n" +
                    "Unlocked: " + (entry.getValue().getAchievementUnlocked() ? "Yes" : "No") + "\n\n";
        }

        // this return statement is here for stub purposes. Replace with actual return string
        return result;
    }

    /**
     * Regression testing
     * @param args
     */
    public static void main(String[] args)
    {
        // todo: write regression test for all of the methods that YOU had to implement
        // there is no need to test the methods that were already implemented

        // Regression test for 'AchievementManager()'
        AchievementManager manager = new AchievementManager();

        // Regression test for 'addAchievement(Achievement achievement)'
        Achievement a1 = new Achievement("Complete Level 1", "Successfully finish the first level.");
        manager.addAchievement(a1);
        if (manager.getAllAchievements().size() != 1) {
            System.out.println("Test failed: addAchievement(Achievement achievement)");
        }

        // Regression test for 'getAchievement(int id)'
        try {
            Achievement a = manager.getAchievement(1);
            if (!a.getAchievementName().equals("Complete Level 1")) {
                System.out.println("Test failed: getAchievement(int id)");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Test failed: getAchievement(int id)");
        }

        // Regression test for 'getLockedAchievements()'
        Achievement a2 = new Achievement("Complete Level 2", "Successfully finish the second level.");
        manager.addAchievement(a2);
        List<Achievement> lockedAchievements = manager.getLockedAchievements();
        if (lockedAchievements.size() != 2) {
            System.out.println("Test failed: getLockedAchievements()");
        }

        // Regression test for 'getUnlockedAchievements()'
        a1.unlockAchievement();
        List<Achievement> unlockedAchievements = manager.getUnlockedAchievements();
        if (unlockedAchievements.size() != 1) {
            System.out.println("Test failed: getUnlockedAchievements()");
        }

        // Regression test for 'toString()'
        System.out.println("AchievementManager toString() output:");
        System.out.println(manager.toString());

    }
}
