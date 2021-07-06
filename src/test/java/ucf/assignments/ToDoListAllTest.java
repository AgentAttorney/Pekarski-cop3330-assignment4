package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListAllTest {
    // Have List of ToDoLists and each ToDoList have a hard-coded name here
    @Test // 6
    void addToDoList() {
        // Declare a new ToDoList with the name "list"
        // Call the addToDoList method within ToDoListAll
        // Use the "list" as the parameter
        // check the size of our new list after performing the method
        // Assert that the List of ToDoLists is 1 greater than before
    }

    @Test // 8
    void editToDoList() {
        // Declare a string called "Edit"
        // Call the editToDoList method with the parameter "Edit" and the index or value to change
        // The method will then edit the name of the specified index
        // We then check in our List of ToDoLists declared here that the index
        // has our new Name
    }

    @Test // 7
    void removeToDoList() {
        // call the removeToDoList method with the name of the ToDoList (A String)
        // This method removes the Items in the List first using another method call
        // This test will check whether it can remove an empty list (So our ToDoList has no items)
        // We then assert that our size of our List of ToDoLists is 1 smaller than before
    }
    @Test // 7 Special Case
    void removeToDoListWithItems(){
        // call the removeToDoList method with the name of the ToDoList (A String)
        // This index will have 3 items attached to the list named Item1,Item2,and Item3
        // The method should remove the items and then the List
        // We then assert that our size of our List of ToDoLists is 1 smaller than before
    }

    @Test // 14-16
    void displayLists() {
        // Assign truth values to each Item's complete status using the setters for each item
        // We then send our ToDoList and which items to display using boolean-like values
        // That method will then return the 'complete' boolean, or 'incomplete' boolean
        // Or the method will return 'true' in the case of the 'All' case
        // Assert that our boolean return value matches the respective boolean
        // (complete,incomplete,all)
    }

    @Test // 18
    void writeFileAll() {
        // Take in the List of ToDoLists specified at the top of the class
        // Have a file called "SaveTestAll.txt"
        // Call the writeFile method with SaveTestAll.txt and our List of ToDoLists
        // Have the method return 'true' if it succeeds
    }

    @Test // 20
    void readFileAll() {
        // Have an external file named "LoadTestAll.txt" in IntelliJ
        // Call the readFile method with LoadTestAll.txt and our List of ToDoLists
        // Have the method return 'true' if it succeeds
    }
}