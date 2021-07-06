package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
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
    public void markItem(Items user_item,boolean complete){
        // Use a setter to set the specific Item's value to true for a boolean 'complete' variable
    }
    public void SaveList(ToDoList User_Save){
        // use a Filechooser and get the stage of the current window
        // implement the name of the window, the file extension( .txt)
        // Call a method that writes to the file specified in the specific format
        // MethodName(File filename, ToDoList User_Save)
    }
    public void LoadList(){
        // works similar to SaveList
        // use the stage of the current window in a FileChooser
        // call a FileChooser method that "saves" the directory
        // Difference here is that if the file sees another ListName
        // It will close the file
    }
    public boolean writeFile(File filename, ToDoList User_Save){
        // write to the file
        // Format------------
        // ListName1 Item1DD Item1Desc Item2DD Item2Desc...
        // After the ListName, after each Item DD and Description, have newline char
        return true;
    }
    public boolean readFile(File filename, ToDoList User_Load) {
        // gets the File name from writeFile and the Empty ToDoList
        // reads until a new list name occurs, inserting the items and their properties when prompted
        return true;
    }

    // Setter and Getter for Name
}


