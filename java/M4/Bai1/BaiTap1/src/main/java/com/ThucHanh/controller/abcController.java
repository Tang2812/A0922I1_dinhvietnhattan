package com.ThucHanh.controller;
import com.ThucHanh.service.Cal;
import com.ThucHanh.service.CalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class abcController {
    CalService s=new CalService();
    @GetMapping("/greeting")
    public String greeting( @RequestParam (value = "input", defaultValue ="0") int USD,Model model) {
        model.addAttribute("result",s.VND(USD));
        return "ListStudent";
         }
}


