/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: Video games class
*/

//packages video games in com.culminating.media
package com.culminating.media;

//imports Date
import java.util.Date;

public class VideoGames extends Media {
    private String platform; //the platform of the video game
    private String[] peripheralsRequired; //the peripheral required for the video game
    private int amtPlayers; //the amount of players for the video game

    /**
    *default constuctor a video game: call superclass media
    *sets platform to ""
    *sets amtPlayers to -1
    *sets peripheralsRequired to new String[1]
    */
    public VideoGames() {
        this.platform = "";
        this.amtPlayers = -1;
        this.peripheralsRequired = new String[1];
    }

    /**
    *Constructor a video game: sets publishDate, author, SIN, language, publisher, ageRating, genre, platform, peripheralsRequired, and amtPlayers from parameters
    *@param publishDate, the publication date of the game
    *@param author, the video game's author(creator)'s name
    *@param SIN, the unique identity of the video game
    *@param language, the language the video game is in
    *@param publisher, the publiser of the video game
    *@param ageRating, the age rating of the video game
    *@param genre, the genre of the video game
    *@param platform, the platform of the video game
    *@param peripheralsRequired, the peripherals required for the video game
    *@param amtPlayerss, the amount of players the video game need
    */
    public VideoGames(Date publishDate, String author, int SIN, String language,
            String publisher, Character ageRating, String genre, String platform,
            String[] peripheralsRequired, int amtPlayers) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
        this.platform = platform;
        this.peripheralsRequired = peripheralsRequired;
        this.amtPlayers = amtPlayers;
    }
        
    /**
    *Description: gets the platform
    *@return String platform of the video game
    */
    public String getPlatform() {
        return this.platform;
    }
        
    /**
    *Description: gets the peripherals required
    *@return String[] peripheralsRequired of the video game
    */
    public String[] getPeripheralsRequired() {
        return this.peripheralsRequired;
    }
        
    /**
    *Description: gets the amount of players
    *@return int amtPlayers of the video game
    */
    public int getAmtPlayers() {
        return this.amtPlayers;
    }
        
    /**
    *Description: sets the platform
    *@param platform, the video game's platform
    */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
        
    /**
    *Description: sets the peripheral required
    *@param peripheralsRequired, the peripherals required for the video game
    */
    public void setPeripheralsRequired(String[] peripheralsRequired) {
        this.peripheralsRequired = peripheralsRequired;
    }
        
    /**
    *Description: sets the amount of players
    *@param amtPlayers, the amount of players for the video game
    */
    public void setAmtPlayers(int amtPlayers) {
        this.amtPlayers = amtPlayers;
    }

    /**
    *Description: prints all the attributes of the video game
    */
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
