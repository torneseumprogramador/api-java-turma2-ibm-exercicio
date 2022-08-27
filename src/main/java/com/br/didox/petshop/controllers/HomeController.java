package com.br.didox.petshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.didox.petshop.dtos.HomeDto;

@RestController
public class HomeController {
    @GetMapping("/")
    public HomeDto index(){
        return new HomeDto();
    }
}
