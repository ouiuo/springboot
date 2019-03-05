package com.example.anotherone.controller;

import com.example.anotherone.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MusicController {

    @Autowired
    MusicRepository musicRepository;

    @GetMapping("/index")
    public String index(
            @RequestParam(name = "name", defaultValue = "World")String name,
                    Map<String, Object> model){
        model.put("name", name);
        return "index";
    }


}
