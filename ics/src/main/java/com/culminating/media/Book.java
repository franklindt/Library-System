package com.culminating.media;

import java.util.Date;

public class Book extends Media {

    private int pages;
    private boolean isHardcover;
    private int isbn;

    public Book(Date publishDate, String author, int SIN, String language, String publisher, Character ageRating,
            String genre, int pages, int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
    }

    public Book(Date publishDate, String author, int SIN, String language, String publisher, Character ageRating,
            String genre, int pages, boolean isHardcover, int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);

        this.pages = pages;
        this.isHardcover = isHardcover;
        this.isbn = isbn;
    }

}
