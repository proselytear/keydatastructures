package net.proselyte.keydatasctructures;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        Set<TemperatureRecord> temperatureRecords = new TreeSet<>(Comparator.comparing(TemperatureRecord::getCity));

        TemperatureRecord t1 = new TemperatureRecord(23.5, LocalDateTime.now(), "NY");
        TemperatureRecord t2 = new TemperatureRecord(13.5, LocalDateTime.now(), "Tokyo");
        TemperatureRecord t3 = new TemperatureRecord(-3.8, LocalDateTime.now(), "London");

        temperatureRecords.add(t1);
        temperatureRecords.add(t2);
        temperatureRecords.add(t3);

        System.out.println(temperatureRecords);
    }
}
