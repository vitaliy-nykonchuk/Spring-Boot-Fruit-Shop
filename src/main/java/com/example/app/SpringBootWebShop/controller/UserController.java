package com.example.app.SpringBootWebShop.controller;

import com.example.app.SpringBootWebShop.service.User.UserCitrusFruitService;
import com.example.app.SpringBootWebShop.service.User.UserRosyFruitService;
import com.example.app.SpringBootWebShop.service.User.UserStoneFruitService;
import com.example.app.SpringBootWebShop.service.User.UserOrderService;
import com.example.app.SpringBootWebShop.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    UserCitrusFruitService userCitrusFruitService;
    @Autowired
    UserRosyFruitService userRosyFruitService;
    @Autowired
    UserStoneFruitService userStoneFruitService;
    @Autowired
    UserOrderService userOrderService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("title", "Web Shop");
        model.addAttribute("fragmentName", "home");
        return "User/layout";
    }

    @GetMapping("/citrus-fruits")
    public String getCitrusFruits(Model model) {
        model.addAttribute("title", "Citrus-Fruits");
        model.addAttribute("citrusFruits", userCitrusFruitService.getAll());
        model.addAttribute("fragmentName", "citrus_fruits");
        return "User/layout";
    }

    @GetMapping("/rosy-fruits")
    public String getRosyFruits(Model model) {
        model.addAttribute("title", "Rosy-Fruits");
        model.addAttribute("rosyFruits", userRosyFruitService.getAll());
        model.addAttribute("fragmentName", "rosy_fruits");
        return "User/layout";
    }

    @GetMapping("/stone-fruits")
    public String getTShirts(Model model) {
        model.addAttribute("title", "Stone-Fruits");
        model.addAttribute("stoneFruits", userStoneFruitService.getAll());
        model.addAttribute("fragmentName", "stone_fruits");
        return "User/layout";
    }

    @GetMapping("/contacts")
    public String getContacts(Model model) {
        model.addAttribute("title", "Contacts");
        model.addAttribute("fragmentName", "contacts");
        return "User/layout";
    }

    @PostMapping("/order")
    public ResponseEntity<?> makeOrder(
            @RequestParam("userName") String userName,
            @RequestParam("userPhone") String userPhone,
            @RequestParam("userEmail") String userEmail,
            @RequestParam("userOrderMsg") String userOrderMsg) {

        String[] data = new String[]{userName, userPhone,
                userEmail, userOrderMsg};

        String orderCode;

        try {
            orderCode = userOrderService.makeOrder(data);
        } catch (Exception e) {
            return new ResponseEntity<>(new ResponseMessage(false,
                    "Error."), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(new ResponseMessage(true,
                "Your order code is " + orderCode + ". Do not lost it, please."),
                HttpStatus.OK);
    }
}
