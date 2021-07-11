package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    // instance variables
    private static String listName;
    private ObservableList<Items> obv_list = FXCollections.observableArrayList();;
    //public List<ToDoList> master_list = new ArrayList<ToDoList>();
    //public ObservableList<ObservableList<Items>> master_list_obv = FXCollections.observableArrayList();

    public void setListName(String listName){
        ToDoList.listName = listName;
    }
    public String getListName() {
        return listName;
    }

    public void setObv_list(ObservableList<Items> obv_list) {
        this.obv_list = obv_list;
    }
    public ObservableList<Items> getObv_list() {
        return obv_list;
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
    public void SaveLists(ToDoList User_Save){ // Saves All Lists
        // use a Filechooser and get the stage of the current window
        // implement the name of the window, the file extension( .txt)
        // Call a method that writes to the file specified in the specific format
        // MethodName(File filename, ToDoListAll User_Save)
    }
    public void LoadLists(){
        // works similar to SaveLists
        // use the stage of the current window in a FileChooser
        // call a FileChooser method that "saves" the directory
        // calls a method that reads the File until the end of the File
        // The File will have the format as a save file, so no need to worry
    }
    public boolean writeFileAll(File filename, ToDoList User_Save){
        // write to the file
        // Format------------
        // ListName1 Item1DD Item1Desc Item2DD Item2Desc...
        // After each "thing" is printed, have newline char
        return true;
    }
    public boolean readFileAll(){
        // gets the File name from writeFileAll and the Empty List of ToDoLists
        // reads until end of file, inserting the items and their properties when prompted
        return true;
    }


    // Methods
    public void addItem(Items Item_to_add){
        obv_list.add(Item_to_add);
        // use add method for ObservableLists
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
}


