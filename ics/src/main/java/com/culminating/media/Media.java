package com.culminating.media;

import java.util.Date;

/**
 * 
 */
public class Media {
    /* */
    /** */
    private Date publishDate;
    /** */
    private String author;
    /** */
    private int SIN;
    /** */
    private String language;
    /** */
    private String publisher;
    /** */
    private Character ageRating;
    /** */
    private String genre;

    /**
     * 
     * @param publishDate
     * @param author
     * @param SIN
     * @param language
     * @param publisher
     * @param ageRating
     * @param genre
     */
    public Media(Date publishDate, String author, int SIN, String language, String publisher, Character ageRating,
            String genre) {
        this.publishDate = publishDate;
        this.author = author;
        this.SIN = SIN;
        this.language = language;
        this.publisher = publisher;
        this.ageRating = ageRating;
        this.genre = genre;
    }

    /**
     * @return Date
     */
    /*
     * Accessors and Mutators
     */

    public Date getPublishDate() {
        return this.publishDate;
    }

    /**
     * @param publishDate
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * @return String
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return int
     */
    public int getSIN() {
        return this.SIN;
    }

    /**
     * @param SIN
     */
    public void setSIN(int SIN) {
        this.SIN = SIN;
    }

    /**
     * @return String
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return String
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * @param publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return Character
     */
    public Character getAgeRating() {
        return this.ageRating;
    }

    /**
     * @param ageRating
     */
    public void setAgeRating(Character ageRating) {
        this.ageRating = ageRating;
    }

    /**
     * @return String
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return String
     */
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