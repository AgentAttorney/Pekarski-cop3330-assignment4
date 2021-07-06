package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    // Declare a ToDoList with 5 items that have pre-set dates and descriptions
    @Test // 9
    void addItem() {
        // Declare a new item with a due date and description
        // Those values are filled in with the setters in the Item class
        // Call the addItem method given the Item
        // Assert that our ToDoList has a 6th item checking the size
        // Assert that our ToDoList 6th's value has the Item's Name
    }

    @Test // 11 12
    void editItem_BothDescriptionAndDueDate() {
        // Take an item from our ToDoList, say the 2nd item (the "1" index)
        // Declare two Strings, one for Due Date and one for Description
        // Both will have different values than the item we took
        // Call the editItem method with the Item parameter and the two strings
        // Assert that the item description and due date match our two String literals
    }
    @Test // 11
    void editItem_DueDate() {
        // Take an item from our ToDoList, say the 2nd item (the "1" index)
        // Declare three Strings, one for Due Date (1st), one for Description (null) (2nd)
        // The 3rd string will get the old Description for our Item
        // Due Date string will be initialized with a new value and the other will not
        // Call the editItem method with the Item parameter and the 1st and 2nd strings
        // Assert that the item description and due date match the old value (3rd string)
        // and the initialized literal (1st string) respectively
    }
    @Test // 12
    void editItem_Description() {
        // Take an item from our ToDoList, say the 2nd item (the "1" index)
        // Declare three Strings, one for Due Date (null)(1st), one for Description (2nd)
        // The 3rd string will get the old DueDate for our Item
        // Description string will be initialized with a new value and the other will not
        // Call the editItem method with the Item parameter and the 1st and 2nd strings
        // Assert that the item description and due date match the initialized literal (2nd string)
        // and the old value (3rd string) respectively
    }
    @Test // 10
    void removeItem() {
        // Have a string with the name of the Item to remove
        // Call the removeItem method with our string literal
        // That method takes care of the logic part (like associating that string with an item)
        // Assert that our list has size-1 Items
        // Assert that our List does not contain that item (should be a method for that)
    }

    @Test // 13
    void markItemComplete() {
        // Have a boolean value "complete" be set to true
        // Call the markItem method with our boolean value and the Item we choose (say the 4th)
        // Assert that the 4th item's complete value is equal to "true"
    }
    @Test // 13
    void markItemIncomplete() {
        // This isn't directly specified in the requirements, but it makes sense logically
        // Have a boolean value "complete" be set to false
        // Call the markItem method with our boolean value and the Item we choose (say the 4th)
        // Assert that the 4th item's complete value is equal to "false"
    }
    @Test // 17
    void writeFile() {
        // Take in the ToDoList specified at the top of the class
        // Have a file called "SaveTest.txt"
        // Call the writeFile method with SaveTest.txt and our ToDoList
        // Have the method return 'true' if it succeeds
    }

    @Test // 19
    void readFile() {
        // Have an external file named "LoadTest.txt" in IntelliJ
        // Call the readFile method with LoadTest.txt and our List of ToDoLists
        // Have the method return 'true' if it succeeds
    }
}