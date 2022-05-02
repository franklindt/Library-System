package com.culminating.media;

import java.util.ArrayList;
import java.util.Date;

import com.culminating.utils.Library;

public class Book extends Media {
    private int pages;
    private boolean isHardcover;
    private int isbn;

    public Book() {
        this.pages = -1;
        this.isHardcover = false;
        this.isbn = -1;
    }

    public Book(final Date publishDate, final String author, final int SIN, final String language,
            final String publisher, final Character ageRating, final String genre, final int pages, final int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
    }

    public Book(final Date publishDate, final String author, final int SIN, final String language,
            final String publisher, final Character ageRating, final String genre, final int pages,
            final boolean isHardcover, final int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
        this.pages = pages;
        this.isHardcover = isHardcover;
        this.isbn = isbn;
    }

    /**
     * Adds current item to the library collection and casts Book to Media
     * 
     * @param library
     */
    @Override
    public void transfer(Library library) {
        ArrayList<Media> tempBooks = library.getCollection();
        tempBooks.add((Media) (this));
        library.setCollection(tempBooks);
    }

    public int getPages() {
        return this.pages;
    }

    public boolean getIsHardcover() {
        return this.isHardcover;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setPages(final int pages) {
        this.pages = pages;
    }

    public void setIsHardcover(final boolean isHardcover) {
        this.isHardcover = isHardcover;
    }

    public void setIsbn(final int isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        return "{" +
                " publishDate='" + getPublishDate() + "'" +
                ", author='" + getAuthor() + "'" +
                ", SIN='" + getSIN() + "'" +
                ", language='" + getLanguage() + "'" +
                ", publisher='" + getPublisher() + "'" +
                ", ageRating='" + getAgeRating() + "'" +
                ", genre='" + getGenre() + "'" +
                ", pages='" + getPages() + "'" +
                ", isHardcover='" + getIsHardcover() + "'" +
                ", isbn='" + getIsbn() + "'" +
                "}";
    }
}
