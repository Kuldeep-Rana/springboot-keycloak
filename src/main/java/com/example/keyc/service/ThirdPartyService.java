package com.example.keyc.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
@Retryable(value = {Exception.class}, maxAttempts = 2)
public class ThirdPartyService {
    private final RestTemplate restTemplate;
    private static final String API_URL = "https://fakerapi.it/api/v1/images?_width=380";

    public Map call() {
        var response = restTemplate.getForObject(API_URL, Map.class);
        log.info("", response);
        return response;
    }
}
