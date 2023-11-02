package net.proselyte.keydatasctructures;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<TemperatureRecord> temperatureRecords = new LinkedList<>();

        TemperatureRecord t1 = new TemperatureRecord(23.5, LocalDateTime.now(), "NY");
        TemperatureRecord t2 = new TemperatureRecord(13.5, LocalDateTime.now(), "Tokyo");
        TemperatureRecord t3 = new TemperatureRecord(-3.8, LocalDateTime.now(), "London");

        temperatureRecords.add(t1);
        temperatureRecords.add(t2);
        temperatureRecords.add(t3);

        System.out.println(temperatureRecords);

        temperatureRecords.remove(t1);
        temperatureRecords.remove(t2);

        System.out.println(temperatureRecords);

        TemperatureRecord trN = temperatureRecords.get(0);
        System.out.println(trN);
    }
}
