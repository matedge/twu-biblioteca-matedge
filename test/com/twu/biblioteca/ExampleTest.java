package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    private Biblioteca biblioteca;
    private Book[] books;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        books = new Book[] {
                new Book("Hitchiker's Guide to the Galaxy", "Douglas Adams", 1976, false)
        };
    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void checkWelcomeMessage(){
        assertEquals(biblioteca.getWelcomeMessage(), "Welcome to Biblioteca");
    }
    @Test
    public void testMenu()  {
        assertEquals(biblioteca.getMenu(), "L: List books" + "\n" + "C: Checkout book" + "\n" + "R: Return book" + "\n" + "Q: Quit");
    }
}
