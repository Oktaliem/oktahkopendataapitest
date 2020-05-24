package com.oktaliem.hkopendata.model;

/**
 * @author Okta Liem
 */
public class ClimateAndWeatherModel {
    private String dataTpe ="";
    private String rformat ="";
    private String station ="";
    private String year ="";
    private String month ="";
    private String day ="";
    private String hour ="";

    public String getDataTpe() {
        return dataTpe;
    }

    public ClimateAndWeatherModel setDataTpe(String dataTpe) {
        this.dataTpe = dataTpe;
        return this;
    }

    public String getRformat() {
        return rformat;
    }

    public ClimateAndWeatherModel setRformat(String rformat) {
        this.rformat = rformat;
        return this;
    }

    public String getStation() {
        return station;
    }

    public ClimateAndWeatherModel setStation(String station) {
        this.station = station;
        return this;
    }

    public String getYear() {
        return year;
    }

    public ClimateAndWeatherModel setYear(String year) {
        this.year = year;
        return this;
    }

    public String getMonth() {
        return month;
    }

    public ClimateAndWeatherModel setMonth(String month) {
        this.month = month;
        return this;
    }

    public String getDay() {
        return day;
    }

    public ClimateAndWeatherModel setDay(String day) {
        this.day = day;
        return this;
    }

    public String getHour() {
        return hour;
    }

    public ClimateAndWeatherModel setHour(String hour) {
        this.hour = hour;
        return this;
    }
}
