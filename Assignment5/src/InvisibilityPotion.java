/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

public class InvisibilityPotion extends Potion {
    /**
     * Constructor, calls the constructor from the super class and sets potionName to indicate which specific type
     * of potion this is
     * @param value the value of this potion
     */
    public InvisibilityPotion(int value) {
        super(value);
        this.potionName = PotionNames.INVISIBILITY;
    }

    /**
     * Makes the target drink this potion, and communicate the corresponding effect to the target
     * @param target the entity drinking this potion
     */
    @Override
    public void drink(Player target) {
        super.drink(target);
        target.invisibilityEffect();
    }
}