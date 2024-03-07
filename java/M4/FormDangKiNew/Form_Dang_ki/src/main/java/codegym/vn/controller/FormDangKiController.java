package codegym.vn.controller;

import codegym.vn.dto.FormDangKiDto;
import codegym.vn.entiry.FormDangKi;
import codegym.vn.service.FormDangKiService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/forms")
public class FormDangKiController {
@Autowired
    FormDangKiService formDangKiService;
@GetMapping
    String showList(Model model){
    model.addAttribute("forms",formDangKiService.findAll());
    return "/view/form/list";
}
@GetMapping("/create")
String showCreatePage(Model model){
    model.addAttribute("form",new FormDangKiDto());
    return "/view/form/create";
}
@PostMapping
    String doCreate(@Validated @ModelAttribute("form")FormDangKiDto FormDangKiDto,
                    BindingResult bindingResult,Model model){
new FormDangKiDto().validate(FormDangKiDto,bindingResult);
   if(bindingResult.hasErrors()){
       return "/view/form/create";
   }
    FormDangKi formDangKi= new FormDangKi();
    BeanUtils.copyProperties(FormDangKiDto,formDangKi);
    formDangKiService.create(formDangKi);
    return "redirect: /forms";
}
}
