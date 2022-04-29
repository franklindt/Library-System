package com.culminating.media;

import java.util.Date;

public class VideoGames extends Media {

    /* Attributes */
    /** */
    private String platform;
    /** */
    private String[] peripheralsRequired;
    /** */
    private int[] amtPlayers;

    /**
     * 
     * @param publishDate
     * @param author
     * @param SIN
     * @param language
     * @param publisher
     * @param ageRating
     * @param genre
     * @param platform
     * @param peripheralsRequired
     * @param amtPlayers
     */
    public VideoGames(Date publishDate, String author, int SIN, String language, String publisher, Character ageRating,
            String genre, String platform, String[] peripheralsRequired, int[] amtPlayers) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);

        this.platform = platform;
        this.peripheralsRequired = peripheralsRequired;
        this.amtPlayers = amtPlayers;
    }
}
