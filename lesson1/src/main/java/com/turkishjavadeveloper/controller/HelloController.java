package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class HelloController {

    //localhost:8080/api/hello

    /* 16. SATIR ILE 17. SATIR ARASINDA HICBIR FARK YOKTUR . SADECE 14.SATIR DAHA OKUNUR OLMASI ICIN GETMAPPING KULLANIRIZ */

    //@RequestMapping(path="/hello",method = RequestMethod.GET)
    @GetMapping(path="/hello")
    public String sayHello(){
        return "Hello World";
    }

    // GET  : Veri goruntulemek istedigimiz z
}
