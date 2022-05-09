package com.culminating.media;

import java.util.Date;

public class EBook extends Book {
    public EBook() {
        super();
    }

    public EBook(final Date publishDate, final String author, final int SIN, final String language,
            final String publisher, final Character ageRating, final String genre, final int pages, final int isbn) {
        super(publishDate, author, SIN, language, publisher, ageRating, genre, pages, isbn);
    }

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
                ", pages='" + getPages() + "'" +
                ", isHardcover='" + getIsHardcover() + "'" +
                ", isbn='" + getIsbn() + "'" +
                "}";
    }
}
