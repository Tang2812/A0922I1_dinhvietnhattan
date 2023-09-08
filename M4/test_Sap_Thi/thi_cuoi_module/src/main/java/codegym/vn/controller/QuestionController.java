package codegym.vn.controller;

import codegym.vn.entity.QuestionContent;
import codegym.vn.entity.QuestionType;
import codegym.vn.service.QuestionContentService;
import codegym.vn.service.QuestionTypeService;
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
public class QuestionController {
    @Autowired
    QuestionContentService questionContentService;
    @Autowired
    QuestionTypeService questionTypeService;

    @GetMapping("")
    String showList(Model model, Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("status"));
        model.addAttribute("listContent", questionContentService.findAll(pageable));
        model.addAttribute("types", questionTypeService.findAll());
        return "/view/content/list";
    }

    @GetMapping("/detail")
    String showDetail(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("content", questionContentService.findById(id));
        return "/view/content/detail";
    }

    @GetMapping("/create")
    String showCreatePage(Model model) {
        model.addAttribute("question", new QuestionContent());
        model.addAttribute("types", questionTypeService.findAll());
        return "/view/content/create";
    }

    @PostMapping("/create")
    String doCreate(@Valid @ModelAttribute("question") QuestionContent questionContent,
                    BindingResult bindingResult
            , Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("types", questionTypeService.findAll());
            return "/view/content/create";
        }
        questionContentService.save(questionContent);
        return "redirect:";
    }

    @GetMapping("/delete")
    String delete(@RequestParam("id") Integer id, Model model) {
        questionContentService.delete(id);
        return "redirect:";
    }

    @GetMapping("/find")
    String find(@RequestParam("title") String title, Pageable pageable, Model model) {
        model.addAttribute("listContent", questionContentService.findbyTitle(title, pageable));
        model.addAttribute("types", questionTypeService.findAll());
        return "/view/content/list";
    }
    @GetMapping("/find1")
    String find(@RequestParam("Type") QuestionType type, Pageable pageable, Model model) {
        model.addAttribute("types", questionTypeService.findAll());
        model.addAttribute("listContent", questionContentService.findByType(type, pageable));
        return "/view/content/list";
    }
}
