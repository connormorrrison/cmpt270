public class StrengthPotion extends Potion {
    public StrengthPotion(int value) {
        super(value);
        this.potionName = PotionNames.STRENGTH;
    }

    @Override
    public void drink(Player target) {
        super.drink(target);
        target.strengthEffect();
        System.out.println("You are strengthened!");
    }
}