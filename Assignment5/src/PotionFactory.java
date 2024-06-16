/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

/**
 * A class that uses the Factory Design Pattern to abstract the creation/crafting of potions
 */
public class PotionFactory {

    /**
     * The factory method for creating a potion, given a list of ingredients
     * @param ingredients a List of the ingredients being combined
     * @return the crafted potion resulting from the list of ingredients
     */
    public Potion craftPotion(List<Ingredients> ingredients)
    {
        // Potion recipes mapped to ingredient sets
        Map<Set<Ingredients>, PotionNames> recipes = new HashMap<>();
        recipes.put(Set.of(Ingredients.PLANT, Ingredients.MINERAL), PotionNames.HEALING);
        recipes.put(Set.of(Ingredients.SPICE, Ingredients.VENOM), PotionNames.INVISIBILITY);
        recipes.put(Set.of(Ingredients.VENOM, Ingredients.MINERAL), PotionNames.POISON);
        recipes.put(Set.of(Ingredients.MINERAL, Ingredients.OIL), PotionNames.STRENGTH);

        // Ignore duplicates and order
        Set<Ingredients> ingredientSet = new HashSet<>(ingredients);

        // Check if ingredients match existing recipe or 'FAILED' as default
        PotionNames potionName = recipes.getOrDefault(ingredientSet, PotionNames.FAILED);
        switch (potionName) {
            case HEALING:
                return new HealingPotion(10);
            case INVISIBILITY:
                return new InvisibilityPotion(10);
            case POISON:
                return new PoisonPotion(10);
            case STRENGTH:
                return new StrengthPotion(10);
            default:
                return new FailedPotion(0);
        }
    }
}
