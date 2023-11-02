package net.proselyte.keydatasctructures;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<String, TemperatureRecord> temperatureRecordHashMap = new HashMap<>();

        TemperatureRecord t1 = new TemperatureRecord(23.5, LocalDateTime.now(), "NY");
        TemperatureRecord t2 = new TemperatureRecord(13.5, LocalDateTime.now(), "Tokyo");
        TemperatureRecord t3 = new TemperatureRecord(-3.8, LocalDateTime.now(), "London");

        temperatureRecordHashMap.put("NY", t1);
        temperatureRecordHashMap.put("Tokyo", t2);
        temperatureRecordHashMap.put("London", t3);


        TemperatureRecord temperatureRecord  = temperatureRecordHashMap.get("NY");
        System.out.println(temperatureRecord);

        temperatureRecordHashMap.remove("NY");
        temperatureRecord  = temperatureRecordHashMap.get("NY");
        System.out.println(temperatureRecord);
    }
}
