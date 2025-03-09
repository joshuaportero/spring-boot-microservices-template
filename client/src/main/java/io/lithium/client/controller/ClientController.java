package io.lithium.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    @GetMapping
    public ResponseEntity<Map<String, String>> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World!");
        return ResponseEntity.ok(response);
    }
}
