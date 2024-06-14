public class FailedPotion extends Potion{

    /**
     * Constructor, calls the constructor from the super class and sets potionName to indicate which specific type
     * of potion this is
     * @param value the value of this potion
     */
    public FailedPotion(int value) {
        super(value);
        this.potionName = PotionNames.FAILED;
    }

    /**
     * Makes the target drink this potion, and communicate the corresponding effect to the target
     * @param target the entity drinking this potion
     */
    @Override
    public void drink(Player target) {
        super.drink(target);
        target.randomEffect();
    }
}
