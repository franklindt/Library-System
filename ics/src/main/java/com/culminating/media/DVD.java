package com.culminating.media;

import java.util.Date;

public class DVD extends Media {

    private int streamQuality;
    private boolean isBluRay;
    private boolean isAudioOnly;

    public DVD(Date publishDate, String author, int SIN, String language, String publisher, Character ageRating,
            String genre, int streamQuality, boolean isBluRay, boolean isAudioOnly) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
        this.streamQuality = streamQuality;
        this.isBluRay = isBluRay;
        this.isAudioOnly = isAudioOnly;
    }

}
