package codegym.vn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {
@GetMapping("")
    String showIndex(){
    return "/view/sanBong/Index";
}
}
