package com.example.ternovyi.runtracker;


import java.sql.Date;

/**
 * Created by vova on 12.01.16.
 */
public class Run {

    private Date mStartDate;
    public Run() {
        mStartDate = new Date(0);
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
        int seconds = durationSeconds % 60;
        int minutes = ((durationSeconds - seconds) / 60) % 60;
        int hours = (durationSeconds - (minutes * 60) - seconds) / 3600;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
