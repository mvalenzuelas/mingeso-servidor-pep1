package com.example.servidorpep1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public String getMapping(){
        return ("Aplicación web muy simple");
    }

}
