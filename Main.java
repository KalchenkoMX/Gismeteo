package com.company;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        Parser parser = new Parser();
        parser.parserWeather();
        parser.getWeather();
        //sa
        System.out.println(parser.getWeather().toString());



    }


}
