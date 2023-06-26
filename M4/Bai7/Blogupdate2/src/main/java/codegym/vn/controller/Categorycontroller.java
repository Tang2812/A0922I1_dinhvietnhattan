package codegym.vn.controller;

import codegym.vn.entity.Category;
import codegym.vn.service.CategoryService;
import codegym.vn.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class Categorycontroller {
    @Autowired
    CategoryService categoryService;
    @GetMapping("list")
    public String showListCategory(Model model){
    model.addAttribute("categories",categoryService.findAll());
    return "view/blog/Categorylist";
    }
    @GetMapping("create")
    public String showCreate(Model model){
     model.addAttribute("category",new Category());
     return "/view/blog/createCategory";
    }
}
