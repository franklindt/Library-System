package com.culminating;

import com.culminating.media.*;
import com.culminating.user.*;
import com.culminating.record.*;
import com.culminating.utils.*;
import com.culminating.payment.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class AppMethods {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void media_(Media media) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "printtype":
                    System.out.println(media.getClass());
                    break;
                case "print":
                    System.out.println(media.toString());
                    break;
                case "genre":
                    System.out.println("Enter genre:");
                    media.setGenre(scanner.nextLine());
                    break;
                case "author":
                    System.out.println("Enter author:");
                    media.setAuthor(scanner.nextLine());
                    break;
                case "SIN":
                    System.out.println("Enter SIN: ");
                    media.setSIN(Integer.parseInt(scanner.nextLine()));
                    break;
                case "language":
                    System.out.println("Enter language");
                    media.setLanguage(scanner.nextLine());
                    break;
                case "ageRating":
                    System.out.println("Enter age rating:");
                    media.setAgeRating(scanner.nextLine().charAt(0));
                    break;
                case "publisher":
                    System.out.println("Enter publisher:");
                    media.setPublisher(scanner.nextLine());
                    break;
                // case "publishdate":
                // int year,month,day;
                // System.out.println("Day: ");
                // day = Integer.parseInt(scanner.nextLine());
                // System.out.println("Month: ");
                // month = Integer.parseInt(scanner.nextLine());
                // System.out.println("Year: ");
                // year = Integer.parseInt(scanner.nextLine());
                // user.setBirthDate(new Date(year,month,day));
                // break;
                case "-1":
                    break;
                case "type":
                    System.out.println(media.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void book_(Book book) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(book.toString());
                    break;
                case "genre":
                    System.out.println("Enter genre:");
                    book.setGenre(scanner.nextLine());
                    break;
                case "author":
                    System.out.println("Enter author:");
                    book.setAuthor(scanner.nextLine());
                    break;
                case "SIN":
                    System.out.println("Enter SIN: ");
                    book.setSIN(Integer.parseInt(scanner.nextLine()));
                    break;
                case "ageRating":
                    System.out.println("Enter age rating:");
                    book.setAgeRating(scanner.nextLine().charAt(0));
                    break;
                case "language":
                    System.out.println("Enter language");
                    book.setLanguage(scanner.nextLine());
                    break;
                case "publisher":
                    System.out.println("Enter publisher:");
                    book.setPublisher(scanner.nextLine());
                    break;
                case "isbn":
                    System.out.println("Enter ISBN: ");
                    book.setIsbn(Integer.parseInt(scanner.nextLine()));
                    break;
                case "hardcover":
                    System.out.println("Hardcover?");
                    book.setIsHardcover(scanner.nextLine().equals("true"));
                    break;
                case "pages":
                    System.out.println("Enter pages: ");
                    book.setPages(Integer.parseInt(scanner.nextLine()));
                    break;
                case "-1":
                    break;
                case "type":
                    System.out.println(book.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void ebook_(EBook ebook) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(ebook.toString());
                    break;
                case "genre":
                    System.out.println("Enter genre:");
                    ebook.setGenre(scanner.nextLine());
                    break;
                case "author":
                    System.out.println("Enter author:");
                    ebook.setAuthor(scanner.nextLine());
                    break;
                case "SIN":
                    System.out.println("Enter SIN: ");
                    ebook.setSIN(Integer.parseInt(scanner.nextLine()));
                    break;
                case "ageRating":
                    System.out.println("Enter age rating:");
                    ebook.setAgeRating(scanner.nextLine().charAt(0));
                    break;
                case "publisher":
                    System.out.println("Enter publisher:");
                    ebook.setPublisher(scanner.nextLine());
                    break;
                case "isbn":
                    System.out.println("Enter ISBN: ");
                    ebook.setIsbn(Integer.parseInt(scanner.nextLine()));
                    break;
                case "language":
                    System.out.println("Enter language");
                    ebook.setLanguage(scanner.nextLine());
                    break;
                case "hardcover":
                    System.out.println("Hardcover?");
                    ebook.setIsHardcover(scanner.nextLine().equals("true"));
                    break;
                case "pages":
                    System.out.println("Enter pages: ");
                    ebook.setPages(Integer.parseInt(scanner.nextLine()));
                    break;
                case "-1":
                    break;
                case "type":
                    System.out.println(ebook.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void dvd_(DVD dvd) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(dvd.toString());
                    break;
                case "genre":
                    System.out.println("Enter genre:");
                    dvd.setGenre(scanner.nextLine());
                    break;
                case "author":
                    System.out.println("Enter author:");
                    dvd.setAuthor(scanner.nextLine());
                    break;
                case "SIN":
                    System.out.println("Enter SIN: ");
                    dvd.setSIN(Integer.parseInt(scanner.nextLine()));
                    break;
                case "ageRating":
                    System.out.println("Enter age rating:");
                    dvd.setAgeRating(scanner.nextLine().charAt(0));
                    break;
                case "publisher":
                    System.out.println("Enter publisher:");
                    dvd.setPublisher(scanner.nextLine());
                    break;
                case "language":
                    System.out.println("Enter language");
                    dvd.setLanguage(scanner.nextLine());
                    break;
                case "streamquality":
                    System.out.println("Enter stream quality: ");
                    dvd.setStreamQuality(Integer.parseInt(scanner.nextLine()));
                    break;
                case "bluray":
                    System.out.println("BluRay?");
                    dvd.setIsBluRay(scanner.nextLine().equals("true"));
                    break;
                case "audio":
                    System.out.println("Audio only?");
                    dvd.setIsAudioOnly(scanner.nextLine().equals("true"));
                    break;
                case "-1":
                    break;
                case "type":
                    System.out.println(dvd.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void videogame_(VideoGames videogame) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(videogame.toString());
                    break;
                case "language":
                    System.out.println("Enter language");
                    videogame.setLanguage(scanner.nextLine());
                    break;
                case "genre":
                    System.out.println("Enter genre:");
                    videogame.setGenre(scanner.nextLine());
                    break;
                case "author":
                    System.out.println("Enter author:");
                    videogame.setAuthor(scanner.nextLine());
                    break;
                case "SIN":
                    System.out.println("Enter SIN: ");
                    videogame.setSIN(Integer.parseInt(scanner.nextLine()));
                    break;
                case "ageRating":
                    System.out.println("Enter age rating:");
                    videogame.setAgeRating(scanner.nextLine().charAt(0));
                    break;
                case "publisher":
                    System.out.println("Enter publisher:");
                    videogame.setPublisher(scanner.nextLine());
                    break;
                case "platform":
                    System.out.println("Enter platform: ");
                    videogame.setPlatform(scanner.nextLine());
                    break;
                case "playeramount":
                    System.out.println("Enter player quantity: ");
                    videogame.setAmtPlayers(Integer.parseInt(scanner.nextLine()));
                    break;
                case "peripherals":
                    System.out.println("Enter amount of peripherals: ");
                    int qty = Integer.parseInt(scanner.nextLine());
                    String[] peripherals = new String[qty];
                    for (int i = 0; i < qty; i++) {
                        System.out.println("Enter peripheral: ");
                        peripherals[i] = scanner.nextLine();
                    }
                    videogame.setPeripheralsRequired(peripherals);
                    break;
                case "-1":
                    break;

                case "type":
                    System.out.println(videogame.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void user_(User user) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(user.toString());
                    break;
                case "name":
                    System.out.println("Enter name:");
                    user.setName(scanner.nextLine());
                    break;
                case "address":
                    System.out.println("Enter address:");
                    user.setAddress(scanner.nextLine());
                    break;
                case "gender":
                    System.out.println("Enter gender: ");
                    user.setGender(scanner.nextLine());
                    break;
                case "age":
                    System.out.println("Enter age: ");
                    user.setAge(Integer.parseInt(scanner.nextLine()));
                    break;
                case "birthdate":
                    int year, month, day;
                    System.out.println("Day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    user.setBirthDate(new Date(year, month, day));
                    break;
                case "-1":
                    break;
                case "type":
                    System.out.println(user.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void librarian_(Librarian librarian) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(librarian.toString());
                    break;
                case "name":
                    System.out.println("Enter name:");
                    librarian.setName(scanner.nextLine());
                    break;
                case "address":
                    System.out.println("Enter address:");
                    librarian.setAddress(scanner.nextLine());
                    break;
                case "gender":
                    System.out.println("Enter gender: ");
                    librarian.setGender(scanner.nextLine());
                    break;
                case "age":
                    System.out.println("Enter age: ");
                    librarian.setAge(Integer.parseInt(scanner.nextLine()));
                    break;
                case "birthdate":
                    int year, month, day;
                    System.out.println("Day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    librarian.setBirthDate(new Date(year, month, day));
                    break;
                case "-1":
                    break;
                case "type":
                    System.out.println(librarian.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void borrower_(Borrower borrower) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(borrower.toString());
                    break;
                case "name":
                    System.out.println("Enter name:");
                    borrower.setName(scanner.nextLine());
                    break;
                case "address":
                    System.out.println("Enter address:");
                    borrower.setAddress(scanner.nextLine());
                    break;
                case "gender":
                    System.out.println("Enter gender: ");
                    borrower.setGender(scanner.nextLine());
                    break;
                case "age":
                    System.out.println("Enter age: ");
                    borrower.setAge(Integer.parseInt(scanner.nextLine()));
                    break;
                case "birthdate":
                    int year, month, day;
                    System.out.println("Day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    borrower.setBirthDate(new Date(year, month, day));
                    break;
                case "-1":
                    break;
                case "type":
                    System.out.println(borrower.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void log_(Log log) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(log.toString());
                    break;
                case "user":
                    User user = new User();
                    user_(user);
                    log.setUser(user);
                    break;
                case "item":
                    Media item = new Media();
                    media_(item);
                    log.setItem(item);
                    break;
                case "detail":
                    System.out.println("Enter detail: ");
                    log.setDetail(scanner.nextLine());
                    break;
                case "date":
                    int year, month, day;
                    System.out.println("Day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    log.setDate(new Date(year, month, day));
                    break;
                case "type":
                    System.out.println(log.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void fee_(Fee fee) {
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            if (input.equals("print")) {
                System.out.println(fee.toString());
            } else if (input.equals("type")) {
                System.out.println(fee.getClass());
                break;
            } else if (input.equals("-1")) {
                break;
            } else {
                System.out.println("No");
            }
        }
    }

    public static void mediarecord_(MediaRecord mediarecord) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(mediarecord.toString());
                    break;
                case "item":
                    Media media = new Media();
                    media_(media);
                    mediarecord.setItem(media);
                    break;
                case "history":
                    System.out.println("Dimension: ");
                    int dim = Integer.parseInt(scanner.nextLine());
                    List<Log> borrowHistory = new ArrayList<>(dim);
                    for (int i = 0; i < dim; i++) {
                        Log log = new Log();
                        log_(log);
                        borrowHistory.set(i, log);
                    }
                    mediarecord.setBorrowHistory(borrowHistory);
                case "-1":
                    break;
                case "type":
                    System.out.println(mediarecord.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void userrecord_(UserRecord userrecord) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(userrecord.toString());
                    break;
                case "user":
                    User user = new User();
                    user_(user);
                    userrecord.setOwner(user);
                    break;
                case "fees":
                    System.out.println("Amount of fees: ");
                    int fees_qty = Integer.parseInt(scanner.nextLine());
                    List<Fee> fees = new ArrayList<>(fees_qty);
                    for (int i = 0; i < fees_qty; i++) {
                        fees.set(i, new Fee());
                        fee_(fees.get(i));
                    }
                    userrecord.setPastFees(fees);
                    break;
                case "history":
                    System.out.println("Dimension: ");
                    int dim = Integer.parseInt(scanner.nextLine());
                    List<Log> borrowHistory = new ArrayList<>(dim);
                    for (int i = 0; i < dim; i++) {
                        Log log = new Log();
                        log_(log);
                        borrowHistory.set(i, log);
                    }
                    userrecord.setBorrowHistory(borrowHistory);
                    break;
                case "-1":
                    break;
                case "type":
                    System.out.println(userrecord.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }

    public static void libraryrecord_(LibraryRecord libraryrecord) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "print":
                    System.out.println(libraryrecord.toString());
                    break;
                case "mediarecords":
                    System.out.println("Amount of records: ");
                    int records_qty = Integer.parseInt(scanner.nextLine());
                    ArrayList<MediaRecord> mediarecords = new ArrayList<MediaRecord>();
                    for (int i = 0; i < records_qty; i++) {
                        mediarecords.add(new MediaRecord());
                        mediarecord_(mediarecords.get(i));
                    }
                    libraryrecord.setMediaRecords(mediarecords);
                    break;

                case "userrecords":
                    System.out.println("Amount of records: ");
                    int records1_qty = Integer.parseInt(scanner.nextLine());
                    ArrayList<UserRecord> userrecords = new ArrayList<UserRecord>();
                    for (int i = 0; i < records1_qty; i++) {
                        userrecords.add(new UserRecord());
                        userrecord_(userrecords.get(i));
                    }
                    libraryrecord.setUserRecords(userrecords);
                    break;
                case "-1":
                    break;
                case "type":
                    System.out.println(libraryrecord.getClass());
                    break;
                default:
                    System.out.println("No");
            }
        }
    }
}