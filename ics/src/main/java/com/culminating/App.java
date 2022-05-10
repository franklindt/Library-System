package com.culminating;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import com.culminating.media.*;
import com.culminating.record.LibraryRecord;
import com.culminating.record.MediaRecord;
import com.culminating.user.*;
import com.culminating.utils.*;
import com.culminating.payment.*;

import com.culminating.AppMethods;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Library> libraries = new ArrayList<Library>();
    public static ArrayList<Handler> handlers = new ArrayList<Handler>();
    public static ArrayList<LibraryRecord> libraryrecords = new ArrayList<LibraryRecord>();
    public static ArrayList<User> users = new ArrayList<User>();

    public static void createLib() {
        System.out.println("Address of the library");
        String address = scanner.nextLine();
        System.out.println("Phone number of the library");
        String phoneNumber = scanner.nextLine();
        System.out.println("How many conference rooms");
        int numConferenceRooms = Integer.parseInt(scanner.nextLine());
        System.out.println("Wifi password");
        String wifiPwd = scanner.nextLine();
        Library library = new Library(address, new ArrayList<Media>(), phoneNumber, numConferenceRooms, wifiPwd);
        libraries.add(library);
        handlers.add(new Handler());
        libraryrecords.add(new LibraryRecord());
    }

    public static void main( String[] args )
    {
        createLib();
        int index = 0;
        String input = "";
        ArrayList<Media> temp;


        while (input != "-1") {
            input = scanner.nextLine();
            switch (input) {

                case "print":
                    System.out.println("Users: " + users.size());
                    int amt_borrowers = 0;
                    int amt_librarians = 0;
                    for (int i = 0; i < users.size();i++) {
                        if (users.get(i) instanceof Borrower) {
                            amt_borrowers++;
                        }
                        if (users.get(i) instanceof Librarian) {
                            amt_librarians++;
                        }
                    }
                    System.out.println("Borrowers: " + amt_borrowers);
                    System.out.println("Librarians: " + amt_librarians);

                    for (int i = 0; i < libraries.size(); i++) {
                        System.out.println("Library Branch: " + libraries.get(i).getAddress());
                        System.out.println("Collection Size: " + libraries.get(i).getCollection().size());
                        System.out.println("Conference Rooms: " + libraries.get(i).getNumConferenceRooms());
                        System.out.println();
                    }
                    break;
                



                case "print2":
                    System.out.println("Holds (" + libraries.get(index).getAddress() + ")");
                    for (int i = 0; i < handlers.get(index).getCurrHolds().size(); i++) {
                        System.out.println("User: " + handlers.get(index).getCurrHolds().get(i).getUser().getName() + "|Item: " + handlers.get(index).getCurrHolds().get(i).getItem().getSIN() + "|Date: " + handlers.get(index).getCurrHolds().get(i).getDate());
                    }
                    System.out.println("Fines (" + libraries.get(index).getAddress() + ")");
                    for (int i = 0; i < handlers.get(index).getFines().size(); i++) {
                        System.out.println("Fee: " + handlers.get(index).getFines().get(i).toString());
                    }
                    System.out.println("Item States (" + libraries.get(index).getAddress() + ")");
                    for (int i = 0; i < handlers.get(index).getItemStates().size(); i++) {
                        System.out.println(handlers.get(index).getItemStates().get(i).toString());
                    }

                    System.out.println("User Records (" + libraries.get(index).getAddress() + ")");
                    for (int i = 0; i < libraryrecords.get(index).getUserRecords().size(); i++) {
                        System.out.println(libraryrecords.get(index).getUserRecords().get(i).toString());
                    }
                    System.out.println("Media Records (" + libraries.get(index).getAddress() + ")");
                    for (int i = 0; i < libraryrecords.get(index).getMediaRecords().size(); i++) {
                        System.out.println(libraryrecords.get(index).getMediaRecords().get(i).toString());
                    }

                    break;




                case "library":
                    createLib();
                    break;
                case "visit library":
                    System.out.println("Address");
                    input = scanner.nextLine();
                    int prevIndex = index;
                    for (int i = 0; i < libraries.size(); i++) {
                        if (input.equals(libraries.get(i).getAddress())) {
                            System.out.println("Welcome to " + libraries.get(i).getAddress() + " library!");
                            index = i;
                            break;
                        }
                    }
                    if (prevIndex == index) {
                        System.out.println("Couldn't find library");
                    }
                    break;








                case "user":
                    User user = new User();
                    AppMethods.user_(user);
                    users.add(user);
                    handlers.get(index).addUser(user);
                    System.out.println("Welcome " + user.getName() + "!");
                    break;
                case "borrower":
                    Borrower borrower = new Borrower();
                    AppMethods.borrower_(borrower);
                    users.add(borrower);
                    handlers.get(index).addUser(borrower);
                    System.out.println("Welcome " + borrower.getName());
                    break;
                case "librarian":
                    Librarian librarian = new Librarian();
                    System.out.println("Address");
                    input = scanner.nextLine();
                    int lib_index = -1;
                    for (int i = 0; i < libraries.size(); i++) {
                        if (input.equals(libraries.get(i).getAddress())) {
                            lib_index = i;
                            break;
                        }
                    }
                    if (lib_index == -1) {
                        System.out.println("Couldn't find library");
                        librarian.setLibrary(libraries.get(0));
                    }
                    else {
                        librarian.setLibrary(libraries.get(lib_index));
                    }
                    AppMethods.librarian_(librarian);
                    users.add(librarian);
                    handlers.get(index).addUser(librarian);
                    System.out.println("Welcome " + librarian.getName());
                    break;


                case "media":
                    Media media = new Media();
                    AppMethods.media_(media);
                    temp = libraries.get(index).getCollection();
                    temp.add(media);
                    libraries.get(index).setCollection(temp);
                    handlers.get(index).addMedia(media);
                    libraryrecords.get(index).mediaRecordsAppend(new MediaRecord(media));
                    break;
                case "book":
                    Book book = new Book();
                    AppMethods.book_(book);
                    temp = libraries.get(index).getCollection();
                    temp.add(book);
                    libraries.get(index).setCollection(temp);
                    handlers.get(index).addMedia(book);
                    libraryrecords.get(index).mediaRecordsAppend(new MediaRecord(book));
                    break;
                case "dvd":
                    DVD dvd = new DVD();
                    AppMethods.dvd_(dvd);
                    temp = libraries.get(index).getCollection();
                    temp.add(dvd);
                    libraries.get(index).setCollection(temp);
                    handlers.get(index).addMedia(dvd);
                    libraryrecords.get(index).mediaRecordsAppend(new MediaRecord(dvd));
                    break;
                case "ebook":
                    EBook ebook = new EBook();
                    AppMethods.ebook_(ebook);
                    temp = libraries.get(index).getCollection();
                    temp.add(ebook);
                    libraries.get(index).setCollection(temp);
                    handlers.get(index).addMedia(ebook);
                    libraryrecords.get(index).mediaRecordsAppend(new MediaRecord(ebook));
                    break;
                case "videogames":
                    VideoGames videogames = new VideoGames();
                    AppMethods.videogame_(videogames);
                    temp = libraries.get(index).getCollection();
                    temp.add(videogames);
                    libraries.get(index).setCollection(temp);
                    handlers.get(index).addMedia(videogames);
                    libraryrecords.get(index).mediaRecordsAppend(new MediaRecord(videogames));
                    break;











                    case "borrow":
                        System.out.println("Borrower");
                        input = scanner.nextLine();
                        for (int i = 0; i < users.size(); i++) {
                            if (users.get(i).getName().equals(input)) {
                                if (!(users.get(i) instanceof Borrower)) {
                                    System.out.println("Not a borrower!");
                                    break;
                                }
                                System.out.println("Media");
                                input = scanner.nextLine();
                                for (int j = 0; j < libraries.get(index).getCollection().size(); j++) {
                                    if (String.valueOf(libraries.get(index).getCollection().get(j).getSIN()).equals(input)) {
                                        handlers.get(index).checkOut(users.get(i), libraries.get(index).getCollection().get(j));
                                        System.out.println(users.get(i).getName() + " borrowed item " + libraries.get(index).getCollection().get(j));
                                        break;
                                    }
                                }
                            }
                        }
                        break;



                    case "return":
                        
                        System.out.println("Borrower");
                        input = scanner.nextLine();
                        for (int i = 0; i < users.size(); i++) {
                            if (users.get(i).getName().equals(input)) {
                                if (!(users.get(i) instanceof Borrower)) {
                                    System.out.println("Not a borrower!");
                                    break;
                                }
                                System.out.println("Media");
                                input = scanner.nextLine();
                                for (int j = 0; j < libraries.get(index).getCollection().size(); j++) {
                                    if (String.valueOf(libraries.get(index).getCollection().get(j).getSIN()).equals(input)) {
                                        handlers.get(index).checkIn(users.get(i), libraries.get(index).getCollection().get(j));
                                        System.out.println(users.get(i).getName() + " returned item " + libraries.get(index).getCollection().get(j));
                                        break;
                                    }
                                }
                            }
                        }
                        break;


                    case "fee":
                        System.out.println("Create a raw fee? ");
                        boolean createRaw = scanner.nextLine().equals("yes");
                        Fee fee;
                        if (createRaw) {
                            fee = new Fee();
                        } else {
                            System.out.println("Creating user");
                            user = new User();
                            AppMethods.user_(user);
                            System.out.println("Item qty: ");
                            int item_qty = Integer.parseInt(scanner.nextLine());
                            Media[] item = new Media[item_qty];
                            for (int i = 0; i < item_qty; i++) {
                                System.out.println("Media " + i);
                                Media tmp = new Media();
                                AppMethods.media_(tmp);
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
                            fee = new Fee(user, item, amount, date, details, paid);
                            handlers.get(index).appendFines(fee);
                        }
                        break;




                    case "hold":

                        System.out.println("Borrower");
                        input = scanner.nextLine();
                        for (int i = 0; i < users.size(); i++) {
                            if (users.get(i).getName().equals(input)) {
                                if (!(users.get(i) instanceof Borrower)) {
                                    System.out.println("Not a borrower!");
                                    break;
                                }
                                System.out.println("Media");
                                input = scanner.nextLine();
                                for (int j = 0; j < libraries.get(index).getCollection().size(); j++) {
                                    if (String.valueOf(libraries.get(index).getCollection().get(j).getSIN()).equals(input)) {
                                        handlers.get(index).addHold(new Date(), libraries.get(index).getCollection().get(j), users.get(i));
                                        System.out.println(users.get(i).getName() + " put a hold on item " + libraries.get(index).getCollection().get(j));
                                        break;
                                    }
                                }
                            }
                        }
                        break;

                    case "renew":
                        
                    System.out.println("Borrower");
                    input = scanner.nextLine();
                    for (int i = 0; i < users.size(); i++) {
                        if (users.get(i).getName().equals(input)) {
                            if (!(users.get(i) instanceof Borrower)) {
                                System.out.println("Not a borrower!");
                                break;
                            }
                            System.out.println("Media");
                            input = scanner.nextLine();
                            for (int j = 0; j < libraries.get(index).getCollection().size(); j++) {
                                if (String.valueOf(libraries.get(index).getCollection().get(j).getSIN()).equals(input)) {
                                    handlers.get(index).renew(users.get(i), libraries.get(index).getCollection().get(j));
                                    System.out.println(users.get(i).getName() + " renewed item " + libraries.get(index).getCollection().get(j));
                                    break;
                                }
                            }
                        }
                    }
                    break;













                case "-1":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}
