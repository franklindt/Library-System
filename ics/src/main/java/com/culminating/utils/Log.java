package com.culminating.utils;

import java.util.Date;

import com.culminating.media.Media;
import com.culminating.user.User;

public class Log {
    private User user;
    private Media item;
    private Date date;
    private String detail;

    public Log() {
        this.user = new User();
        this.item = new Media();
        this.date = new Date();
        this.detail = "";
    }

    public Log(User user, Media item, Date date, String detail) {
        this.user = user;
        this.item = item;
        this.date = date;
        this.detail = detail;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Media getItem() {
        return this.item;
    }

    public void setItem(Media item) {
        this.item = item;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String toString() {
        return "User: " + this.user.toString() + "\nItem: " + this.item.toString() + "\nDate: " + this.date
                + "\nDescription: " + this.detail;
    }

}
