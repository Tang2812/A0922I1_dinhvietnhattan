package com.ThucHanh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class abcController {
    @GetMapping("/greeting")
    public String greeting() {
        return "ListStudent";
    }
}

