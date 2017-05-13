package sample;

import javax.swing.*;

public class SuccessWindow extends JFrame {

    //this class is pretty much the same as the error window

    public static void createSuccessWindow(String message){
        //defining the error message in the method allows us to create custom error messages without having to create multiple windows
        JFrame frame = new JFrame("Error");
        JPanel panel = new JPanel(); //panelings hold all our buttons, texts fields and such, they're then added to the frame
        JTextPane textPane = new JTextPane();

        panel.add(textPane);
        frame.add(panel); //panels need to be added to the frame
        textPane.setText(message); // calling back to the method so we can create custom error messages
        textPane.setEditable(false);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //setting this will make sure that the window is always on the centre of the screen
        frame.setSize(200, 100); //needs adjusting

    }
}
