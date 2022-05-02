package com.culminating;

import com.culminating.media.*;
import com.culminating.payment.*;
import com.culminating.record.*;
import com.culminating.user.*;
import com.culminating.utils.*;

import java.util.Date;

import java.util.Scanner;

public class Test1 {

    public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arg) {
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch (input) {
                case "media":
                    Media media = new Media();
                    media_(media);
                    break;
                case "book":
                    Book book = new Book();
                    book_( book);
                    break;
                case "ebook":
                    EBook ebook = new EBook();
                    ebook_(ebook);
                    break;
                case "dvd": 
                    DVD dvd = new DVD();
                    dvd_(dvd);
                    break;
                case "videogame": 
                    VideoGames videogame = new VideoGames();
                    videogame_(videogame);
                    break;
                case "transaction":
                    Transaction transaction = new Transaction();
                    //transaction_(transaction);
                    break;
                case "fee":
                    System.out.println("Create a raw fee? ");
                    boolean createRaw = scanner.nextLine().equals("yes");
                    Fee fee;
                    if (createRaw) {
                        fee = new Fee();
                    }
                    else {
                        System.out.println("Creating user");
                        User user = new User();
                        user_(user);
                        System.out.println("Item qty: ");
                        int item_qty = Integer.parseInt(scanner.nextLine());
                        Media[] item = new Media[item_qty];
                        for (int i = 0; i < item_qty; i++) {
                            System.out.println("Media " + i);
                            Media tmp = new Media();
                            media_(tmp);
                            item[i] = tmp;
                        }
                        System.out.println("Amount: ");
                        double amount = Double.parseDouble(scanner.nextLine());
                        int year, month, day;
                        System.out.println("Year: ");
                        year = Integer.parseInt(scanner.nextLine());
                        System.out.println("Month: ");
                        month = Integer.parseInt(scanner.nextLine());
                        System.out.println("Day: ");
                        day = Integer.parseInt(scanner.nextLine());
                        Date date = new Date(year, month, day);
                        System.out.println("Description: ");
                        String details = scanner.nextLine();
                        System.out.println("Paid? ");
                        boolean paid = scanner.nextLine().equals("yes");
                        fee = new Fee(user, item, amount, date,details,paid);
                    }
                    fee_(fee);
                    break;
                case "libraryrecord": 
                    LibraryRecord libraryrecord = new LibraryRecord();
                    libraryrecord_(libraryrecord);
                    break;
                case "mediarecord":
                    MediaRecord mediarecord = new MediaRecord();
                    mediarecord_(mediarecord);
                    break;
                case "userrecord":
                    UserRecord  userrecord = new UserRecord();
                    userrecord_(userrecord);
                    break;
                case "log":
                    Log log = new Log();
                    log_(log);
                    break;
                case "user":
                    User user = new User();
                    user_(user);
                    break;
                case "borrower":
                    Borrower borrower = new Borrower();
                    borrower_(borrower);
                    break;
                case "librarian":
                    Librarian librarian = new Librarian();
                    librarian_(librarian);
                    break;
                case "-1":
                    System.out.println("Good riddance!");
                    break;
                default:
                    System.out.println("Invalid!");
            }
        }
	}


    public static void media_(Media media) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch(input) {
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
                //     int year,month,day;
                //     System.out.println("Day: ");
                //     day = Integer.parseInt(scanner.nextLine());
                //     System.out.println("Month: ");
                //     month = Integer.parseInt(scanner.nextLine());
                //     System.out.println("Year: ");
                //     year = Integer.parseInt(scanner.nextLine());
                //     user.setBirthDate(new Date(year,month,day));
                //     break;
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
            switch(input) {
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
            switch(input) {
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
            switch(input) {
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
            switch(input) {
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
            switch(input) {
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
                    int year,month,day;
                    System.out.println("Day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    user.setBirthDate(new Date(year,month,day));
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
            switch(input) {
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
                    int year,month,day;
                    System.out.println("Day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    librarian.setBirthDate(new Date(year,month,day));
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
            switch(input) {
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
                    int year,month,day;
                    System.out.println("Day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    borrower.setBirthDate(new Date(year,month,day));
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
            switch(input) {
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
                    int year,month,day;
                    System.out.println("Day: ");
                    day = Integer.parseInt(scanner.nextLine());
                    System.out.println("Month: ");
                    month = Integer.parseInt(scanner.nextLine());
                    System.out.println("Year: ");
                    year = Integer.parseInt(scanner.nextLine());
                    log.setDate(new Date(year,month,day));
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
            }
            else if (input.equals("type")) {
                System.out.println(fee.getClass());
                break;
            }
            else if (input.equals("-1")) {
                break;
            } 
            else {
                System.out.println("No");
            }
        }
    }

    public static void mediarecord_(MediaRecord mediarecord) { // too lazy to make date thingy
        String input = "";
        while (!input.equals("-1")) {
            input = scanner.nextLine();
            switch(input) {
                case "print":
                    System.out.println(mediarecord.toString());
                    break;
                case "item":
                    Media media = new Media();
                    media_(media);
                    mediarecord.setItem(media);
                    break;
                case "history":
                    System.out.println("Dimension 1: ");
                    int dim1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Dimension 2: ");
                    int dim2 = Integer.parseInt(scanner.nextLine());
                    Log[][] borrowHistory = new Log[dim1][dim2];
                    for (int i = 0; i  < dim1; i++) {
                        for (int j = 0; j < dim2; j++) {
                            Log log = new Log();
                            log_(log);
                            borrowHistory[i][j] = log;
                        }
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
            switch(input) {
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
                    Fee[] fees = new Fee[fees_qty];
                    for (int i = 0; i < fees_qty; i++) {
                        fees[i] = new Fee();
                        fee_(fees[i]);
                    }
                    userrecord.setPastFees(fees);
                    break;
                case "history":
                    System.out.println("Dimension 1: ");
                    int dim1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Dimension 2: ");
                    int dim2 = Integer.parseInt(scanner.nextLine());
                    Log[][] borrowHistory = new Log[dim1][dim2];
                    for (int i = 0; i  < dim1; i++) {
                        for (int j = 0; j < dim2; j++) {
                            Log log = new Log();
                            log_(log);
                            borrowHistory[i][j] = log;
                        }
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
            switch(input) {
                case "print":
                    System.out.println(libraryrecord.toString());
                    break;
                case "mediarecords":
                    System.out.println("Amount of records: ");
                    int records_qty = Integer.parseInt(scanner.nextLine());
                    MediaRecord[] mediarecords = new MediaRecord[records_qty];
                    for (int i = 0; i < records_qty; i++) {
                        mediarecords[i] = new MediaRecord();
                        mediarecord_(mediarecords[i]);
                    }
                    libraryrecord.setMediaRecords(mediarecords);
                    break;

                case "userrecords":
                    System.out.println("Amount of records: ");
                    int records1_qty = Integer.parseInt(scanner.nextLine());
                    UserRecord[] userrecords = new UserRecord[records1_qty];
                    for (int i = 0; i < records1_qty; i++) {
                        userrecords[i] = new UserRecord();
                        userrecord_(userrecords[i]);
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