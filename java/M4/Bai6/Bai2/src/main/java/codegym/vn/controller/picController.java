package codegym.vn.controller;

import codegym.vn.entity.Picture;
import codegym.vn.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Picture")
@Controller
public class picController {
    @Autowired
    private PicService picService;
@GetMapping("/List")
    public String showList(Model model){
        model.addAttribute("picList", picService.findAll());
        model.addAttribute("picture", new Picture());
        return"View";
}
@PostMapping("/create")
    public String doCreate(@ModelAttribute("picture") Picture picture){

picService.create(picture);
return"redirect:/Picture/List";
}
}
