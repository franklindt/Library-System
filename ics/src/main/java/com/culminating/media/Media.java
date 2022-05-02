package com.culminating.media;

import java.util.ArrayList;
import java.util.Date;

import com.culminating.utils.Library;

public class Media {
    private Date publishDate;
    private String author;
    private int SIN;
    private String language;
    private String publisher;
    private Character ageRating;
    private String genre;

    public Media() {
        this.publishDate = new Date();
        this.author = "";
        this.SIN = -1;
        this.language = "";
        this.publisher = "";
        this.ageRating = 0;
        this.genre = "";
    }

    public Media(final Date publishDate, final String author, final int SIN, final String language,
            final String publisher, final Character ageRating, final String genre) {
        this.publishDate = publishDate;
        this.author = author;
        this.SIN = SIN;
        this.language = language;
        this.publisher = publisher;
        this.ageRating = ageRating;
        this.genre = genre;
    }

    /**
     * Adds current item to the library collection
     * 
     * @param library - library to receive a new media
     */
    public void transfer(Library library) {
        ArrayList<Media> tempMedia = (ArrayList<Media>) library.getCollection();
        tempMedia.add(this);
        library.setCollection(tempMedia);
    }

    public Date getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(final Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }

    public int getSIN() {
        return this.SIN;
    }

    public void setSIN(final int SIN) {
        this.SIN = SIN;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }

    public Character getAgeRating() {
        return this.ageRating;
    }

    public void setAgeRating(final Character ageRating) {
        this.ageRating = ageRating;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(final String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "{" +
                " publishDate='" + getPublishDate() + "'" +
                ", author='" + getAuthor() + "'" +
                ", SIN='" + getSIN() + "'" +
                ", language='" + getLanguage() + "'" +
                ", publisher='" + getPublisher() + "'" +
                ", ageRating='" + getAgeRating() + "'" +
                ", genre='" + getGenre() + "'" +
                "}";
    }
}
