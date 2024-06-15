public class Player {

    /**
     * A placeholder stub for the effect from drinking a FailedPotion
     */
    public void randomEffect()
    {
        System.out.println("Something strange happened...");
    }

    // todo: add a method for each unique potion effect
    public void heal() {
        System.out.println("Player heals.");
    }

    public void strengthen() {
        System.out.println("Player's strength increases.");
    }

    public void becomeInvisible() {
        System.out.println("Player becomes invisible.");
    }

    public void takeDamage() {
        System.out.println("Player takes poison damage.");
    }

}
