package com.crud.covid.controller;

import com.crud.covid.model.Anamnesa;
import com.crud.covid.service.AnamnesaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnamnesaController {
    @Autowired
    private AnamnesaService anamnesaService;

    @GetMapping("/anamnesa")
    public String viewIndex(Model model)
    {
        model.addAttribute("title", "Data Anamnesa");
        model.addAttribute("data", anamnesaService.getAllAnamnesa());
        return "anamnesa/index";
    }

    @GetMapping(value = {"/anamnesa/form/{id}", "/anamnesa/form"})
    public String viewForm(@PathVariable(value = "id", required = false) String id, Model model)
    {
        Anamnesa form;
        if(id != null){
            form = anamnesaService.getAnamnesaById(Long.parseLong(id.toString()));
            model.addAttribute("title", "Edit Data Anamnesa");
        }else{
            form = new Anamnesa();
            model.addAttribute("title", "Tambah Data Anamnesa Baru");
        }
        model.addAttribute("form", form);
        model.addAttribute("action", "/anamnesa/save");
        return "anamnesa/_form";
    }

    @PostMapping("/anamnesa/save")
    public String save(Anamnesa anamnesa)
    {
        anamnesaService.saveAnamnesa(anamnesa);
        return "redirect:/anamnesa";
    }

    @GetMapping("/anamnesa/delete/{id}")
    public String delete(@PathVariable("id") long id, Model model)
    {
        anamnesaService.deleteAnamnesaById(id);
        return "redirect:/anamnesa";
    }
}
