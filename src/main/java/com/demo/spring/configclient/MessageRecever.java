package com.demo.spring.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class MessageRecever {


    @Value("${message : Default Hello}")
    private String message;

    @GetMapping("/message")
    public String getMessage(){
        return message;
    }
}
