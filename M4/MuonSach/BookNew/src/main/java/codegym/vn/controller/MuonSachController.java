package codegym.vn.controller;

import codegym.vn.service.BookService;
import codegym.vn.service.BorrowCardService;
import codegym.vn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("")
@Controller
public class MuonSachController {
@Autowired
    BookService bookService;
@Autowired
    BorrowCardService borrowCardService;
@Autowired
    UserService userService;
@GetMapping
    String showListBook(Model model){
    model.addAttribute("bookList",bookService.findAll());
    return "/view/muonSach/list";
}
@GetMapping("/muonSach")
    String ShowDetail(@RequestParam("id") Integer id, Model model){
    model.addAttribute("book",bookService.findById(id));
    return "/view/muonSach/detail";
}
@GetMapping("/doMuonSach")
    String showMuonSach(@RequestParam("id")Integer id,Model model){
    model.addAttribute("book",bookService.findById(id));
    return "/view/muonSach/muonSach";
}
@PostMapping("doMuonSach")
    String doMuonSach(@RequestParam("book_id")Integer bookId,
                      @RequestParam("user_id")Integer userId){
borrowCardService.borrowBook(bookId,userId);
return "redirect:";
}
}
