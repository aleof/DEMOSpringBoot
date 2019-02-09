package com.aleofo.demo.mappings.errors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorGateway {

    @RequestMapping("/errorCustom")
    public String error(){
        return "ERRORE";
    }

    @RequestMapping("/errorCustomFatal")
    public String errorFatal(){
        return "ERRORE FATALE";
    }
}