/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

package Model;

import java.util.Observable;

/**
 * Model class in MVC architecture.
 *
 * Stores the data of the game state, and notifies the assigned views when the data changes.
 *
 * Game state data includes:
 *  - 2D grid gameBoard
 *  - Which Player's turn it currently is
 *  - The winner status, if the game is over
 */
public class Model extends Observable {

    /**
     * A 2D array of Marker enums, indicating which squares have been claimed by a player
     */
    private Marker[][] gameBoard;

    /**
     * A Marker enum indicating which player's turn it currently is
     */
    private Marker currentTurn;

    /**
     * A Marker enum indicating the winner (NONE if a tie, null if game is not over yet)
     */
    private Marker winner;


    /**
     * Constructor, initializes and sets up data.
     *
     * Assume Player X goes first
     * Winner initialized to null, indicating game not over yet
     * GameBoard starts out with all tiles initialized to NONE
     *
     */
    public Model()
    {
        // todo: initialize model data, use javadoc for guidelines
    }

    /**
     * Attempts to place a marker on a cell, using the Marker stored in current player's turn
     * @param x x-coordinate of cell attempting to place a marker
     * @param y y-coordinate of cell attempting to place a marker
     * @throws GameOverException if the game is over
     * @throws IllegalMarkerPlacementException if the gameBoard location provided is already occupied
     */
    public void setState(int x, int y) throws GameOverException, IllegalMarkerPlacementException
    {
        // todo: implement this method using the provided javadoc for guidelines
    }

    /**
     * Scan the gameBoard to determine if one player has won, or if the board is full and the game is a tie
     *
     * Player X or O has won the game if:
     *      One of the two diagonals all contain the same Marker (X or O)
     *      One of the Rows or Columns all contain the same Marker (X or O)
     *
     *      In the event a player wins, the 'winner' instance variable should be assigned to the corresponding Marker (X or O)
     *
     * If all the squares in the gameBoard are occupied by either X or O, but no match was found the game results in a tie
     *      In the event of a tie, the 'winner' instance variable should be assigned to the value 'NONE'
     *
     */
    private void detectWinner()
    {
        // todo: implement winner detection algorithm, see javadoc for guidelines
    }

    /**
     * Getter for the gameboard, 2D array of Markers
     * @return the 2D array of Markers
     */
    public Marker[][] getGameBoard()
    {
        return gameBoard;
    }

    /**
     * Getter for the player whose turn it currently is
     * @return the Marker for the current player
     */
    public Marker getCurrentTurn()
    {
        return this.currentTurn;
    }

    /**
     * Getter for the current winner:
     * @return X or O if a player won, NONE if the game tied, null if the game is not yet over
     */
    public Marker getWinner()
    {
        return this.winner;
    }

    /**
     * Resets the model to initial state to start a new game
     *
     * Winner should be set back to null
     * CurrentTurn should be set to X
     * All gameBoard cells should be reset to NONE
     *
     * Update needs to be sent to the View in order for the player to see the reset on the GUI
     */
    public void resetModel()
    {
        // todo: implement this method, use the javadoc for guidelines
    }
}
