package com.culminating.media;

import java.util.Date;

public class DVD extends Media {
    private int streamQuality;
    private boolean isBluRay;
    private boolean isAudioOnly;

    public DVD() {
        this.isBluRay = false;
        this.isAudioOnly = false;
        this.streamQuality = -1;
    }

    public DVD(final Date publishDate, final String author, final int SIN, final String language,
            final String publisher, final Character ageRating, final String genre, final int streamQuality,
            final boolean isBluRay, final boolean isAudioOnly) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
        this.streamQuality = streamQuality;
        this.isBluRay = isBluRay;
        this.isAudioOnly = isAudioOnly;
    }

    public int getStreamQuality() {
        return this.streamQuality;
    }

    public boolean getIsBluRay() {
        return this.isBluRay;
    }

    public boolean getIsAudioOnly() {
        return this.isAudioOnly;
    }

    public void setStreamQuality(final int streamQuality) {
        this.streamQuality = streamQuality;
    }

    public void setIsBluRay(final boolean isBluRay) {
        this.isBluRay = isBluRay;
    }

    public void setIsAudioOnly(final boolean isAudioOnly) {
        this.isAudioOnly = isAudioOnly;
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
                ", isAudioOnly='" + getIsAudioOnly() + "'" +
                ", streamQuality='" + getStreamQuality() + "'" +
                ", isBluRay='" + getIsBluRay() + "'" +
                "}";
    }
}
