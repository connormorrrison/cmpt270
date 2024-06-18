package Controller;

import Model.GameOverException;
import Model.IllegalMarkerPlacementException;
import Model.Model;
import View.View;

/**
 * Controller for game in MVC architecture.
 *
 * Contains references to the model to push updates, and view to assign ActionListeners
 * Creates a grid of action listeners and assigns them to the buttons making up the game board
 *
 * Contains method(s) to update the model in response to user actions/commands
 *
 */
public class Controller {

    /**
     * Reference to the model for the purpose of pushing updates in response to user actions
     */
    private Model model;

    /**
     * Reference to the view for the purpose of assigning ActionListeners to buttons
     */
    private View view;

    /**
     * Constructor, assign references to model and view.
     * Create 9 ButtonClickListeners and assign them to the 9 buttons making up the game board
     * @param m a reference to the model
     * @param v a reference to the main view
     */
    public Controller(Model m, View v)
    {
        this.model = m;
        this.view = v;

        // iterate through a 3x3 grid, creating a listener to assign to the button at corresponding i,j coordinates in the view
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                ButtonClickListener l = new ButtonClickListener(i, j, this);
                this.view.assignButtonListener(i, j, l);
            }
        }

        // Create and assign listener for the reset button
        ResetGameListener resetListener = new ResetGameListener(this);
        this.view.assignResetButtonListener(resetListener);
    }

    /**
     * Method called by ButtonClickListeners, directs user actions to the model
     * @param x x-coordinate of button clicked
     * @param y y-coordinate of button clicked
     */
    public void makeMove(int x, int y)
    {
        // The setState method throws an exception if the game is over
        // It also throws an exception if the specified location in the game board already contains a marker
        try
        {
            model.setState(x, y);
        }
        catch(GameOverException e)
        {
            System.out.println("Game Over, no more markers can be placed.");
        }
        catch(IllegalMarkerPlacementException e)
        {
            System.out.println("Illegal marker placement.");
        }
    }

    /**
     * Method called by ResetGameListener, directs message to the model to reset the game state and start a new game
     */
    public void resetGame()
    {
        model.resetModel();
    }




}
