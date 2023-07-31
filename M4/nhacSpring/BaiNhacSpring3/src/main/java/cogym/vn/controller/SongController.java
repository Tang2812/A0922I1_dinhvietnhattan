package cogym.vn.controller;

import cogym.vn.entity.Song;
import cogym.vn.service.SongService;
import cogym.vn.service.SongServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/song")
@Controller
public class SongController {
    @Autowired
    SongServiceImpl service;
@GetMapping("/List")
    String showList(Model model){
model.addAttribute("songs",service.findAll());
return "/view/song/list";
    }
@GetMapping("/Create")
    String showCreatePage(Model model){
    model.addAttribute("song",new Song());
    return "/view/song/create";
}
@PostMapping("/Create")
    String doCreate(@ModelAttribute("song") Song song, Model model){
    service.create(song);
    return "redirect:/song/List";
}
@GetMapping("/detail/{id}")
    String showDetail(@PathVariable("id") Integer id, Model model){
    model.addAttribute("song",service.findById(id));
    return ("/view/song/detail");
}
}
