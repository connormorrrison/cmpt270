import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PotionSatchel {

    /**
     * A Map that is keyed by a PotionName, and stores a list of all potions that have been created of that type
     */
    private Map<PotionNames, ArrayList<Potion>> potions;

    private static PotionSatchel instance = null;

    /**
     * Constructor, create a new HashMap to store the potions in
     */
    private PotionSatchel() {
        potions = new HashMap<PotionNames, ArrayList<Potion>>();
    }

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
        // todo: add the details for this
        if (potions == null) {
            throw new IllegalArgumentException("Potions cannot be null");
        }
        ArrayList<Potion> potionList = potions.get(name);
        if (potionList == null) {
            potionList = new ArrayList<>();
            potions.put(name, potionList);
        }
        potionList.add(potion);
    }

    /**
     * Removes a potion from the satchel and the provided player drinks it
     * @param name the PotionName, indicating the type of potion to drink
     * @param player a mock Player object, indicating the character who will be drinking this potion
     * @throws NotInInventoryException if no potions of the correct type exist in the inventory
     * @throws IllegalArgumentException if player is null
     */
    public void consumePotion(PotionNames name, Player player) throws NotInInventoryException {
        // todo: add the details for this
        if (player == null) {
            throw new IllegalArgumentException("Player cannot be null");
        }

        ArrayList<Potion> potionList = potions.get(name);
        if (potionList == null) {
            throw new NotInInventoryException("No potions of type " + name + " in inventory");
        }
        if (potionList.isEmpty()) {
            throw new NotInInventoryException("No potions of type " + name + " in inventory");
        }

        Potion potion = potionList.remove(potionList.size() - 1);
        potion.drink(player);

        if (potionList.isEmpty()) {
            potions.remove(name);
        }
    }
}
