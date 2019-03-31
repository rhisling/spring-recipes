package me.aravindh.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = {"", "/", "/index"})
    public String getIndexPage(Model model) {
        System.out.println("ghggj");
        return "index";
    }
}
