package com.example.productapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @RequestMapping(method = RequestMethod.POST, path = "/friendship")
    public ResponseEntity<String> postGreetingRoot(@RequestBody Object req) {
        String[] splitter = req.toString().replace("{", "").replace("}", "").replace(",", "").split(" ");
        System.out.println("The " + splitter[0]);
        System.out.println("This " + splitter[1] + " just added");
        System.out.println("This " + splitter[2] + " to be friends");

        return ResponseEntity.ok(req + " sadsad");
    }
}
