package thuchanh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import thuchanh.service.CalService;

@Controller
public class abcController {
    CalService s=new CalService();
    @GetMapping("/greeting")
    public String greeting( @RequestParam (value = "input", defaultValue ="0") String anh,Model model) {
        model.addAttribute("result",s.trans(anh));
        return "ListStudent";
    }
}

