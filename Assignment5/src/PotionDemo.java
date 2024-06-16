import java.util.ArrayList;

public class PotionDemo {

    public static void main(String[] args)
    {
        Player player = new Player();
        PotionFactory factory = new PotionFactory();

        ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();
        ingredients.add(Ingredients.OIL);
        ingredients.add(Ingredients.VENOM);

        Potion newPotion = factory.craftPotion(ingredients);
        PotionSatchel.getInstance().addPotion(newPotion.getPotionName(), newPotion);

        System.out.println(newPotion.getPotionName());
    }
}
