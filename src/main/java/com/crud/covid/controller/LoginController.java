package com.crud.covid.controller;

import com.crud.covid.service.AnamnesaService;
import com.crud.covid.service.PasienService;
import com.crud.covid.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Autowired
    private PasienService pasienService;
    @Autowired
    private AnamnesaService anamnesaService;
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewIndex(Model model){
        model.addAttribute("title", "Home");
        model.addAttribute("countPasien", pasienService.countAllPasien());
        model.addAttribute("countAnamnesa", anamnesaService.countAllAnamnesa());
        model.addAttribute("countUser", userService.countAllUser());
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.getPrincipal() instanceof UserDetails) {
            return "redirect:/";
        }
        model.addAttribute("title", "Login");
        return "login";
    }
}
