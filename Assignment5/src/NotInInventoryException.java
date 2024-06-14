/**
 * A custom exception for the scenario where an item is attempted to be removed from the player's inventory but does
 * not exist.
 */
public class NotInInventoryException extends Exception{

    public NotInInventoryException(String message){
        super(message);
    }
}
