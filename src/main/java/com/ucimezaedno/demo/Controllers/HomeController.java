package com.ucimezaedno.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("bodyContent","home");
        return "masterTemplate";
    }

    @GetMapping("/game1")
    public String showGame1(Model model) {
        model.addAttribute("bodyContent","game1");
        return "masterTemplate";
    }

    @GetMapping("/game2")
    public String showGame2(Model model) {
        model.addAttribute("bodyContent","game2");
        return "masterTemplate";
    }

    @GetMapping("/game3")
    public String showGame3(Model model) {
        model.addAttribute("bodyContent","game3");
        return "masterTemplate";
    }
}

