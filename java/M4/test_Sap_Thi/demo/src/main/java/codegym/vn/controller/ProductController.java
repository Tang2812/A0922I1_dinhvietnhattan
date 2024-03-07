package codegym.vn.controller;

import codegym.vn.entity.Product;
import codegym.vn.service.CategoryService;
import codegym.vn.service.ProductService;
import codegym.vn.validate.ProductValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class ProductController {
@Autowired
    CategoryService categoryService;
@Autowired
ProductService productService;
@GetMapping("")
String showList(Pageable pageable, Model model){
    pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("id"));
    model.addAttribute("products",productService.findAllPage(pageable));
    return "/view/product/list";
}
@GetMapping("/create")
    String showCreatePage(Model model){
    model.addAttribute("product", new Product());
    model.addAttribute("categorys",categoryService.findAll() );
    return "/view/product/create";
}
@PostMapping("/create")
    String doCreate(@Valid @ModelAttribute("product") Product product,
                    BindingResult bindingResult,Model model){
new ProductValidate().validate(product,bindingResult);
    if(bindingResult.hasErrors()){
        model.addAttribute("categorys",categoryService.findAll() );
        return "/view/product/create";
    }
    productService.save(product);
    return "redirect:";
}
@GetMapping("/delete")
    String delete(@RequestParam("id") Integer id,Model model){
    productService.delete(id);
    return "redirect:";
}
}
