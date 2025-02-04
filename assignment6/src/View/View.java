package View;

import Model.Marker;
import Model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Custom JFrame which also implements Observer, so the view can Observe the Model and receive updates
 *
 * Handles all the GUI parts of the program:
 *  - 3x3 grid of JButtons to represent the Tic-Tac-Toe board
 *  - A Label to indicate the winner
 *  - A Label to indicate which player's turn it currently is
 *  - A JButton to reset the game
 */
public class View extends JFrame implements Observer {

    /**
     * A 3x3 grid of JButtons to represent the tic-tac-toe board
     */
    private JButton[][] buttons;

    /**
     * A JLabel to display the current winner, or tie, if the game is over
     */
    private JLabel winLabel;

    /**
     * A JLabel to display which player's turn it currently is
     */
    private JLabel currentTurnLabel;

    /**
     * A JButton to restart a new game
     */
    private JButton resetGameButton;

    /**
     * Constructor, creates a new 2D array of JButtons, labels, and reset button
     *
     * All JComponents are added to a panel using a Grid Layout so they are organized in even cells
     *
     */
    public View()
    {
        buttons = new JButton[3][3];

        winLabel = new JLabel("");
        currentTurnLabel = new JLabel("Current Turn: X");
        resetGameButton = new JButton("Reset Game");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));

        panel.add(currentTurnLabel);
        panel.add(winLabel);
        panel.add(resetGameButton);

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                buttons[i][j] = new JButton("");
                panel.add(buttons[i][j]);
            }
        }
        this.setContentPane(panel);
    }


    /**
     * Method called by the observer pattern whenever the model changes.
     * @param o     the observable object.
     * @param arg   an argument passed to the {@code notifyObservers}
     *                 method.
     */
    @Override
    public void update(Observable o, Object arg) {
        // make sure the Observable object we are watching is the model (it should be)
        if(o instanceof Model)
        {
            // cast the parameter to type Model so the data can be extracted
            Model m = (Model)o;
            Marker[][] markers = m.getGameBoard();

            // iterate through the model's gameboard, and change all corresponding button labels to match
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<3; j++)
                {
                    String text = "";
                    switch(markers[i][j])
                    {
                        case X:
                            text = "X";
                            break;
                        case O:
                            text = "O";
                            break;
                    }
                    buttons[i][j].setText(text);
                }
            }

            //Set the winner label text
            if(m.getWinner() != null)
            {
                switch(m.getWinner())
                {
                    case X:
                        winLabel.setText("Winner:  X");
                        break;
                    case O:
                        winLabel.setText("Winner:  O");
                        break;
                    case NONE:
                        winLabel.setText("It's a tie!");
                        break;
                }
                currentTurnLabel.setText("Game Over");
            }
            else
            {
                winLabel.setText("");
                currentTurnLabel.setText("Current Turn: \n" + m.getCurrentTurn().toString());
            }


        }
    }

    /**
     * Assign an ActionListener to the button at the corresponding x,y coordinate
     * @param x x-coordinate for button location in grid
     * @param y y-coordinate for button location in grid
     * @param l ActionListener to be assigned to the corresponding button
     */
    public void assignButtonListener(int x, int y, ActionListener l)
    {
        buttons[x][y].addActionListener(l);
    }

    /**
     * Assign an ActionListener to the reset button
     * @param l an ActionListener to be assigned to the reset button
     */
    public void assignResetButtonListener(ActionListener l)
    {
        this.resetGameButton.addActionListener(l);
    }
}
