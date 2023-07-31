package codegym.vn.controller;

import codegym.vn.entity.Blog;
import codegym.vn.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Blog")
public class BlogController {
@Autowired
    BlogService service;
@GetMapping("/list")
    String showList(Model model){
    model.addAttribute("Blogs",service.findAll());
    return "/view/blog/list";
}
@GetMapping("/detail")
String showDetail(@ModelAttribute("id")Integer id,Model model){
    model.addAttribute("blog",service.findById(id));
    return "view/blog/detail";
}
@GetMapping("/create")
    String showCreatePage(Model model){
    model.addAttribute("newBlog",new Blog());
    return "/view/blog/create";
}
@PostMapping("/create")
    String doCreate(@ModelAttribute("newBlog")Blog newBlog, Model model){
    service.create(newBlog);
    return "redirect:/Blog/list";
}
@GetMapping("/delete")
    String doDelete(@ModelAttribute("id")Integer id,Model model){
    service.delete(id);
    return "redirect:/Blog/list";
}
@GetMapping("/update")
    String showUpdate(@ModelAttribute("id")Integer id,Model model){
    model.addAttribute("blog",service.findById(id));
    return ("/view/blog/update");
}
@PostMapping("/update")
    String doUpdate(@ModelAttribute("blog")Blog blog,Model model){
    service.update(blog);
    return "redirect:/Blog/list";
}
}
