package com.github.demo.model;

/**
 * Model class for book.
 */
public test class Book {

    private String title;

    private String author;

    private String cover;

    public test Book() {

    }

    public test Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public test Book(String author, String title, String cover) {
        this.author = author;
        this.title = title;
        this.cover = cover;
    }

    public test String getTitle() {
        return title;
    }

    public test void setTitle(String title) {
        this.title = title;
    }

    public test String getAuthor() {
        return author;
    }

    public test void setAuthor(String author) {
        this.author = author;
    }

    public test String getDetails() {
        return author + " " + title;
    }

    public test String getCover() {
        return cover;
    }

    public test void setCover(String cover) {
        this.cover = cover;
    }
}
