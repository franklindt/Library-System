/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: DVD class
*/

//packages the DVD in com.culminating.media
package com.culminating.media;

//imports Date
import java.util.Date;

public class DVD extends Media {
    private int streamQuality; // the number of streamQuality the DVD has
    private boolean isBluRay; // whether or not the DVD is a BluRay
    private boolean isAudioOnly; // whether or not the DVD is audio only

    /**
     * default constructor a DVD:
     * sets isBluRay to false
     * sets isAudioOnly to false
     * sets streamQuality to -1
     */
    public DVD() {
        this.isBluRay = false;
        this.isAudioOnly = false;
        this.streamQuality = -1;
    }

    /**
     * Constructor a DVD: sets publishDate, author, SIN, language, publisher,
     * ageRating, genre, streamQuality, isBluRay, and isAudioOnly from parameters
     * 
     * @param publishDate,   the publish date of the DVD
     * @param author,        the author of the DVD
     * @param SIN,           the unique identity of the DVD
     * @param language,      the language the DVD is in
     * @param publisher,     the publisher's name of the DVD
     * @param ageRating,     the age rating of the DVD
     * @param genre,         the genre of the DVD
     * @param streamQuality, the stream quality of the DVD
     * @param isBluRay,      whether or not the DVD is a bluray
     * @param isAudioOnly,   whether or not the DVD is audio only
     */
    public DVD(Date publishDate, String author, int SIN, String language,
            String publisher, Character ageRating, String genre, int streamQuality,
            boolean isBluRay, boolean isAudioOnly) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
        this.streamQuality = streamQuality;
        this.isBluRay = isBluRay;
        this.isAudioOnly = isAudioOnly;
    }

    /**
     * Description: gets the stream quality of the DVD
     * 
     * @return int streamQuality of the book
     */
    public int getStreamQuality() {
        return this.streamQuality;
    }

    /**
     * Description: gets whether or not the DVD is a bluray
     * 
     * @return boolean isBluRay of the DVD
     */
    public boolean getIsBluRay() {
        return this.isBluRay;
    }

    /**
     * Description: gets whether or not the DVD is audio only
     * 
     * @return boolean isAudioOnly of the DVD
     */
    public boolean getIsAudioOnly() {
        return this.isAudioOnly;
    }

    /**
     * Description: sets the stream quality of the DVD
     * 
     * @param streamQuality, the stream quality of the DVD
     */
    public void setStreamQuality(int streamQuality) {
        this.streamQuality = streamQuality;
    }

    /**
     * Description: sets whether or not the DVD is a bluray
     * 
     * @param isBluRay, whether or not the DVD is a bluray
     */
    public void setIsBluRay(boolean isBluRay) {
        this.isBluRay = isBluRay;
    }

    /**
     * Description: sets whether or not the DVD is audio only
     * 
     * @param isAudioOnly, whether or not the DVD is audio only
     */
    public void setIsAudioOnly(boolean isAudioOnly) {
        this.isAudioOnly = isAudioOnly;
    }

    /**
     * Description: prints all of the attributes of the DVD
     */
    public String toString() {
        return "{" +
                " publishDate='" + getPublishDate() + "'" +
                ", author='" + getAuthor() + "'" +
                ", SIN='" + getSIN() + "'" +
                ", language='" + getLanguage() + "'" +
                ", publisher='" + getPublisher() + "'" +
                ", ageRating='" + getAgeRating() + "'" +
                ", genre='" + getGenre() + "'" +
                ", isAudioOnly='" + getIsAudioOnly() + "'" +
                ", streamQuality='" + getStreamQuality() + "'" +
                ", isBluRay='" + getIsBluRay() + "'" +
                "}";
    }
}
