package ru.sanctio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/")
    public String showStartView() {
        return "index";
    }
}
