package ucf.assignments;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Richard Pekarski
 */
public class Items {
    private String Due_Date;
    private String Description;
    private boolean Complete = false;

    public String getDue_Date() {
        return Due_Date;
    }

    public void setDue_Date(String Due_Date) {
        this.Due_Date = Due_Date;
    }
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public boolean isComplete() {
        return Complete;
    }

    public void setComplete(boolean complete) {
        Complete = complete;
    }

    public boolean validFormat(String dateStr) {
        // requirement: we specify format as year-month-date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);
        try{
            sdf.parse(dateStr);
        }
        catch(ParseException e){
            return false;
        }
        return true;
    }

    public boolean validDesc(String text) {
        // requirement
        if(!text.isEmpty() && (text.length() <= 256)){
            return true;
        }
        else
            return false;
    }

}
