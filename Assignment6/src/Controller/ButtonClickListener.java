package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Custom ActionListener class to respond to player selecting a grid button
 */
public class ButtonClickListener implements ActionListener {

    /**
     * X-coordinate of button in grid
     */
    private int x;

    /**
     * Y-coordinate of button in grid
     */
    private int y;

    /**
     * Reference to program's Controller
     */
    private Controller controller;

    /**
     * Constructor, initializes instance variables for x, y, and controller
     * @param x provided x-coordinate of button this listener is connected to
     * @param y provided y-coordinate of button this listener is connected to
     * @param c provided reference to controller object
     */
    public ButtonClickListener(int x, int y, Controller c) {
        this.x = x;
        this.y = y;
        this.controller = c;
    }

    /**
     * Implemented method from ActionListener interface.
     *
     * Call the 'makeMove' method on the controller, which will try to place a marker on the gameboard
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.controller.makeMove(this.x, this.y);
    }
}
