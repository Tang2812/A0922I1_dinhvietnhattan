package codegym.vn.controller;

import codegym.vn.entity.BucAnh;
import codegym.vn.service.BucAnhService;
import codegym.vn.service.BucAnhServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/BucAnh")
public class BucAnhController {
@Autowired
BucAnhService bucAnhService;
@GetMapping("/list")
    private String showlist(Model model){
    model.addAttribute("ListBucAnh",bucAnhService.findAll());
    model.addAttribute("newAnh",new BucAnh());
    return "/view/BucAnh/list";
}
@PostMapping("/create")
    private String showCreatePage(@ModelAttribute("newAnh") BucAnh bucAnh, Model model){
    bucAnhService.create(bucAnh);
    return ("redirect:/BucAnh/list");
}
@GetMapping("/Like")
    String doLike(@RequestParam("id")Integer id,Model model){
    bucAnhService.like(id);
    model.addAttribute("ListBucAnh",bucAnhService.findAll());
    model.addAttribute("newAnh",new BucAnh());
    return ("redirect:/BucAnh/list");

}
}
