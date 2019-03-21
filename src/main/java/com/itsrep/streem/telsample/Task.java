package com.itsrep.streem.telsample;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task implements Serializable {

    private String headline;
    private String description;
    private  String priority;
    private Date dateOfCreation;
    private Date dateOfExpiration;
    private String performing;
    private int   mark;

    public Task(String headline, String description, String priority, String performing, int mark) {
        this.headline = headline;
        this.description = description;
        this.priority = priority;
        this.performing = performing;
        this.mark = mark;

    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Date getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(Date dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getPerforming() {
        return performing;
    }

    public void setPerforming(String performing) {
        this.performing = performing;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Date getData (int YEAR, int MONTH, int DAY_OF_MONTH ){

    Calendar calendar = new GregorianCalendar();
    calendar.set(Calendar.YEAR,YEAR );
    calendar.set(Calendar.MONTH,MONTH-1 );
    calendar.set(Calendar.DAY_OF_MONTH, DAY_OF_MONTH);
  Date date= calendar.getTime();
    return date;

}

}
