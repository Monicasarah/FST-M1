package Activity1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Activity1 {

    // Declare a static ArrayList
    static ArrayList<String> list;

    // Setup method with @BeforeAll annotation
    @BeforeAll
    static void setUp() {
        // Initialize a new ArrayList
        list = new ArrayList<String>();

        // Add values to the list
        list.add("alpha"); // at index 0
        list.add("beta");  // at index 1
    }

    @Test
    public void insertTest() {
        // Assert size of the list
        assertEquals(2, list.size(), "Wrong size");

        // Add a new value to the list
        list.add("gamma");

        // Assert size of the new list
        assertEquals(3, list.size(), "Wrong size");

        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }

    @Test
    public void replaceTest() {
        // Assert size of the list
        assertEquals(2, list.size(), "Wrong size");

        // Add a new value to the list
        list.add("delta");

        // Assert size of the new list
        assertEquals(3, list.size(), "Wrong size");

        // Replace the element at index 1
        list.set(1, "epsilon");

        // Assert individual elements
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("epsilon", list.get(1), "Wrong element");
        assertEquals("delta", list.get(2), "Wrong element");
    }
}
