package com.leilao.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class index {

    @GetMapping
    public String index() {

        return "Hello World";
    }

    @PostMapping("/new")
    public String index2() {

        return "Hello World";
    }

    @PostMapping
    public String save() {
        return "Deu Bom";
    }

}
