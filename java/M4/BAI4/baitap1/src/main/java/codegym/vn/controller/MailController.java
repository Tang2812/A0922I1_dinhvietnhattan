package codegym.vn.controller;

import codegym.vn.model.Mail;
import codegym.vn.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Mail")
public class MailController {
@Autowired
    private MailService mailService;
@GetMapping("/view")
    public String showList(Model model){
    model.addAttribute("mail", mailService.findAll());
return "List";
}
    @GetMapping("/edit")
    public String showCreate(Model model) {
        model.addAttribute("mail",mailService.findAll() );
        return "edit";
    }
    @PostMapping("/edit")
    public String doCreate(@ModelAttribute("mail") Mail mail) {
    mailService.edit(mail);
        return "redirect:view";
    }
}
