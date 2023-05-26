package codegym.vn.controller;

import codegym.vn.service.EmplService;
import codegym.vn.service.EmployeeServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employeee")
public class EmployeeController {
@Autowired
    private EmplService emplService;
@GetMapping("/list")
    public String showList(Model model){
    model.addAttribute("employees",emplService.findAll());
return "List";
}
}
