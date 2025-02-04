import java.util.List;

public class PotionFactoryTest {

    public static void main(String[] args) {
        PotionFactory factory = new PotionFactory();

        // Test HealingPotion
        List<Ingredients> healingIngredients = List.of(Ingredients.PLANT, Ingredients.MINERAL);
        Potion healingPotion = factory.craftPotion(healingIngredients);
        assert healingPotion instanceof HealingPotion : "Failed to create HealingPotion";

        // Test InvisibilityPotion
        List<Ingredients> invisibilityIngredients = List.of(Ingredients.SPICE, Ingredients.VENOM);
        Potion invisibilityPotion = factory.craftPotion(invisibilityIngredients);
        assert invisibilityPotion instanceof InvisibilityPotion : "Failed to create InvisibilityPotion";

        // Test PoisonPotion
        List<Ingredients> poisonIngredients = List.of(Ingredients.VENOM, Ingredients.MINERAL);
        Potion poisonPotion = factory.craftPotion(poisonIngredients);
        assert poisonPotion instanceof PoisonPotion : "Failed to create PoisonPotion";

        // Test StrengthPotion
        List<Ingredients> strengthIngredients = List.of(Ingredients.MINERAL, Ingredients.OIL);
        Potion strengthPotion = factory.craftPotion(strengthIngredients);
        assert strengthPotion instanceof StrengthPotion : "Failed to create StrengthPotion";

        // Test FailedPotion
        List<Ingredients> unknownIngredients = List.of(Ingredients.MINERAL, Ingredients.SPICE);
        Potion failedPotion = factory.craftPotion(unknownIngredients);
        assert failedPotion instanceof FailedPotion : "Failed to create FailedPotion";

        System.out.println("All tests passed.");
    }
}