/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: Library record class
*/

package com.culminating.record;

import java.util.ArrayList;

/**
 * Stores the Media and User records
 */
public class LibraryRecord {
    private ArrayList<UserRecord> userRecords;
    private ArrayList<MediaRecord> mediaRecords;

    /**
     * Default constructor
     */
    public LibraryRecord() {
        this.userRecords = new ArrayList<UserRecord>();
        this.mediaRecords = new ArrayList<MediaRecord>();
    }

    /**
     * Creates a library record object with user and media records
     * 
     * @param userRecords  -> user records
     * @param mediaRecords -> media records
     */
    public LibraryRecord(ArrayList<UserRecord> userRecords, ArrayList<MediaRecord> mediaRecords) {
        this.userRecords = userRecords;
        this.mediaRecords = mediaRecords;
    }

    /**
     * gets the user record
     * 
     * @return UserRecord[]
     */
    public ArrayList<UserRecord> getUserRecords() {
        return this.userRecords;
    }

    /**
     * sets the user record
     * 
     * @param userRecords -> userRecord to be set
     */
    public void setUserRecords(ArrayList<UserRecord> userRecords) {
        this.userRecords = userRecords;
    }

    /**
     * gets the media record
     * 
     * @return MediaRecord[] -> media record array
     */
    public ArrayList<MediaRecord> getMediaRecords() {
        return this.mediaRecords;
    }

    /**
     * sets media record
     * 
     * @param mediaRecords -> mediaRecord to be set
     */
    public void setMediaRecords(ArrayList<MediaRecord> mediaRecords) {
        this.mediaRecords = mediaRecords;
    }

    public void mediaRecordsAppend(MediaRecord mediarecord) {
        this.mediaRecords.add(mediarecord);
    }

    public void userRecordsAppend(UserRecord userrecord) {
        this.userRecords.add(userrecord);
    }

    /**
     * Returns string representation of library record
     * 
     * @return String
     */
    public String toString() {
        String ret = "";
        ret += "Media Records: ";
        for (int i = 0; i < this.mediaRecords.size(); i++) {
            ret += mediaRecords.get(i).toString() + ",";
        }
        ret = ret.substring(0, ret.length() - 1);
        for (int i = 0; i < this.userRecords.size(); i++) {
            ret += userRecords.get(i).toString() + ",";
        }
        ret = ret.substring(0, ret.length() - 1);
        return ret;
    }
}
