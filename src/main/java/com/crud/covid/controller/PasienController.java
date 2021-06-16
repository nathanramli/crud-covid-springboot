package com.crud.covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.crud.covid.service.PasienService;

@Controller
public class PasienController {
    @Autowired
    private PasienService pasienService;

    @GetMapping("/")
    public String IndexView(Model model){
        model.addAttribute("title", "Home");
        return "index";
    }    
}
