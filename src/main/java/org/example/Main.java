package org.example;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        // LocalDateTime has no timezone.
        LocalDateTime now = LocalDateTime.parse("2023-12-01 11:22:33.444", formatter);

        // Set timezone to UTC.
        ZonedDateTime utc = now.atZone(ZoneId.of("UTC"));
        System.out.println("UTC : " + formatter.format(utc));

        // Convert to JST.
        ZonedDateTime jst = utc.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("JST : " + formatter.format(jst));
    }
}