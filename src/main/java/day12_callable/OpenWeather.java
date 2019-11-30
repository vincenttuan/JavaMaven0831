package day12_callable;

import java.net.URL;
import java.util.Scanner;

public class OpenWeather {
    public static void main(String[] args) throws Exception {
        String url = "https://openweathermap.org/data/2.5/weather?q=%s,tw&appid=b6907d289e10d714a6e88b30761fae22";
        url = String.format(url, "Taoyuan");
        String json = new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
        System.out.println(json);
    }
}
