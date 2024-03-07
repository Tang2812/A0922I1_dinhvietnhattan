package codegym.vn.controller;

import codegym.vn.entity.KhuVuc;
import codegym.vn.entity.LoaiSan;
import codegym.vn.entity.SanBong;
import codegym.vn.service.KhuVucService;
import codegym.vn.service.KhungGioChoThueService;
import codegym.vn.service.LoaiSanService;
import codegym.vn.service.SanBongService;
import codegym.vn.validate.SanBongValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/sanBong")
public class controller {
    @Autowired
    SanBongService sanBongService;
    @Autowired
    KhuVucService khuVucService;
    @Autowired
    KhungGioChoThueService khungGioChoThueService;
    @Autowired
    LoaiSanService loaiSanService;

    @GetMapping("")
    String showList(Pageable pageable, Model model) {
        model.addAttribute("sanBongList", sanBongService.findAll(pageable));
        model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
        model.addAttribute("listSan", loaiSanService.findAll());
        model.addAttribute("listKhuVuc", khuVucService.findAll());
        return "/view/sanBong/list";
    }

    @GetMapping("/detail")
    String showDetail(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("sanBong", sanBongService.findById(id));
        return "/view/sanBong/detail";
    }

    @GetMapping("/searchName")
    String searchName(@RequestParam("name") String name, Pageable pageable, Model model) {
        model.addAttribute("sanBongList", sanBongService.findByName(name, pageable));
        model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
        model.addAttribute("listKhuVuc", khuVucService.findAll());
        model.addAttribute(("listSan"), loaiSanService.findAll());
        return "/view/sanBong/list";
    }

    @GetMapping("/searchKhuVuc")
    String searchKhuVuc(@RequestParam("id_khu_vuc") Integer id, Pageable pageable, Model model) {
        model.addAttribute("sanBongList", sanBongService.findByKhuVuc(id, pageable));
        model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
        model.addAttribute(("listSan"), loaiSanService.findAll());
        model.addAttribute("listKhuVuc", khuVucService.findAll());
        return "/view/sanBong/list";
    }

    @GetMapping("/searchLoaiSan")
    String searchLoaiSan(@RequestParam("id_loai_san") Integer id, Pageable pageable, Model model) {
        model.addAttribute("sanBongList", sanBongService.findByLoaiSan(id, pageable));
        model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
        model.addAttribute(("listSan"), loaiSanService.findAll());
        model.addAttribute("listKhuVuc", khuVucService.findAll());
        return "/view/sanBong/list";
    }

    @GetMapping("/findByAll")
    String searchByAll(@RequestParam(value = "id_loai_san", defaultValue = "") LoaiSan loaiSan,
                       @RequestParam(value = "id_khu_vuc", defaultValue = "") KhuVuc khuVuc,
                       @RequestParam(value = "name", defaultValue = "") String name, Pageable pageable, Model model) {
        System.out.println(loaiSan);
        System.out.println(khuVuc);
        System.out.println(name);
        if (khuVuc == null && loaiSan == null) {
            model.addAttribute("sanBongList", sanBongService.findByName(name, pageable));
            model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
            model.addAttribute(("listSan"), loaiSanService.findAll());
            model.addAttribute("listKhuVuc", khuVucService.findAll());
            return "/view/sanBong/list";
        }
        if (name.equals("")==true && khuVuc == null) {
            model.addAttribute("sanBongList", sanBongService.findByLoaiSan(loaiSan.getIdLoaiSan(), pageable));
            model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
            model.addAttribute(("listSan"), loaiSanService.findAll());
            model.addAttribute("listKhuVuc", khuVucService.findAll());
            return "/view/sanBong/list";
        }
        if (name.equals("")==true  && loaiSan == null) {
            model.addAttribute("sanBongList", sanBongService.findByKhuVuc(khuVuc.getIdKhuVuc(), pageable));
            model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
            model.addAttribute(("listSan"), loaiSanService.findAll());
            model.addAttribute("listKhuVuc", khuVucService.findAll());
            return "/view/sanBong/list";
        }

        model.addAttribute("sanBongList", sanBongService.findByAll1(name, khuVuc, loaiSan, pageable));
        model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
        model.addAttribute(("listSan"), loaiSanService.findAll());
        model.addAttribute("listKhuVuc", khuVucService.findAll());
        return "/view/sanBong/list";
    }

    @GetMapping("/create")
    String showCreatePage(Model model) {
        model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
        model.addAttribute("listSan", loaiSanService.findAll());
        model.addAttribute("listKhuVuc", khuVucService.findAll());
        model.addAttribute("sanBong", new SanBong());
        return "/view/sanBong/create";
    }

    @PostMapping("/create")
    String doCreate(@Valid @ModelAttribute("sanBong") SanBong sanBong,
            BindingResult bindingResult
            , Model model) {
        SanBongValidate sanBongValidate = new SanBongValidate();
        sanBongValidate.setSanBongList(this.sanBongService.findAllList());
        sanBongValidate.validate(sanBong,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
            model.addAttribute("listSan", loaiSanService.findAll());
            model.addAttribute("listKhuVuc", khuVucService.findAll());
            return "/view/sanBong/create";
        }
        sanBongService.save(sanBong);
        return "redirect:";
    }

    @GetMapping("/delete")
    String doDelete(@RequestParam("id") Integer id) {
        sanBongService.delete(id);
        return "redirect:";
    }
    @GetMapping("/update")
    String showUpdate(@RequestParam("id") Integer id, Model model) {
        model.addAttribute("sanBong", sanBongService.findById(id));
        model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
        model.addAttribute("listSan", loaiSanService.findAll());
        model.addAttribute("listKhuVuc", khuVucService.findAll());
        return "/view/sanBong/update";
    }
    @PostMapping("/update")
    String doUpdate(@Valid @ModelAttribute("sanBong") SanBong sanBong,
                    BindingResult bindingResult
            , Model model) {
        SanBongValidate sanBongValidate = new SanBongValidate();
        sanBongValidate.setSanBongList(this.sanBongService.findAllList());
        sanBongValidate.validate(sanBong,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("sanBong", sanBongService.findById(sanBong.getId()));
            model.addAttribute("listkhunggio", khungGioChoThueService.findAll());
            model.addAttribute("listSan", loaiSanService.findAll());
            model.addAttribute("listKhuVuc", khuVucService.findAll());
            return "/view/sanBong/update";
        }
        sanBongService.save(sanBong);
        return "redirect:";
    }
}
