package codegym1.vn.controller;

import codegym1.vn.repository.MusicRepository;
import codegym1.vn.repository.impl.MusicRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Music")
public class MusicController {
    @Autowired
  private MusicRepository musicRepository;
    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("songs", musicRepository.findAll());
        return "music_thymleaf/list";
    }
//
//    @GetMapping("/create")
//    public String showCreate(Model model) {
//        model.addAttribute("product", new Product());
//        model.addAttribute("categories", categoryRepository.findAll());
//        return "music_thymleaf/create";
//    }
//
//    @PostMapping("/create")
//    public String doCreate(@ModelAttribute("product") Product product) {
//        product.setCategory(categoryRepository.findById(product.getCategory().getCategoryId()));
//        productRepository.create(product);
//        return "redirect:/Music/list";
//    }
//
//    @GetMapping("/detail/{id}")
//    public String showDetail(Model model,
//                             @PathVariable("id") int id) {
//        Product product = productRepository.findById(id);
//        model.addAttribute("product", product);
//        return "music_thymleaf/detail";
//    }
//
//    @GetMapping("/update")
//    public String showUpdate(@RequestParam("id") int id, Model model) {
//        model.addAttribute("product", productRepository.findById(id));
//        model.addAttribute("categories", categoryRepository.findAll());
//        return "music_thymleaf/update";
//    }
//
//    @PostMapping("/update")
//    public String doUpdate(@ModelAttribute("product") Product product) {
//        product.setCategory(categoryRepository.findById(product.getCategory().getCategoryId()));
//        productRepository.update(product);
//        return "redirect:/Music/list";
//    }
}
