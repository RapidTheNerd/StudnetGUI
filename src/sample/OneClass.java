package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class OneClass {

    public static void main(String[] args){
        //no need for a seperate class for the main window
        JFrame mainWindow = new JFrame();
        JPanel mainPanel = new JPanel();
        final JTextField studentID = new JTextField(); //text fields are a bit of a pain in the ass to get int values out of
        //but there's a way we can do that
        final JTextField studentCourse = new JTextField();
        final JTextField displayFiled = new JTextField();
        JButton addButton = new JButton();
        JButton displayButton = new JButton();


        //all components whether it is a textfield or a button need to be added to a panel, the panel is then added to the frame
        //although jframe has a add feature the components will show but wont function correctly.
        mainPanel.add(studentID);
        mainPanel.add(studentCourse);
        mainPanel.add(addButton);
        mainPanel.add(displayButton);
        mainPanel.add(displayFiled);
        mainWindow.add(mainPanel);//again these 2 need to be added for it to work

        addButton.setText("Add entry");
        addButton.setSize(20, 20);//change the size to your liking
        displayButton.setText("Display current entries");
        displayButton.setSize(20, 20);

        studentID.setColumns(10); // for some reason in Java the size of the textField is set in columns, not using setSize
        studentID.setSize(50, 50);
        studentID.setText("Student ID"); //we can add some text to signify what it is

        //same as above
        studentCourse.setText("Student course");
        studentCourse.setColumns(10);
        studentCourse.setSize(50, 50);


        displayFiled.setColumns(10);
        displayFiled.setEditable(false);
        displayFiled.setSize(50, 50);

        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setLocationRelativeTo(null); //setting this will make sure that the window is always on the centre of the screen
        mainWindow.setSize(350, 250); //needs adjusting

        //we need to read when the button is pressed so we call an action listener
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idInput = Integer.parseInt(studentID.getText());//parsing it to an integer allows us to check if it's > 0
                String courseInput = studentCourse.getText().toUpperCase(); //calling to upper case will mean that it doesn't care about capitals

                checkIfIsInArray(idInput, courseInput); //checking if they're already in the database

                if(idInput < 0){
                    createErrorFrame("Error: ID can't be less than 0");
                } else {
                    addToList(idInput, courseInput);
                    createErrorFrame("Added student " + idInput + " On course " + courseInput);
                    //might as well make it a little bit fancy :p
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                displayFiled.setText("ID: " + studentID.getText() + " " + "Course: " + studentCourse.getText());
            }
        });
    }


    private static HashMap<Integer, String> students = new HashMap<Integer, String>();

    private static void addToList(int id, String course){
        students.put(id, course);
    }

    public static void checkIfIsInArray(int id, String course){
        if(students.containsKey(id) && students.containsKey(course)){
            createErrorFrame("Error: The student already exists in the database");
        }
    }

    public static void createErrorFrame(String error){
        JFrame frame = new JFrame("Error");
        JPanel panel = new JPanel(); //panelings hold all our buttons, texts fields and such, they're then added to the frame
        JTextPane textPane = new JTextPane();

        panel.add(textPane);
        frame.add(panel); //panels need to be added to the frame
        textPane.setText(error); // calling back to the method so we can create custom error messages
        textPane.setEditable(false);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //setting this will make sure that the window is always on the centre of the screen
        frame.setSize(100, 100);
    }
    public static void createSuccessFrame(String message){
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
