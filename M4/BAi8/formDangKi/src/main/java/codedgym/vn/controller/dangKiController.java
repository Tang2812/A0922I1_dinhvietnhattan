package codedgym.vn.controller;

import codedgym.vn.entity.DangKi;
import codedgym.vn.service.dangKiService;
import codedgym.vn.validate.dangKiValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/Dangki")
public class dangKiController {
@Autowired
    private dangKiService dangKiService;
@Autowired
   private dangKiValidate validate;
@GetMapping("/List")
    public String showList(Model model){
    model.addAttribute("dangKi",dangKiService.findAll());
    return "/view/dangKi/list";
}
@GetMapping("/create")
    public String showCreate(Model model){
model.addAttribute("dangKi",new DangKi());
return "/view/dangKi/create";
}
@PostMapping("/create")
    public String  doCreate(@Validated @ModelAttribute("dangKi")DangKi dangKi,
                            BindingResult bindingResult,Model model){
    validate.validate(dangKi,bindingResult);
    if(bindingResult.hasErrors()){
        return "/view/dangKi/create";
    }
    dangKiService.create(dangKi);
    return "redirect:/Dangki/List";
}
}
