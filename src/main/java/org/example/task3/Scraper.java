package org.example.task3;

import lombok.SneakyThrows;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scraper {
    @SneakyThrows
    public static Map<String, String> extract(String domain) {
        URL url = new URL(domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        Scanner scanner = new Scanner(connection.getInputStream());
        StringBuilder response = new StringBuilder();
        while (scanner.hasNext()) {
            response.append(scanner.next());
        }
        scanner.close();
        Map<String, String> extractedData = new HashMap<>();
        extractedData.put("Response", response.toString());
        return extractedData;
    }
}