package ucf.assignments;
/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {
    ToDoList tdl = new ToDoList();

    @Test // 2
    void ItemLength_Small(){
        Items item1 = new Items();
        assertTrue(item1.validDesc("E"));
    }
    @Test // 2
    void ItemLength_Large(){
        Items item1 = new Items();
        assertTrue(item1.validDesc("111111111111111111111111111111111111" +
                "111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111" +
                "11111111111111111111111111111111111111111111111111111111111111111" +
                "111111111111111111111111111111111"));
    }
    @Test // 3
    void ItemDD_Valid(){
        Items item1 = new Items();
        assertTrue(item1.validFormat("2000-04-28"));
    }
    @Test // 3
    void ItemDD_Valid_Feb29(){
        Items item1 = new Items();
        assertTrue(item1.validFormat("2000-02-29"));
    }
    @Test // 3
    void ItemDD_Invalid_Feb30(){
        Items item1 = new Items();
        assertFalse(item1.validFormat("2000-02-30"));
    }

    @Test // 4
    void addItem() {
        // Declare a new item with a due date and description
        Items item1 = new Items();
        item1.setDescription("Hello Sinner");
        item1.setDue_Date("2000-04-20");

        // Call the addItem method given the Item
        tdl.addItem(item1);

        // Assert that our ToDoList has an item checking the size
        assertEquals(1,tdl.getObv_list().size());

    }
    @Test // 4
    void addItem_CheckDesc() {
        // Declare a new item with a due date and description
        Items item1 = new Items();
        item1.setDescription("Hello Sinner");
        item1.setDue_Date("2000-04-20");

        // Call the addItem method given the Item
        tdl.addItem(item1);

        // Assert that our ToDoList's observable list's first item matches the description
        assertEquals("Hello Sinner",tdl.getObv_list().get(0).getDescription());

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