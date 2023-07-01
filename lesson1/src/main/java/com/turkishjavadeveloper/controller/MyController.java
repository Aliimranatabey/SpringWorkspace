package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
    //Asagidaki iki methot ayni anlama gelirler .
    //@PathVariable : Kullanıcı bir mesaj girecek ve biz o mesajı kullanıcıya geri dönderecegiz.
    @GetMapping(path = "/messages/{message}")
    // {} icerisine "message" degil de "m" yazsaydık eslestirmeyi yapamayacaktı ve Server Error alacaktık . Ancak bu sekilde yapmak istiyorsak bir alttaki methot buna bir ornektir .
    public String getMyMessage(@PathVariable String message) {
        return "Your message is : " + message;
    }

    @GetMapping(path = "/message/{m}")
    public String getMyMessage2(@PathVariable("m") String message) {
        return "Your message is : " + message;
    }
}
