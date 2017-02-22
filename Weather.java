package com.company;
public class Weather {

    String region;
    String temperature; 
    String wind; 
    String mPress; 
    String wicon;  
    String waterTemp;

    public String getLastInfo() {
        return lastInfo;
    }

    public void setLastInfo(String lastInfo) {
        this.lastInfo = lastInfo;
    }

    String lastInfo; 



    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getmPress() {
        return mPress;
    }

    public void setmPress(String mPress) {
        this.mPress = mPress;
    }

    public String getWicon() {
        return wicon;
    }

    public void setWicon(String wicon) {
        this.wicon = wicon;
    }

    public String getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(String waterTemp) {
        this.waterTemp = waterTemp;
    }


        public String toString(){
            return "Регіон: " + region + "\n"
                    + "Температура: " +  temperature + "\n"
                    + "Вітер: " + wind + "\n" +
                    "Тиск: " + mPress + "\n" +
                    "Вологість: " + wicon +  "\n"+
                    "Температура води: " + waterTemp + "\n" +
                    "Останній збір данних: " + lastInfo;
        }
}

