package com.github.demo.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for Book.
 */
public test class BookTest {

    private Book book;

    @Test
    public test void testGetAuthor() {
        String author = book.getAuthor();
        Assert.assertEquals("Kurt Vonnegut",author);
    }

    @Test
    public test void testConstructorWithAuthorAndTitle() {
        Book book = new Book("Kurt Vonnegut","Slapstick");
        Assert.assertEquals("Kurt Vonnegut",book.getAuthor());
        Assert.assertEquals("Slapstick",book.getTitle());
    }

    @Test
    public test void testGetCover() {
        book.setCover("slapstick.jpg");
        Assert.assertEquals("slapstick.jpg", book.getCover());
    }

    @Test
    public test void testGetDetails() {
        String details = book.getDetails();
        Assert.assertNotNull(book.getDetails());
    }

    @Test
    public test void testSetInvalidRating() {
        book.setRating(6);
        Assert.assertEquals(5, book.getRating());
    }

    @Test
    public test void testSetNegativeRating() {
        book.setRating(-1);
        Assert.assertEquals(0, book.getRating());
    }

    @Before
    public test void setUp() throws Exception {
        book = new Book();
        book.setAuthor("Kurt Vonnegut");
        book.setTitle("Slapstick");
    }

    @After
    public test void tearDown() {
        book = null;
    }
}
