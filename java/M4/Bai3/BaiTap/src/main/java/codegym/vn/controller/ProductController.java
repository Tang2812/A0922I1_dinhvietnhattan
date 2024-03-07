package codegym.vn.controller;

import codegym.vn.model.Product;
import codegym.vn.service.ProductServiceIMPL;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
@Autowired
    ProductServiceIMPL productServiceIMPL;
@GetMapping("/list")
public String showList(Model model){
model.addAttribute("products",productServiceIMPL.findAll());
return "product_thymleaf/list";
}
    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        return "product_thymleaf/create";
    }
    @PostMapping("/create")
    public String doCreate(@ModelAttribute("product") Product product) {

        productServiceIMPL.create(product);
        return "redirect:/product/list";
    }
    @GetMapping("/detail/{id}")
    public String showDetail(Model model,
                             @PathVariable("id") String id) {
        Product product = productServiceIMPL.findById(id);
        model.addAttribute("product", product);
        return "product_thymleaf/detail";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") String id, Model model) {
        model.addAttribute("product", productServiceIMPL.findById(id));
        return "product_thymleaf/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
        productServiceIMPL.update(product);
        return "redirect:/product/list";
    }
    @GetMapping("/delete")
    public String doDelete(@RequestParam("id") String id, Model model) {
        productServiceIMPL.deleteById(id);
        return "redirect:/product/list";
    }
}
