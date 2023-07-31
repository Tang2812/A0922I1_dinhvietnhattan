package codegym.vn.controller;

import codegym.vn.entity.Blog;
import codegym.vn.service.BlogService;
import codegym.vn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/blogs")
public class BlogController {
@Autowired
    BlogService blogService;
@Autowired
    CategoryService categoryService;
@GetMapping
    String showList(Pageable pageable,Model model){
    model.addAttribute("Blogs", blogService.findAll(pageable));
//    model.addAttribute("Blogs",service.findAll());
    return "/view/blog/list";
}
@GetMapping("/detail")
String showDetail(@ModelAttribute("id")Integer id,Model model){
    model.addAttribute("blog", blogService.findById(id));
    return "view/blog/detail";
}
@GetMapping("/create")
    String showCreatePage(Model model){
    model.addAttribute("newBlog",new Blog());
    model.addAttribute("category",categoryService.findAll());
    return "/view/blog/create";
}

@PostMapping
    String doCreate(@ModelAttribute("newBlog")Blog newBlog){
    blogService.save(newBlog);
    return "redirect:/blogs";
}
@DeleteMapping("/delete")
    String doDelete(@ModelAttribute("id")Integer id,Model model){
    blogService.delete(id);
    return "redirect:/blogs";
}
@GetMapping("/update")
    String showUpdate(@ModelAttribute("id")Integer id,Model model){
    model.addAttribute("blog", blogService.findById(id));
    return ("/view/blog/update");
}
    @GetMapping("/search")
    String showSearch(Pageable pageable, @RequestParam String author,Model model){
        model.addAttribute("Blogs", blogService.findBlogByAuthorContaining(pageable,author));
        return ("/view/blog/list");
    }
}
