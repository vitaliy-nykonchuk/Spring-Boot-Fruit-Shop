package com.example.app.SpringBootWebShop.controller;

import com.example.app.SpringBootWebShop.service.Admin.AdminRosyFruitService;
import com.example.app.SpringBootWebShop.service.Admin.AdminCitrusFruitService;
import com.example.app.SpringBootWebShop.service.Admin.AdminStoneFruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminRosyFruitService userRosyFruitService;
    @Autowired
    AdminStoneFruitService userStoneFruitService;
    @Autowired
    AdminCitrusFruitService userCitrusFruitService;

    @GetMapping
    public String getHome(Model model) {
        model.addAttribute("title", "Web Shop");
        model.addAttribute("fragmentName", "home");
        return "Admin/layout";
    }

    @GetMapping("/citrus-fruits")
    public String getCitrusFruits(Model model) {
        model.addAttribute("title", "Citrus-Fruits");
        model.addAttribute("citrusFruits", userCitrusFruitService.getAll());
        model.addAttribute("fragmentName", "citrus_fruits");
        return "Admin/layout";
    }

    @GetMapping("/rosy-fruits")
    public String getRosyFruits(Model model) {
        model.addAttribute("title", "Rosy-Fruits");
        model.addAttribute("rosyFruits", userRosyFruitService.getAll());
        model.addAttribute("fragmentName", "rosy_fruits");
        return "Admin/layout";
    }

    @GetMapping("/stone-fruits")
    public String getTShirts(Model model) {
        model.addAttribute("title", "Stone-Fruits");
        model.addAttribute("stoneFruits", userStoneFruitService.getAll());
        model.addAttribute("fragmentName", "stone_fruits");
        return "Admin/layout";
    }
}
