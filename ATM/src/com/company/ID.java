package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ID {
    public String  setUniqueID(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy.dd.MM ");
        Date date = new Date();
        String dt= dateFormat.format(date);
        Calendar.getInstance();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        String tm= time.format(new Date());
        String id= dt+tm;
        System.out.println(id);
        return id;
    }
}
