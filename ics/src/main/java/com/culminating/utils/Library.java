package com.culminating.utils;

import java.util.ArrayList;

import com.culminating.media.Media;

public class Library {
    private String address;
    private ArrayList<Media> collection;
    private String phoneNumber;
    private int numConferenceRooms;
    private String wifiPwd;

    public Library() {
    }

    public Library(String address, ArrayList<Media> collection, String phoneNumber, int numConferenceRooms,
            String wifiPwd) {
        this.address = address;
        this.collection = collection;
        this.phoneNumber = phoneNumber;
        this.numConferenceRooms = numConferenceRooms;
        this.wifiPwd = wifiPwd;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Media> getCollection() {
        return this.collection;
    }

    public void setCollection(ArrayList<Media> collection) {
        this.collection = collection;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumConferenceRooms() {
        return this.numConferenceRooms;
    }

    public void setNumConferenceRooms(int numConferenceRooms) {
        this.numConferenceRooms = numConferenceRooms;
    }

    public String getWifiPwd() {
        return this.wifiPwd;
    }

    public void setWifiPwd(String wifiPwd) {
        this.wifiPwd = wifiPwd;
    }

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
