package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ToDoListAll {
    // create an arraylist of ToDoLists, and then make an observable list of ToDoLists
    // Use FXCollections.observableList and have our ArrayList as the parameters
    public void addToDoList(ToDoList new_tdl){
        // use add method for ArrayLists
    }
    public void editToDoList(String user_input, String old_list){
        // Call the setter with user_input
        // Change the name of the list
    }
    public void removeToDoList(String name_to_remove){
         // call in a for loop the method to remove an Item from a dolist
        // This will remove all the items in that list, then remove the list using
        // ArrayList functions
    }
    public void displayLists(ToDoList select_tdl,boolean complete, boolean incomplete){
        // based on complete, incomplete
        // Will display the Items of a ToDoList using a For Loop
        // Realistically, each Item should have a "title" but not in requirements
    }
}

