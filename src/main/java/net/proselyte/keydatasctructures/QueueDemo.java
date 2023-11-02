package net.proselyte.keydatasctructures;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<TemperatureRecord> queue = new LinkedList<>();

        TemperatureRecord t1 = new TemperatureRecord(23.5, LocalDateTime.now(), "NY");
        TemperatureRecord t2 = new TemperatureRecord(13.5, LocalDateTime.now(), "Tokyo");
        TemperatureRecord t3 = new TemperatureRecord(-3.8, LocalDateTime.now(), "London");


        queue.offer(t1);
        queue.offer(t2);
        queue.offer(t3);

        TemperatureRecord temp = queue.poll();
        System.out.println(temp);
        temp = queue.poll();
        System.out.println(temp);
        temp = queue.poll();
        System.out.println(temp);
    }
}
