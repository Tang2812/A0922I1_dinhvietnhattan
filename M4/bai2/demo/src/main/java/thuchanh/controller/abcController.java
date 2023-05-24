package thuchanh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class abcController {
        @GetMapping("/Sandwich")
    public String greeting( @RequestParam (defaultValue ="") String condiment,Model model) {
            List<String> giavi = new ArrayList<>();
            giavi.add(condiment);
            model.addAttribute("giavi", giavi);
        return "Index";
    }
}

