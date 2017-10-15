package com.dileshwory.com;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class App {

    @RequestMapping(value = "/dsms")
    public String homePage(Model model) {
        model.addAttribute("greeting", "welcome to Dileshwory School Management System");
        model.addAttribute("tagline", "The one and only amazing school application");
        return "homepage";
    }

    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "welcome to Dileshwory School Management System and to go actual application please visit " +
                 "www.dileshwory.com";
    }

}
