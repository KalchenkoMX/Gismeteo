package com.company;

 class Weather {
     String region;
     String temperature;
     String wind;
     String mPress;
     String wicon;
     String waterTemp;
     String lastInfo;


    public void setLastInfo(String lastInfo) {
        this.lastInfo = lastInfo;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public void setmPress(String mPress) {
        this.mPress = mPress;
    }

    public void setWicon(String wicon) {
        this.wicon = wicon;
    }

    public void setWaterTemp(String waterTemp) {
        this.waterTemp = waterTemp;
    }

        public String toString(){
            return  "Регіон: " + region + "\n" +
                    "Температура: " +  temperature + "\n" +
                    "Вітер: " + wind + "\n" +
                    "Тиск: " + mPress + "\n" +
                    "Вологість: " + wicon +  "\n" +
                    "Температура води: " + waterTemp + "\n" +
                    "Останній збір данних: " + lastInfo;
        }
}