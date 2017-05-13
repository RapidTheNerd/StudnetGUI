package sample;
import java.util.HashMap;

public class Database {
    /***
     * To make the code more efficient and clean we can use multiple classes to store and maintain systems such as this.
     * It allows us later on the add and change values in the class without having to go through one class digging for it
     */
    private static HashMap<Integer, String> students = new HashMap<Integer, String>();

    public static void addToList(int id, String course){
        students.put(id, course);
    }
    public static void checkIfIsInAlready(int id, String course){
        if(students.containsKey(id) && students.containsKey(course)){

        }
    }
}
