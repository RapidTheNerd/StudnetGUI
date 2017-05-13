package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    public static void main(String[] args) {
        //no need for a seperate class for the main window
        JFrame mainWindow = new JFrame();
        JPanel mainPanel = new JPanel();
        final JTextField studentID = new JTextField(); //text fields are a bit of a pain in the ass to get int values out of
        //but there's a way we can do that

        mainPanel.add(studentID);
        mainWindow.add(mainPanel);//again these 2 need to be added for it to work

        studentID.setColumns(10); // for some reason in Java the size of the textField is set in columns, not using setSize
        studentID.setSize(50, 50);
        studentID.setToolTipText("Student ID"); //we can add some text to signify what it is

        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null); //setting this will make sure that the window is always on the centre of the screen
        mainWindow.setSize(250, 250); //needs adjusting

        //here we're going to listen out for the users input and check if it's correct for the ID
        studentID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idInput = Integer.parseInt(studentID.getText()); //parsing it to an integer allows us to check if it's > 0
                if(idInput > 0){
                    ErrorWindow.createErrorWindow("Error: ID can't be less than 0");
                }
            }
        });
    }
}
