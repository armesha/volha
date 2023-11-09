package com.volha.labdbmanger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainCotnroller {

    @GetMapping(path = "/message")
    public String mainController() {
        return "Message";
    }
}
