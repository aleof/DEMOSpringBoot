package com.aleofo.demo.mappings;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.view.RedirectView;

@RestController
public class FirstClass {

    @RequestMapping("/first")//"/demo/functionalities/first"
    public String first(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("name", name);
        return "Hello "+name+" from Spring Boot!";
    }
}
