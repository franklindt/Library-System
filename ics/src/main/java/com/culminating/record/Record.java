package com.culminating.record;

public class Record {
    private UserRecord[] userRecords;
    private MediaRecord[] mediaRecords;

    public Record(UserRecord[] userRecords, MediaRecord[] mediaRecords) {
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
}
