public class PoisonPotion extends Potion {
    public PoisonPotion(int value) {
        super(value);
        this.potionName = PotionNames.POISON;
    }

    @Override
    public void drink(Player target) {
        super.drink(target);
        System.out.println("You are poisoned!");
    }
}