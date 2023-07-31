package codegym.vn.controller;

import codegym.vn.entity.Blog;
import codegym.vn.service.BlogService;
import codegym.vn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class Blogcontroller {
@Autowired
    BlogService blogService;
@Autowired
    CategoryService categoryService;
@GetMapping("/list")
    public String showList(Model model){
model.addAttribute("Blogs",blogService.findAll());
return "view/blog/list";
}
@GetMapping("/sort")
    public String sortList(Model model, RedirectAttributes redirectAttributes){
    model.addAttribute("Blogs",blogService.sortByDate());
   // redirectAttributes.addFlashAttribute("BLogs",blogService.sortByDate());
        return "view/blog/ListSort";}
@GetMapping("/create")
    public String showCreate(Model model){
model.addAttribute("Blog",new Blog());
model.addAttribute("categories",categoryService.findAll());
return "view/blog/create";
}
@PostMapping("/create")
    public String doCreate(@ModelAttribute("Blog") Blog blog){
blog.setCategory(categoryService.findById(blog.getCategory().getCategoryId()));
blogService.create(blog);
return "redirect:/blog/list";
}
@GetMapping("/detail")
    public String showDetail(@RequestParam("id") Integer id,Model model){
Blog blog= blogService.findById(id);
model.addAttribute("blog",blog);
    return "view/blog/detail";
}
    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") Integer id,Model model){
        Blog blog= blogService.findById(id);
        model.addAttribute("blog",blog);
        model.addAttribute("categories",categoryService.findAll());
        return "view/blog/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("blog") Blog blog){
        blog.setCategory(categoryService.findById(blog.getCategory().getCategoryId()));
blogService.update(blog);
    return "redirect:/blog/list";
    }
}
