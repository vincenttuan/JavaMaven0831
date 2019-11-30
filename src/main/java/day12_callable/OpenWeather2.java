package day12_callable;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class OpenWeather2 {
    static String city = "Taoyuan";
    public static void main(String[] args) throws Exception {
        Callable<String> ca1 = () -> {
            String json = "";
            try {
                String url = "https://openweathermap.org/data/2.5/weather?q=%s,tw&appid=b6907d289e10d714a6e88b30761fae22";
                url = String.format(url, city);
                json = new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
            } catch (Exception e) {
            }
            return json;
        };
        
        Callable<Map<String, Double>> ca2 = () -> {
            
            // 調用 Callable 取得 json 天氣資料
            FutureTask<String> task = new FutureTask<>(ca1);
            new Thread(task).start();
            String json = task.get();
            
            // 分析天氣資料 by json
            JsonElement jelement = new JsonParser().parse(json);
            JsonObject  jobject = jelement.getAsJsonObject();
            jobject = jobject.getAsJsonObject("main");
            Map<String, Double> map = new LinkedHashMap<>();
            map.put("temp", jobject.get("temp").getAsDouble());
            map.put("pressure", jobject.get("pressure").getAsDouble());
            map.put("humidity", jobject.get("humidity").getAsDouble());
            map.put("temp_min", jobject.get("temp_min").getAsDouble());
            map.put("temp_max", jobject.get("temp_max").getAsDouble());
            return map;
        };
        
        //-----------------------------------------------------------------
        
        FutureTask<Map<String, Double>> task2 = new FutureTask<>(ca2);
        new Thread(task2).start();
        Map<String, Double> map = task2.get();
        
        System.out.printf("%s 即時天氣狀況:\n溫度: %.2f\n濕度: %.2f\n最高溫度: %.2f\n最低溫度: %.2f\n氣壓: %.1f\n",
                          city, map.get("temp"), map.get("humidity"), map.get("temp_max"), map.get("temp_min"), map.get("pressure"));
        
        
        
    }
}
