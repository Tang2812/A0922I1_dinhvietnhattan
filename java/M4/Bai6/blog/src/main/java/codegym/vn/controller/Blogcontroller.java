package codegym.vn.controller;

import codegym.vn.entity.Blog;
import codegym.vn.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blog")
public class Blogcontroller {
@Autowired
    BlogService blogService;
@GetMapping("/list")
    public String showList(Model model){
model.addAttribute("Blogs",blogService.findAll());
return "blog_thymleaf/list";
}
@GetMapping("/create")
    public String showCreate(Model model){
model.addAttribute("Blog",new Blog());
return "blog_thymleaf/create";
}
@PostMapping("/create")
    public String doCreate(@ModelAttribute("Blog") Blog blog){
blogService.create(blog);
return "redirect:/blog/list";
}
@GetMapping("/detail")
    public String showDetail(@RequestParam("id") Integer id,Model model){
Blog blog= blogService.findById(id);
model.addAttribute("blog",blog);
    return "blog_thymleaf/detail";
}
    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") Integer id,Model model){
        Blog blog= blogService.findById(id);
        model.addAttribute("blog",blog);
        return "blog_thymleaf/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("blog") Blog blog){
blogService.update(blog);
    return "redirect: /blog/list";
    }
}
