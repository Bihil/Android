package com.trials.stormy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentWeather {
    private String locationLable;
    private String icon;
    private long time;
    private double temperature;
    private double humdity;
    private double precpChance;
    private String summary;

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    private String timeZone;

    public String getLocationLable() {
        return locationLable;
    }

    public void setLocationLable(String locationLable) {
        this.locationLable = locationLable;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getTime() {
        return time;
    }

    public String getFormattedTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");

        formatter.setTimeZone(TimeZone.getTimeZone(timeZone));

        Date dateTime = new Date(time * 1000);
        return formatter.format(dateTime);
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumdity() {
        return humdity;
    }

    public void setHumdity(double humdity) {
        this.humdity = humdity;
    }

    public double getPrecpChance() {
        return precpChance;
    }

    public void setPrecpChance(double precpChance) {
        this.precpChance = precpChance;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
