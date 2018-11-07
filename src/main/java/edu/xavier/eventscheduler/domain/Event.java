package edu.xavier.eventscheduler.domain;

public class Event {
    private int hour;
    private int minute;
    private int month;
    private int day;
    private int year;

    /**
     *
     * @param month = month of event
     * @param day = day of event
     * @param year = year of event
     * @param hour = hour of event
     * @param minute = minute of event
     */
    public Event(int month, int day, int year, int hour, int minute)
    {
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public Event()
    {
        hour=0;
        minute=0;
        day=0;
        month=0;
        year=0;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
