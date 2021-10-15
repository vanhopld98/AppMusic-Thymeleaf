package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.model.MusicForm;
import com.codegym.service.MusicService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class MusicController {
    private MusicService musicService = new MusicService();
    @Value("${file-upload}")
    private String fileUpload;

    @GetMapping("")
    public ModelAndView index() {
        List<Music> musicList = musicService.getAll();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("musicList", musicList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("music", new Music());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute MusicForm musicForm) {
        ModelAndView modelAndView = new ModelAndView("redirect:/");
        MultipartFile multipartFile = musicForm.getMusic();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(musicForm.getMusic().getBytes(), new File(fileUpload + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Music music = new Music(musicForm.getId(), musicForm.getName(), musicForm.getSinger(), fileName);
        music.setId((int) (Math.random() * 1000));
        musicService.save(music);
        return modelAndView;
    }
}
