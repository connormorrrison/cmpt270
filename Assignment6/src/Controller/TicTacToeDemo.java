package Controller;

import Model.Model;
import View.View;

import javax.swing.*;

/**
 * Driver/Client class in which the main program is written
 */
public class TicTacToeDemo {

    /**
     * Main program. Creates classes for MVC architecture, sets up communication between the classes
     */
    public static void main(String[] args) {

        // Create the View class and configure it's JFrame settings
        View view = new View();
        view.setTitle("Tic-Tac-Toe");
        view.setSize(500, 500);
        view.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create the model object
        Model model = new Model();

        // Create the controller object, initialized with references to the model and view objects
        Controller controller = new Controller(model, view);

        // Add the view to the model's list of observers
        model.addObserver(view);

        // Notify the model's observers to the UI is updated to reflect model's initial data
        model.notifyObservers();

        // Make the GUI JFrame appear
        view.setVisible(true);
    }
}
