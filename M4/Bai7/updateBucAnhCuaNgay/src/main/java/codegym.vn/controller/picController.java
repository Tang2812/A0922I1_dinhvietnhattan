package codegym.vn.controller;

import codegym.vn.entity.Picture;
import codegym.vn.repository.PicRepository;
import codegym.vn.service.PicSerice;
import codegym.vn.service.PicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
@RequestMapping("/Picture")
@Controller
public class picController {
    @Autowired
    private PicSerice picRepository;
@GetMapping("/List")
    public String showList(Model model){
        model.addAttribute("picList",picRepository.findAll());
        model.addAttribute("picture", new Picture());
        return"view/pic/View";
}
@PostMapping("/create")
    public String doCreate(@ModelAttribute("picture") Picture picture){

picRepository.create(picture);
return"redirect:/Picture/List";
}
}
