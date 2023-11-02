package net.proselyte.keydatasctructures;

import java.time.LocalDateTime;

public class StaticArrayDemo {
    public static void main(String[] args) {
        //N - количество входных
        //O(1)
        TemperatureRecord [] temperatureRecords = new TemperatureRecord[100_000_000];

        temperatureRecords[0] = new TemperatureRecord(23.5, LocalDateTime.now(), "NY");
        temperatureRecords[99_999_999] = new TemperatureRecord(13.5, LocalDateTime.now(), "Tokyo");
        temperatureRecords[2] = new TemperatureRecord(-3.8, LocalDateTime.now(), "London");

        //O(N)
        for (int i = 0; i < temperatureRecords.length; i++) {
            if(temperatureRecords[i] != null && temperatureRecords[i].getCity().equals("Tokyo")) {
                System.out.println("Temperature in Tokyo is: " + temperatureRecords[i].getTemperature());
            }
        }

        //Binary search - O(log N)


    }
}
