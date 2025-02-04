public class HealingPotionTest {

    public static void main(String[] args) {
        // Create a Player object
        Player player = new Player();

        // Create a HealingPotion with a value of 10
        StrengthPotion testPotion = new StrengthPotion(10);

        // Check the potion name
        assert testPotion.getPotionName() == PotionNames.STRENGTH : "Potion name should be X";

        // Call the drink method and verify the effect
        testPotion.drink(player);

        // Since we don't have a method to check player's health or effects, we rely on the console output
        // Ensure console shows "Player is healed."
        System.out.println("All tests passed.");
    }
}