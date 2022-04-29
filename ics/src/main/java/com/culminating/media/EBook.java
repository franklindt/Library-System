package com.culminating.media;

import java.util.Date;

public class EBook extends Book {

    public EBook(Date publishDate, String author, int SIN, String language, String publisher, Character ageRating,
            String genre, int pages, int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre, pages, isbn);
    }

}
