package com.eftomi.h2demo.controller;

import com.eftomi.h2demo.service.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @Autowired
    private BoxService boxService;

    @GetMapping("/")
    public String display(Model model) {
        model.addAttribute("boxes", boxService.getBoxes());
        return "display";
    }
}
