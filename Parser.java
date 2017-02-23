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
        weather.setRegion(region.text());
        weather.setTemperature(element1.text());
        weather.setWind(element2.text());
        weather.setmPress(element3.text());
        weather.setWicon(wicon.text());
        weather.setWaterTemp(element4.text());
        weather.setLastInfo(h7Elements.text());

    }

    public Weather getWeather() throws IOException {

            return this.weather;
    }


}





