package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;


public class Parser {

    Weather weather;


    public Parser() {
        this.weather = new Weather();
    }

    public void parserWeather() throws IOException {
        Document doc = Jsoup.connect("https://www.gismeteo.ua/ua/weather-cherkasy-4956/").get();
        Elements region = doc.getElementsByAttributeValue("class", "scity"); 
        Elements temperature = doc.getElementsByAttributeValue("class", "temp"); 
        Elements wind = doc.getElementsByAttributeValue("class", "value m_wind ms"); 
        Elements mPress = doc.getElementsByAttributeValue("class", "value m_press torr");
        Elements wicon = doc.getElementsByAttributeValue("class", "wicon hum"); 
        Elements waterTemp = doc.getElementsByAttributeValue("class", "value m_temp c"); 
        Elements h7Elements = doc.getElementsByAttributeValue("class", "icon date"); 
        Element element1 = temperature.get(0);
        Element element2 = wind.first();
        Element element3 = mPress.first();
        Element element4 = waterTemp.get(1);
        weather.setRegion(region.text().toString());
        weather.setTemperature(element1.text().toString());
        weather.setWind(element2.text().toString());
        weather.setmPress(element3.text().toString());
        weather.setWicon(wicon.text().toString());
        weather.setWaterTemp(element4.text().toString());
        weather.setLastInfo(h7Elements.text().toString());

    }

    public Weather getWeather() throws IOException {

            return this.weather;
    }


}





