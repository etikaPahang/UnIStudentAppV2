package com.unistudent.app.unistudentappv2.models;
import java.util.Date;
/**
 * Created by user on 18/10/2017.
 */

public class Event {
    private int image;
    private String name;
    private Date date;
    
    public Event(int image, String name, Date date){
        this.image = image;
        this.name = name;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setNama(String text) {
        this.name = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
