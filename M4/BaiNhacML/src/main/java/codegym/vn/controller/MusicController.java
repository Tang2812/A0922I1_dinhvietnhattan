package codegym.vn.controller;

import codegym.vn.entity.Music;
import codegym.vn.repository.MusicRepository;
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

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("music", new Music());
        return "music_thymleaf/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("music") Music music) {
        musicRepository.create(music);
        return "redirect:/Music/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(Model model,
                             @PathVariable("id") int id) {
        Music music = musicRepository.findById(id);
        model.addAttribute("music", music);
        return "music_thymleaf/detail";
    }

    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("music", musicRepository.findById(id));

        return "music_thymleaf/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("music") Music music) {

        musicRepository.update(music);
        return "redirect:/Music/list";
    }
}
