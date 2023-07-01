package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MyController {
    //Asagidaki iki methot ayni anlama gelirler .
    //@PathVariable : Kullanıcı bir mesaj girecek ve biz o mesajı kullanıcıya geri dönderecegiz.
    @GetMapping(path = "/PathVariable/message1/{message}")
    // {} icerisine "message" degil de "m" yazsaydık eslestirmeyi yapamayacaktı ve Server Error alacaktık . Ancak bu sekilde yapmak istiyorsak bir alttaki methot buna bir ornektir .
    public String getMyMessage(@PathVariable String message) {
        return "Your message is : " + message;
    }

    @GetMapping(path = "/PathVariable/message2/{m}")
    public String getMyMessage2(@PathVariable("m") String message) {
        return "Your message is : " + message;
    }

    @GetMapping(path = "/RequestParam/message3")
    public String getMyMessage3(@RequestParam String message) {
        return "Your message is : " + message;
    }

    //RequestParam("") içerisine girilen deger her neyse postmande key kısmına o yazılır . Eğer RequestParam("") içerisinde hicbirsey yazmıyorsa bir üst methottaki gibi yani , direkt String ile tanımlanan değişken ismi key kısmına yazılır.
    @GetMapping(path = "/RequestParam/message4")
    public String getMyMessage4(@RequestParam("m") String message) {
        return "Your message is : " + message;
    }

    @GetMapping(path = {"/PathVariable/WithVariable/message5","/PathVariable/WithVariable/message5/{message}"})
    public String getMyMessageWithVariable(@PathVariable(name="message",required = false) String message) { // Buradaki required defaul olarak true geliyor ancak biz false yaparak bir mesaj girilmeden de yani boş geçilerek de işlem yapabilmemizi sağlıyoruz .
        return "Your message is : " + message;
    }

    @GetMapping(path = "/RequestParam/WithParam/message6")
    public String getMyMessageWithParam(@RequestParam(name="message",required = false,defaultValue = "My Default Message") String message) { // Buradaki required defaul olarak true geliyor ancak biz false yaparak bir mesaj girilmeden de yani boş geçilerek de işlem yapabilmemizi sağlıyoruz .
        return "Your message is : " + message;
    }
}
