package sample;

import javax.swing.*;

public class Main extends JFrame{

    public static void main(String[] args) {
        //no need for a seperate class for the main window
        JFrame mainWindow = new JFrame();

        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null); //setting this will make sure that the window is always on the centre of the screen
        mainWindow.setSize(250, 250); //needs adjusting
    }
}
