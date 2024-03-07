package thuchanh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import thuchanh.service.CalService;

@Controller
public class abcController {
    CalService s = new CalService();

    @GetMapping("")
    public String greeting() {
        return "index";
    }

    @PostMapping("caculator")
    public String caculator(@RequestParam("input1") float num1, @RequestParam("input2") float num2,
                            @RequestParam("calculation") String calculation, Model model) {

        if (num2 == 0 && calculation.equals("/") == true) {
            model.addAttribute("result", "khong the thuc hien phep toan nay");
        } else {
            model.addAttribute("result", "Ket qua la: " + s.Cal(num1, num2, calculation));
        }
        return "index";
    }
}

