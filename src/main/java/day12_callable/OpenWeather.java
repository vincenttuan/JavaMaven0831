package day12_callable;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.Scanner;

public class OpenWeather {
    public static void main(String[] args) throws Exception {
        String city = "Taoyuan"; // Taichung
        String url = "https://openweathermap.org/data/2.5/weather?q=%s,tw&appid=b6907d289e10d714a6e88b30761fae22";
        url = String.format(url, city);
        String json = new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
        System.out.println(json);
        
        JsonElement jelement = new JsonParser().parse(json);
        JsonObject  jobject = jelement.getAsJsonObject();
        jobject = jobject.getAsJsonObject("main");
        double temp = jobject.get("temp").getAsDouble();
        double pressure = jobject.get("pressure").getAsDouble();
        double humidity = jobject.get("humidity").getAsDouble();
        double temp_min = jobject.get("temp_min").getAsDouble();
        double temp_max = jobject.get("temp_max").getAsDouble();
        System.out.printf("%s 即時天氣狀況:\n溫度: %.2f\n濕度: %.2f\n最高溫度: %.2f\n最低溫度: %.2f\n氣壓: %.1f\n",
                          city, temp, humidity, temp_max, temp_min, pressure);
        
    }
}
