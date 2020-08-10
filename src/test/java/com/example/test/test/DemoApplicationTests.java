package com.example.test.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.test.test.resource.GreetingResource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private GreetingResource greetingResource;

	@Test
	void contextLoads() {
		assertNotNull(greetingResource);
	}

}
