package com.shop;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ScheduledTask {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String url = "https://backend-y0hv.onrender.com"; // Replace with your actual endpoint if needed

    @Scheduled(fixedRate = 300000) // Run every 5 minutes
    public void pingServer() {
        try {
            restTemplate.getForObject(url, String.class);
            System.out.println("Pinged " + url);
        } catch (Exception e) {
            System.err.println("Error pinging " + url + ": " + e.getMessage());
        }
    }
}
