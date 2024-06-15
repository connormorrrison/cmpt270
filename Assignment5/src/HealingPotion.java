public class HealingPotion extends Potion {
    public HealingPotion(int value) {
        super(value);
        this.potionName = PotionNames.HEALING;
    }

    @Override
    public void drink(Player target) {
        super.drink(target);
        System.out.println("You are healed!");
    }
}