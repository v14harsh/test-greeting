package com.example.test.test.resource;

import org.springframework.web.bind.annotation.RestController;

import com.example.test.test.constants.GreetConstants;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GreetingResource {

    @GetMapping(value="/greetings")
    public ResponseEntity<String> greetings(@RequestParam Integer hour) {
        String greet = null;
        if (hour < 12) greet = GreetConstants.MORNING_GREET;
        else if (hour < 16) greet = GreetConstants.AFTERNOON_GREET;
        else greet = GreetConstants.EVENING_GREET;
        return ResponseEntity.ok(greet);
    }
    

}
