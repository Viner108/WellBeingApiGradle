package com.library.dto;

public class UserHealthDto {
    private Long id;
    public Long userId;
    public String pressure;
    public String headAche;
    public String date;
    public String drowsiness;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHeadAche() {
        return headAche;
    }

    public void setHeadAche(String headAche) {
        this.headAche = headAche;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDrowsiness() {
        return drowsiness;
    }

    public void setDrowsiness(String drowsiness) {
        this.drowsiness = drowsiness;
    }
}