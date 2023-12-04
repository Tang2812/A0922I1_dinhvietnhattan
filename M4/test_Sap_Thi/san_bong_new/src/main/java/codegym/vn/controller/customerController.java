package codegym.vn.controller;

import codegym.vn.entity.KhachHang;
import codegym.vn.service.KhachHangService;
import codegym.vn.validate.CustomerValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class customerController {
    @Autowired
    KhachHangService khachHangService;

    @GetMapping("")
    String showListCustomer(Pageable pageable, Model model) {
        model.addAttribute("listCus", khachHangService.findAll(pageable));
        return "view/sanBong/khachHangList";
    }

    @GetMapping("/delete")
    String deleteCustomer(@RequestParam("id") Integer id) {
        boolean check = khachHangService.delete(id);
        if (check) {
            return "redirect:/customer";
        } else {
            System.out.println(check);
            return "redirect:/customer";
        }
    }

    @GetMapping("/detail")
    String viewDetailCustomer(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("khachHang", khachHangService.findById(id));
        return "view/sanBong/detailCus";
    }

    @GetMapping("/create")
    String showCreatePage(Model model) {
        KhachHang khachHang = new KhachHang();
        model.addAttribute("newKhachHang", khachHang);
        return "view/sanBong/createCus";
    }

    @PostMapping("/create")
    String doCreate(@Valid @ModelAttribute("newKhachHang") KhachHang khachHang,
    BindingResult bindingResult,Model model) {
        CustomerValidate customerValidate= new CustomerValidate();
        customerValidate.validate(khachHang,bindingResult);
        if (bindingResult.hasErrors()){
            return "view/sanBong/createCus";
        }
        khachHangService.save(khachHang);
        return "redirect:/customer";
    }

    @GetMapping("/update")
    String showUpdatePageCustomer(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("customer", khachHangService.findById(id));
        return "view/sanBong/updateCus";
    }
    @PostMapping("update")
    String doUpdateCus(@ModelAttribute("customer")KhachHang khachHang){
        khachHangService.save(khachHang);
        return "redirect:/customer";
    }
}

