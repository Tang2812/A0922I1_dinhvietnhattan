package codegym.vn.controller;

import codegym.vn.entity.Product;
import codegym.vn.service.CategoryService;
import codegym.vn.service.ProductService;
import codegym.vn.validate.ProductValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productRepository;
    @Autowired
    private CategoryService categoryRepository;
    @Autowired
    private ProductValidate validate;
    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("products", productRepository.findAll());
        model.addAttribute("categories", categoryRepository.findAll());
        return "/view/product/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryRepository.findAll());
        return "/view/product/create";
    }

    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("product") Product product,
            BindingResult bindingResult, Model model) {
        validate.validate(product, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", categoryRepository.findAll());
            return "/view/product/create";
        }
        product.setCategory(categoryRepository.findById(product.getCategory().getCategoryId()));
        productRepository.create(product);
        return "redirect:/product/list";
    }
    @GetMapping("/delete")
    public String doDelete(@RequestParam("id") int id,Model model) {
           productRepository.deleteById(id);
        return "redirect:/product/list";
        }


    @GetMapping("/detail/{id}")
    public String showDetail(Model model,
                             @PathVariable("id") int id) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "/view/product/detail";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("product", productRepository.findById(id));
        model.addAttribute("categories", categoryRepository.findAll());
        return "/view/product/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
        product.setCategory(categoryRepository.findById(product.getCategory().getCategoryId()));
        productRepository.update(product);
        return "redirect:/product/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam("name") String name, Model model) {
        List<Product> productList = productRepository.findProductByName(name);
        model.addAttribute("products", productList);
        model.addAttribute("name", name);
        return "/view/product/list";
    }
    @GetMapping("/searchPrice")
    public String search(@RequestParam("max") Double max, Model model) {
        List<Product> productList = productRepository.findProductByPrice(max);
        model.addAttribute("products", productList);
        model.addAttribute("max", max);
        return "/view/product/list";
    }
    @GetMapping("/searchCategory")
    public String search(@RequestParam("categoryId") int categoryId, Model model) {
        List<Product> productList = productRepository.findProductByCategory(categoryId);
        model.addAttribute("products", productList);
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("categories", categoryRepository.findAll());
        return "/view/product/list";
    }
    @GetMapping("/searchall")
    public String search(@RequestParam("categoryId") int categoryId,@RequestParam("max") Double max,@RequestParam("name") String name, Model model) {
        List<Product> productList = productRepository.findProductByall(name,categoryId,max);
        model.addAttribute("products", productList);
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("max", max);
        model.addAttribute("name", name);
        model.addAttribute("categories", categoryRepository.findAll());
        return "/view/product/list";
    }
}
