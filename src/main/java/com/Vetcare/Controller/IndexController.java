package com.Vetcare.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
    @RequestMapping("/contacto")
    public String contacto (Model model){
        model.addAttribute("attribute", "value");
        return "contacto";
    }
    @RequestMapping("/informacion")
    public String informacion (Model model){
        model.addAttribute("attribute", "value");
        return "informacion";
    }
    
}
