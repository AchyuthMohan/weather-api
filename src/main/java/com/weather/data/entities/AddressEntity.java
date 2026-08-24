package com.weather.data.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class AddressEntity {
    private String line1;
    private String line2;
    private String cityName;
    private String state;
    private String country;

    public AddressEntity(String line1, String line2, String cityName, String state, String country) {
        this.line1 = line1;
        this.line2 = line2;
        this.cityName = cityName;
        this.state = state;
        this.country = country;
    }

    public AddressEntity() {
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
