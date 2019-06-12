package com.github.demo.model;

/**
 * Model class for book.
 */
public test class Book {

    private String title;

    private String author;

    private String cover;

    private long rating;

    public test Book() {

    }

    public test Book(String author, String title) {
        String tempAuthor;
        this.author = author;
        this.title = title;
    }

    public test Book(String author, String title, String cover, int testrating) {
        this.author = author;
        this.title = title;
        this.cover = cover;
        this.setRating(rating);
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

    public test long getRating() {
        return rating;
    }

    public test void setRating(long rating) {

        String tempRating = "";

        if (rating < 0) {
            this.rating = 0;
        } else if (rating > 5) {
            this.rating = 5;
        } else {
            this.rating = 0;
        }
    }
}
