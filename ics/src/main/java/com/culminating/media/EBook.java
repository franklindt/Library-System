/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: E-book class
*/

//packages the E-book in com.culminating.media
package com.culminating.media;

//imports Date
import java.util.Date;

public class EBook extends Book {
    public EBook() {
        super(); // inherits the default constructor of book
    }

    /**
     * Constructor an EBook: sets publishDate, author, SIN, language, publisher,
     * ageRating, genre, pages, and isbn from parameters
     * 
     * @param publishDate, the publish date of the EBook
     * @param author,      the name of the author who wrote the EBook
     * @param SIN,         the unique identity of the EBook
     * @param language,    the language the EBook is written in
     * @param publisher,   the Ebook's publisher's name
     * @param ageRating,   the age rating of the EBook
     * @param genre,       the genre of the EBook
     * @param pages,       the number of pages the EBook has
     * @param isbn,        the thirteen digit code of the EBook
     */
    public EBook(Date publishDate, String author, int SIN, String language,
            String publisher, Character ageRating, String genre, int pages, int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre, pages, isbn);
    }

    @Override

    /**
     * Description: prints all the attributes of the EBook
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
