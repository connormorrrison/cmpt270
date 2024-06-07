/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

/**
 * Achievement class models a single achievement in the game
 */
public class Achievement {
    private String achievementName;
    private String achievementDescription;
    private boolean isUnlocked;

    /**
     * Constructs an achievement with specified name and description
     * @param name the name of the achievement
     * @param description the description of the achievement
     */
    public Achievement(String name, String description) {
        this.achievementName = name;
        this.achievementDescription = description;
        this.isUnlocked = false;
    }

    /**
     * Returns the name of the achievement
     * @return the name of the achievement
     */
    public String getAchievementName() {
        return achievementName;
    }

    /**
     * Returns the description of the achievement
     * @return the description of the achievement
     */
    public String getAchievementDescription() {
        return achievementDescription;
    }

    /**
     * Returns the unlocked state of the achievement
     * @return true if the achievement is unlocked, false otherwise
     */
    public boolean getAchievementUnlocked() {
        return isUnlocked;
    }

    /**
     * Unlocks the achievement
     */
    public void unlockAchievement() {
        this.isUnlocked = true;
    }

    /**
     * Returns a string representation of the achievement
     * @return string representation of the achievement
     */
    @Override
    public String toString() {
        String status;
        if (isUnlocked) {
            status = "Unlocked";
        } else {
            status = "Locked";
        }

        String result = "";
        result += "Name: " + achievementName + "\n";
        result += "Description: " + achievementDescription + "\n";
        result += "Unlocked: " + status + "\n";
        return result;
    }

    /**
     * Main method to test Achievement class
     * @param args testing arguments
     */
    public static void main(String[] args) {
        // Regression test for 'Achievement(String name, String description)'
        Achievement a = new Achievement("Collected: Apple", "Collected 5 Apples");

        // Regression test for 'getAchievementName()'
        if (!a.getAchievementName().equals("Collected: Apple")) {
            System.out.println("Test 1 failed: getAchievementName()");
        }

        // Regression test for 'getAchievementDescription()'
        if (!a.getAchievementDescription().equals("Collected 5 Apples")) {
            System.out.println("Test 2 failed: getAchievementDescription()");
        }

        // Regression test for 'getAchievementUnlocked()'
        if (a.getAchievementUnlocked()) {
            System.out.println("Test 3 failed: getAchievementUnlocked() should be false initially");
        }

        // Regression test for 'unlockAchievement()'
        a.unlockAchievement();
        if (!a.getAchievementUnlocked()) {
            System.out.println("Test 4 failed: getAchievementUnlocked() after unlockAchievement()");
        }

//        // Regression test for 'toString()'
//        System.out.println(a);
    }
}
