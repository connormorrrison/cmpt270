/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PotionSatchel {

    /**
     * A Map that is keyed by a PotionName, and stores a list of all potions that have been created of that type
     */
    private Map<PotionNames, ArrayList<Potion>> potions;

    // Singleton instance
    private static PotionSatchel instance = null;

    /**
     * Constructor, create a new HashMap to store the potions in
     */
    private PotionSatchel() {
        potions = new HashMap<PotionNames, ArrayList<Potion>>();
    }

    /**
     * Returns a single instance of the PotionSatchel class, or creates instance if it doesn't exist already
     * @return the single instance of PotionSatchel class
     */
    public static PotionSatchel getInstance() {
        if (instance == null) {
            instance = new PotionSatchel();
        }
        return instance;
    }

    /**
     * Add a potion to the potion satchel
     * @param name the PotionName indicating the type of potion being added
     * @param potion the potion object trying to be added to the satchel
     * @throws IllegalArgumentException if potion is null
     */
    public void addPotion(PotionNames name, Potion potion) {
        if (potion == null) {
            throw new IllegalArgumentException("Potion cannot be null");
        }

        // If there is no entry for the potion name, create a new list for this potion
        if (!potions.containsKey(name)) {
            potions.put(name, new ArrayList<>());
        }

        // Add the potion to the list associated with the potion name
        potions.get(name).add(potion);
    }

    /**
     * Removes a potion from the satchel and the provided player drinks it
     * @param name the PotionName, indicating the type of potion to drink
     * @param player a mock Player object, indicating the character who will be drinking this potion
     * @throws NotInInventoryException if no potions of the correct type exist in the inventory
     * @throws IllegalArgumentException if player is null
     */
    public void consumePotion(PotionNames name, Player player) throws NotInInventoryException {
        if (player == null) {
            throw new IllegalArgumentException("Player cannot be null");
        }

        // Check if the potion is in the inventory
        if (!potions.containsKey(name) || potions.get(name).isEmpty()) {
            throw new NotInInventoryException("No potions of type " + name + " in inventory");
        }

        // Potion is in inventory, consume it
        Potion potion = potions.get(name).remove(0);
        potion.drink(player);
    }

//    public static void main(String[] args) {
//        // Regression test for 'PotionSatchel()'
//        PotionSatchel constructorTest = new PotionSatchel();
//        assert constructorTest != null : "PotionSatchel instance creation failed";
//
//        // Regression test for 'getInstance()'
//        PotionSatchel singletonTest = PotionSatchel.getInstance();
//        assert singletonTest != null : "Singleton instance creation failed";
//        assert singletonTest == PotionSatchel.getInstance() : "Singleton instances do not match";
//
//        // Regression test for 'addPotion(PotionNames name, Potion potion)'
//        Potion healingPotion = new HealingPotion(10);
//        singletonTest.addPotion(PotionNames.HEALING, healingPotion);
//        assert singletonTest.potions.get(PotionNames.HEALING).contains(healingPotion) : "Healing potion was not added to the satchel";
//
//        // Regression test for 'consumePotion(PotionNames name, Player player)'
//        Player player = new Player();
//        try {
//            singletonTest.consumePotion(PotionNames.HEALING, player);
//            assert !singletonTest.potions.get(PotionNames.HEALING).contains(healingPotion) : "Healing potion was not consumed from the satchel";
//        } catch (NotInInventoryException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
