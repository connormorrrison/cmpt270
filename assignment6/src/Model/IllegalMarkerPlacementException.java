package Model;

/**
 * Custom exception to be thrown if the player is trying to place a marker at a square that is already occupied by a marker
 */
public class IllegalMarkerPlacementException extends Exception{

    public IllegalMarkerPlacementException(){}

    public IllegalMarkerPlacementException(String message){
        super(message);
    }
}
