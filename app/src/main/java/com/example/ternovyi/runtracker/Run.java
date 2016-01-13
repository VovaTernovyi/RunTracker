package com.example.ternovyi.runtracker;

import java.util.Date;
import java.text.Format ;
import java.text.SimpleDateFormat ;

public class Run {

    private long mId;
    private Date mStartDate;

    public long getId() {
        return mId;
    }

    public void setId(long mId) {
        this.mId = mId;
    }

    public Run() {
        mId = -1;
        mStartDate = new Date(1);
    }

    public Date getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Date startDate) {
        mStartDate = startDate;
    }

    public int getDurationSeconds(long endMillis) {
        return (int)((endMillis - mStartDate.getTime()) / 1000);
    }

    public static String formatDuration(int durationSeconds) {
        /*int seconds = durationSeconds % 60;
        int minutes = ((durationSeconds - seconds) / 60) % 60;
        int hours = (durationSeconds - (minutes * 60) - seconds) / 3600;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        */
        Format formatter = new SimpleDateFormat( "hh:mm:ss" );
        System.out.println( formatter.format( new Date() ) );
        long time = System.currentTimeMillis();
        return formatter.format(new Date(time));
    }
}
