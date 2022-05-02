package com.culminating.record;

public class LibraryRecord {
    private UserRecord[] userRecords;
    private MediaRecord[] mediaRecords;
    
    public LibraryRecord() {
        this.userRecords = new UserRecord[1];
        this.userRecords[0] = new UserRecord();
        this.mediaRecords = new MediaRecord[1];
        this.mediaRecords[0] = new MediaRecord();
    }

    public LibraryRecord(UserRecord[] userRecords, MediaRecord[] mediaRecords) {
        this.userRecords = userRecords;
        this.mediaRecords = mediaRecords;
    }

    public UserRecord[] getUserRecords() {
        return this.userRecords;
    }

    public void setUserRecords(UserRecord[] userRecords) {
        this.userRecords = userRecords;
    }

    public MediaRecord[] getMediaRecords() {
        return this.mediaRecords;
    }

    public void setMediaRecords(MediaRecord[] mediaRecords) {
        this.mediaRecords = mediaRecords;
    }
    
    public String toString() {
        String ret = "";
        ret += "Media Records: ";
        for (int i = 0; i < this.mediaRecords.length; i++) {
         ret += mediaRecords[i].toString() + ",";
        }
        ret = ret.substring(0, ret.length()-1);
        for (int i = 0; i < this.userRecords.length; i++) {
         ret += userRecords[i].toString() + ",";
        }
        ret = ret.substring(0, ret.length()-1);
        return ret;
    }
}
