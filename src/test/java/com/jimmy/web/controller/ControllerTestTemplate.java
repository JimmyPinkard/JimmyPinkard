package com.jimmy.web.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
public abstract class ControllerTestTemplate {
    @LocalServerPort
    private int port;
    @Value("${domainName}")
    final String domainName = "localhost";

    @Autowired
    private TestRestTemplate restTemplate;

    protected String getBaseUrl(final String endpoint) {
        return domainName + ":" + port + endpoint;
    }

    protected String getUrl(final String endpoint) {
        return "http://" + getBaseUrl(endpoint);
    }

    protected String getSslUrl(final String endpoint) {
        return "https://" + getBaseUrl(endpoint);
    }

    public <T> ResponseEntity<T> makePostRequest(String endpoint, Object body, Class<T> clazz) {
        return restTemplate.postForEntity(getSslUrl(endpoint), body, clazz);
    }

    public <T> T getPageRequest(String endpoint, Class<T> clazz) {
        return restTemplate.getForObject(getSslUrl(endpoint), clazz);
    }

    public <T> T makeGetRequest(String endpoint, Class<T> clazz, Map<String, Object> urlParams) {
        return restTemplate.getForObject(getSslUrl(endpoint), clazz, urlParams);
    }
}
