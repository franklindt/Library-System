/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: media class
*/

//packages media in com.culminating.media
package com.culminating.media;

//imports ArrayList and Date
import java.util.ArrayList;
import java.util.Date;

//imports library class
import com.culminating.utils.Library;

public class Media {
    private Date publishDate; // the date of publication of the media
    private String author; // the author of the media's name
    private int SIN; // the SIN of the media
    private String language; // the language the media is in
    private String publisher; // the media's publisher's name
    private Character ageRating; // the age rating of the media
    private String genre; // the genre of the media

    /**
     * default constructor a media
     * sets publishDate to new Date()
     * sets author to ""
     * sets SIN to -1
     * sets language to ""
     * sets publisher to ""
     * sets ageRating to 0
     * sets genre to ""
     */
    public Media() {
        this.publishDate = new Date();
        this.author = "";
        this.SIN = -1;
        this.language = "";
        this.publisher = "";
        this.ageRating = 0;
        this.genre = "";
    }

    /**
     * Constructor a media: sets publishDate, author, SIN, language, publisher,
     * ageRating, and genre from parameters
     * 
     * @param publishDate, the media's date of publication
     * @param author,      the media's author's name
     * @param SIN,         the SIN of the media
     * @param language,    the language the media is in
     * @param publisher,   the publisher of the media
     * @param ageRating,   the age rating of the media
     * @param genre,       the genre of the media
     */
    public Media(Date publishDate, String author, int SIN, String language,
            String publisher, Character ageRating, String genre) {
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
     * @param library, library to receive a new media
     */
    public void transfer(Library library) {
        ArrayList<Media> tempMedia = (ArrayList<Media>) library.getCollection();
        tempMedia.add(this);
        library.setCollection(tempMedia);
    }

    /**
     * Description: gets the date of publication
     * 
     * @return Date publishDate of media
     */
    public Date getPublishDate() {
        return this.publishDate;
    }

    /**
     * Description: sets the publication date
     * 
     * @param publishDate, the media's date of publication
     */
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * Description: gets the Author's name
     * 
     * @return String author of media
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Description: sets the name of the author
     * 
     * @param author, the media's author's name
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Description: gets the SIN
     * 
     * @return int SIN of the media
     */
    public int getSIN() {
        return this.SIN;
    }

    /**
     * Description: sets the SIN
     * 
     * @param SIN, the unique identity of the media
     */
    public void setSIN(int SIN) {
        this.SIN = SIN;
    }

    /**
     * Description: gets the language
     * 
     * @return String language of the media
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Description: sets the language
     * 
     * @param language, the language of the media
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Description: gets the publisher's name
     * 
     * @return String publisher of the media
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Description: sets the publisher's name
     * 
     * @param publisher, the publisher's name
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Description: gets the age rating
     * 
     * @return Character ageRating of the media
     */
    public Character getAgeRating() {
        return this.ageRating;
    }

    /**
     * Description: sets the age rating
     * 
     * @param ageRating, the age rating of the media
     */
    public void setAgeRating(Character ageRating) {
        this.ageRating = ageRating;
    }

    /**
     * Description: gets the genre
     * 
     * @return String genre of the media
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Description: sets the genre
     * 
     * @param genre, the genre of the media
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Description: prints all the attributes of the media
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
