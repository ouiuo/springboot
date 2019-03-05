package com.example.anotherone.controller;

import com.example.anotherone.model.MusicModel;
import com.example.anotherone.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MusicController {

    @Autowired
    MusicRepository musicRepository;

    @GetMapping("/index")
    public String index(

            Map<String, Object> model) {
        List<MusicModel> all = musicRepository.findAll();
        model.put("music",all);
        return "index";
    }


    @RequestMapping("add")
    public String add(
            @RequestParam String projectname,
            @RequestParam String title,
            Map<String, Object> model
    ){
        MusicModel musicModel = new MusicModel(projectname,title);
        musicRepository.save(musicModel);

        List<MusicModel> all = musicRepository.findAll();
        model.put("music",all);
        return "index";
    }
    @RequestMapping("filter")
    public String filter(
            @RequestParam String projectname,
            Map<String, Object> model
    ){
        List<MusicModel> musicModels;
        if(projectname!=""){
            musicModels = musicRepository.findByProjectname(projectname);}
        else{
            musicModels = musicRepository.findAll();
        }

        model.put("music",musicModels);

        return "index";
    }



}
