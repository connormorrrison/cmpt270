public class InvisibilityPotion extends Potion {
    public InvisibilityPotion(int value) {
        super(value);
        this.potionName = PotionNames.INVISIBILITY;
    }

    @Override
    public void drink(Player target) {
        super.drink(target);
        target.invisibilityEffect();
        System.out.println("You are invisible!");
    }
}