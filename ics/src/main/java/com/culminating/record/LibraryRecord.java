/**
*Name(s): Franklin, Mike, Grace, Sophia
*Date: 2022-05-04
*Description: Library record class
*/

package com.culminating.record;

/**
 * Stores the Media and User records
 */
public class LibraryRecord {
    private UserRecord[] userRecords;
    private MediaRecord[] mediaRecords;

    /**
     * Default constructor
     */
    public LibraryRecord() {
        this.userRecords = new UserRecord[1];
        this.userRecords[0] = new UserRecord();
        this.mediaRecords = new MediaRecord[1];
        this.mediaRecords[0] = new MediaRecord();
    }

    /**
     * Creates a library record object with user and media records
     * 
     * @param userRecords  -> user records
     * @param mediaRecords -> media records
     */
    public LibraryRecord(UserRecord[] userRecords, MediaRecord[] mediaRecords) {
        this.userRecords = userRecords;
        this.mediaRecords = mediaRecords;
    }

    /**
     * gets the user record
     * 
     * @return UserRecord[]
     */
    public UserRecord[] getUserRecords() {
        return this.userRecords;
    }

    /**
     * sets the user record
     * 
     * @param userRecords -> userRecord to be set
     */
    public void setUserRecords(UserRecord[] userRecords) {
        this.userRecords = userRecords;
    }

    /**
     * gets the media record
     * 
     * @return MediaRecord[] -> media record array
     */
    public MediaRecord[] getMediaRecords() {
        return this.mediaRecords;
    }

    /**
     * sets media record
     * 
     * @param mediaRecords -> mediaRecord to be set
     */
    public void setMediaRecords(MediaRecord[] mediaRecords) {
        this.mediaRecords = mediaRecords;
    }

    /**
     * Returns string representation of library record
     * 
     * @return String
     */
    public String toString() {
        String ret = "";
        ret += "Media Records: ";
        for (int i = 0; i < this.mediaRecords.length; i++) {
            ret += mediaRecords[i].toString() + ",";
        }
        ret = ret.substring(0, ret.length() - 1);
        for (int i = 0; i < this.userRecords.length; i++) {
            ret += userRecords[i].toString() + ",";
        }
        ret = ret.substring(0, ret.length() - 1);
        return ret;
    }
}
