/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: Book Class
*/

//packages the book in com.culminating.media
package com.culminating.media;

//imports ArrayList and Date
import java.util.ArrayList;
import java.util.Date;

//imports Library class
import com.culminating.utils.Library;

public class Book extends Media {
    private int pages; //amount of pages a book has
    private boolean isHardcover; //whether the book is hardcover
    private int isbn; //the book serial number

    /**
    *default constructor a book: call superclass media
    *sets pages to -1
    *sets isHardcover to false
    *sets isbn to -1
    */
    public Book() {
        this.pages = -1;
        this.isHardcover = false;
        this.isbn = -1;
    }

    /**
    *Constructor a book: sets publishDate, author, SIN, language, publisher, ageRating, and genre from parameters
    *@param publishDate, the publish date of the book
    *@param author, the book's author's name
    *@param SIN, the unique identity of the book
    *@param language, the language the book is in
    *@param publisher, the book's publisher's name 
    *@param ageRating, the age rating of the book
    *@param genre, the genre of the book
    *@param pages, the amount of pages the book has
    *@param isbn, the thirteen digit code of the book 
    */
    public Book(Date publishDate, String author, int SIN, String language,
            String publisher, Character ageRating, String genre, int pages, int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
    }
    
    /**
    *Constructor a book: sets publishDate, author, SIN, language, publisher, ageRating, and genre from parameters
    *@param publishDate, the publish date of the book
    *@param author, the book's author's name
    *@param SIN, the unique identity of the book
    *@param language, the language the book is in
    *@param publisher, the book's publisher's name 
    *@param ageRating, the age rating of the book
    *@param genre, the genre of the book
    *@param pages, the amount of pages the book has
    *@param isHardcover, whether the book is a hardcover book
    *@param isbn, the thirteen digit code of the book
    */
    public Book(Date publishDate, String author, int SIN, String language,
            String publisher, Character ageRating, String genre, int pages,
            boolean isHardcover, int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre);
        this.pages = pages;
        this.isHardcover = isHardcover;
        this.isbn = isbn;
    }

    /**
     * Adds current item to the library collection and casts Book to Media
     * 
     * @param library, the library the media are held in
     */
    @Override
    public void transfer(Library library) {
        ArrayList<Media> tempBooks = library.getCollection();
        tempBooks.add((Media) (this));
        library.setCollection(tempBooks);
    }
    
    /**
    *Description: gets the book's number of pages 
    *@return int pages of the book
    */
    public int getPages() {
        return this.pages;
    }
    
    /**
    *Description: gets whether or not the book is hardcover
    *@return boolean isHardcover of the book
    */
    public boolean getIsHardcover() {
        return this.isHardcover;
    }
    
    /**
    *Description: gets isbn of the book
    *@return int isbn of the book
    */
    public int getIsbn() {
        return this.isbn;
    }
    
    /**
    *Description: sets the book's amount of pages
    *@param pages, the new amount of pages the book has 
    */
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    /**
    *Description: sets whether or not the book is Hardcover
    *@param isHardcover, the new isHardcover of the book
    */
    public void setIsHardcover(boolean isHardcover) {
        this.isHardcover = isHardcover;
    }
    
    /**
    *Description: sets the isbn of the book
    *@param isbn, the new isbn of the book
    */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
    *Description: prints all the attributes of the book
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
                ", pages='" + getPages() + "'" +
                ", isHardcover='" + getIsHardcover() + "'" +
                ", isbn='" + getIsbn() + "'" +
                "}";
    }
}
