/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: Library class
*/

//packages library class into com.culminating.utils
package com.culminating.utils;

//imports array list
import java.util.ArrayList;

//imports com.culminating.media.Media
import com.culminating.media.Media;

public class Library {
    private String address; //the address of the library
    private ArrayList<Media> collection; //the collections in the library
    private String phoneNumber; //the phone number of the library
    private int numConferenceRooms; //the number of conference rooms in the library
    private String wifiPwd; //the wifi password of the library

    /**
    *default constructor a library
    */
    public Library() {
    }

    /**
    *Constuctor a library: sets address, collection, phoneNumber, numConferenceRooms, and wifiPwd from parameters
    *@param address, the adress of the library 
    *@param collection, the collections in the library
    *@param phoneNumber, the phone number of the library
    *@param numConferenceRooms, the number of conference rooms in the library
    *@param wifiPwd, the wifi password of the library.
    */
    public Library(String address, ArrayList<Media> collection, String phoneNumber, int numConferenceRooms,
            String wifiPwd) {
        this.address = address;
        this.collection = collection;
        this.phoneNumber = phoneNumber;
        this.numConferenceRooms = numConferenceRooms;
        this.wifiPwd = wifiPwd;
    }

    /**
    *Description: gets the library's address
    *@return String address of the library
    */
    public String getAddress() {
        return this.address;
    }

    /**
    *Description: sets the address of the library
    *@param address, the address of the library
    */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
    *Description: gets the collections in the library
    *@return ArrayList<Media> collection in the library
    */
    public ArrayList<Media> getCollection() {
        return this.collection;
    }

    /**
    *Description: sets the collections in the library
    *@param collection, the collections in the library
    */
    public void setCollection(ArrayList<Media> collection) {
        this.collection = collection;
    }

    /**
    *Description: gets the phone number of the library
    *@return String phoneNumber of the library
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
    *Description: sets the phone number of the library
    *@param phoneNumber, the phone number of the library
    */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
    *Description: gets the number of conference rooms in the library
    *@return int numConferenceRooms in the library.
    */
    public int getNumConferenceRooms() {
        return this.numConferenceRooms;
    }

    /**
    *Description: sets the number of conference rooms in the library
    *@param numConferenceRooms, the number of conference rooms in the library
    */
    public void setNumConferenceRooms(int numConferenceRooms) {
        this.numConferenceRooms = numConferenceRooms;
    }

    /**
    *Description:gets wifi password of the library
    *@return String wifiPwd of the library
    */
    public String getWifiPwd() {
        return this.wifiPwd;
    }

    /**
    *Description: sets the wifi password of the library
    *@param wifiPwd, the library's wifi password
    */
    public void setWifiPwd(String wifiPwd) {
        this.wifiPwd = wifiPwd;
    }

    /**
    *Description: prints all the attributes of the library
    */
    @Override
    public String toString() {
        return "{" +
                " address='" + getAddress() + "'" +
                ", collection='" + getCollection() + "'" +
                ", phoneNumber='" + getPhoneNumber() + "'" +
                ", numConferenceRooms='" + getNumConferenceRooms() + "'" +
                ", wifiPwd='" + getWifiPwd() + "'" +
                "}";
    }

}
