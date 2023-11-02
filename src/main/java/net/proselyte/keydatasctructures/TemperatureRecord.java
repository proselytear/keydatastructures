package net.proselyte.keydatasctructures;

import java.time.LocalDateTime;

public class TemperatureRecord {
    private Double temperature;
    private LocalDateTime registrationDate;
    private String city;

    public TemperatureRecord() {
    }

    public TemperatureRecord(Double temperature, LocalDateTime registrationDate, String city) {
        this.temperature = temperature;
        this.registrationDate = registrationDate;
        this.city = city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "TemperatureRecord{" +
                "temperature=" + temperature +
                ", registrationDate=" + registrationDate +
                ", city='" + city + '\'' +
                '}';
    }
}
