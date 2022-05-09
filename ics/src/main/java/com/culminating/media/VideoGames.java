package com.culminating.media;

import java.util.Date;

public class VideoGames extends Media {
    private String platform;
    private String[] peripheralsRequired;
    private int amtPlayers;

    public VideoGames() {
        this.platform = "";
        this.amtPlayers = -1;
        this.peripheralsRequired = new String[1];
    }

    public VideoGames(final Date publishDate, final String author, final int SIN, final String language,
            final String publisher, final Character ageRating, final String genre, final String platform,
            final String[] peripheralsRequired, final int amtPlayers) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
        this.platform = platform;
        this.peripheralsRequired = peripheralsRequired;
        this.amtPlayers = amtPlayers;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String[] getPeripheralsRequired() {
        return this.peripheralsRequired;
    }

    public int getAmtPlayers() {
        return this.amtPlayers;
    }

    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    public void setPeripheralsRequired(final String[] peripheralsRequired) {
        this.peripheralsRequired = peripheralsRequired;
    }

    public void setAmtPlayers(final int amtPlayers) {
        this.amtPlayers = amtPlayers;
    }

    @Override
    public String toString() {
        String peripherals = "";
        for (int i = 0; i < this.getPeripheralsRequired().length; i++) {
            peripherals += this.peripheralsRequired[i] + ",";
        }
        peripherals = peripherals.substring(0, peripherals.length() - 1);
        return "{" +
                " publishDate='" + getPublishDate() + "'" +
                ", author='" + getAuthor() + "'" +
                ", SIN='" + getSIN() + "'" +
                ", language='" + getLanguage() + "'" +
                ", publisher='" + getPublisher() + "'" +
                ", ageRating='" + getAgeRating() + "'" +
                ", genre='" + getGenre() + "'" +
                ", peripheralsRequired='" + peripherals + "'" +
                ",platform" + getPlatform() + "'" +
                ",amtPlayers='" + getAmtPlayers() + "'" +
                "}";
    }
}
