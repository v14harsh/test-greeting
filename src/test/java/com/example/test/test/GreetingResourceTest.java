package com.example.test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.test.test.constants.GreetConstants;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GreetingResourceTest {
    
    @LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

    @Test
    public void morningGreet() {
        String greet = this.restTemplate.getForObject("http://localhost:" + port + "/greetings?hour=10",
                String.class);
        assertEquals(greet, GreetConstants.MORNING_GREET);
    }

    @Test
    public void afternoonGreet() {
        String greet = this.restTemplate.getForObject("http://localhost:" + port + "/greetings?hour=14",
                String.class);
        assertEquals(greet, GreetConstants.AFTERNOON_GREET);
    }

}