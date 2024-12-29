package com.example.birthday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirthdayController {

    @GetMapping("/birthday")
    public String birthday(@RequestParam(value="name", defaultValue="World") String name) {
        return "Happy Birthday, " + name + "！";
    }
}
