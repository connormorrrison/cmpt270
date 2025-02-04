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
        // Initialize game board
        gameBoard = new Marker[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = Marker.NONE;
            }
        }

        // Initialize current turn
        currentTurn = Marker.X;

        // Initialize winner to null
        winner = null;
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
        // Check if game is already over
        if (winner != null) {
            throw new GameOverException("The game is over.");
        }

        // Check if the spot has already been taken
        if (gameBoard[x][y] != Marker.NONE) {
            throw new IllegalMarkerPlacementException("This cell is already occupied.");
        }

        // Update cell with current player's marker
        gameBoard[x][y] = currentTurn;

        // Detect the winner
        detectWinner();

        // Switch the turn
        if (currentTurn == Marker.X) {
            currentTurn = Marker.O;
        } else {
            currentTurn = Marker.X;
        }

        // Notify observers
        setChanged();
        notifyObservers();
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
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2] && gameBoard[i][0] != Marker.NONE) {
                winner = gameBoard[i][0];
                return;
            }
            if (gameBoard[0][i] == gameBoard[1][i] && gameBoard[1][i] == gameBoard[2][i] && gameBoard[0][i] != Marker.NONE) {
                winner = gameBoard[0][i];
                return;
            }
        }

        // Check diagonals
        if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] != Marker.NONE) {
            winner = gameBoard[0][0];
            return;
        }
        if (gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0] && gameBoard[0][2] != Marker.NONE) {
            winner = gameBoard[0][2];
            return;
        }

        // Check for a tie
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameBoard[i][j] == Marker.NONE) {
                    isFull = false;
                    break;
                }
            }
        }
        if (isFull) {
            winner = Marker.NONE;
        }
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
        // Reset the gameBoard
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameBoard[i][j] = Marker.NONE;
            }
        }

        // Reset the current turn to X
        currentTurn = Marker.X;

        // Reset the winner to null
        winner = null;

        // Notify observers
        setChanged();
        notifyObservers();
    }
}
