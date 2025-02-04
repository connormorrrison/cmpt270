package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Custom ActionListener to respond to Reset Game button
 */
public class ResetGameListener implements ActionListener {

    /**
     * Reference to the program's controller object
     */
    private Controller controller;

    /**
     * Constructor, assign provided reference to controller instance variable
     * @param controller a reference to the program's controller object
     */
    public ResetGameListener(Controller controller) {
        this.controller = controller;
    }

    /**
     * Implemented method from ActionListener interface.
     *
     * Call the 'resetGame' method on the controller, which will reset the game board and start a new game
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        controller.resetGame();
    }
}
