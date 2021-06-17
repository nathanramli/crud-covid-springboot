package com.crud.covid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.covid.model.Pasien;
import com.crud.covid.service.PasienService;

@Controller
public class PasienController {
    @Autowired
    private PasienService pasienService;

    @GetMapping("/pasien")
    public String viewPasienIndex(Model model)
    {
        model.addAttribute("title", "Data Pasien");
        model.addAttribute("data", pasienService.getAllPasien());
        return "pasien/index";
    }

    @GetMapping(value = {"/pasien/form/{id}", "/pasien/form"})
    public String formPasien(@PathVariable(value = "id", required = false) String id, Model model)
    {
        Pasien form;
        if(id != null){
            form = pasienService.getPasienById(Long.parseLong(id.toString()));
            model.addAttribute("title", "Edit Data Pasien");
        }else{
            form = new Pasien();
            model.addAttribute("title", "Tambah Data Pasien Baru");
        }
        model.addAttribute("form", form);
        model.addAttribute("action", "/pasien/save");
        return "pasien/_form";
    }

    @PostMapping("/pasien/save")
    public String savePasien(Pasien pasien)
    {
        pasienService.savePasien(pasien);
        return "redirect:/pasien";
    }

    @GetMapping("/pasien/delete/{id}")
    public String deleteMenu(@PathVariable("id") long id, Model model)
    {
        pasienService.deletePasienById(id);
        return "redirect:/pasien";
    }
}
