package ucf.assignments;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    //private String name;
    // create an arraylist of items, and then make an observable list of items
    // Use FXCollections.observableList and have our ArrayList as the parameters
    public void addItem(Items Item_to_add){
        // set the Item parameters with their setter functions
        // use add method for ArrayLists
    }
    public void editItem(Items Item_to_edit, String DueDate, String Description){
        // Call the Item setter function for whatever properties to edit with the user input
    }
    public void removeItem(String item_name){
        // Use ArrayList functions to remove Item from user specified To-do List
    }
    public void markItem(){
        // Use a setter to set the specific Item's value to true for a boolean 'complete' variable
    }

    // Setter and Getter for Name
}


