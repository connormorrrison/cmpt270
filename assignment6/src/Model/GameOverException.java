package Model;

/**
 * Custom exception to be thrown if the game is over but player still trying to interact with gameboard
 */
public class GameOverException extends Exception{

    public GameOverException(){}

    public GameOverException(String message){
        super(message);
    }
}
