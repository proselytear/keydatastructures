package net.proselyte.keydatasctructures;

import java.time.LocalDateTime;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<TemperatureRecord> temperatureRecords = new Stack<>();
        TemperatureRecord t1 = new TemperatureRecord(23.5, LocalDateTime.now(), "NY");
        TemperatureRecord t2 = new TemperatureRecord(13.5, LocalDateTime.now(), "Tokyo");
        TemperatureRecord t3 = new TemperatureRecord(-3.8, LocalDateTime.now(), "London");

        temperatureRecords.push(t1);
        temperatureRecords.push(t2);
        temperatureRecords.push(t3);

        TemperatureRecord temp = temperatureRecords.pop();
        System.out.println(temp);
        temp = temperatureRecords.pop();
        System.out.println(temp);
        temp = temperatureRecords.pop();
        System.out.println(temp);
    }
}
