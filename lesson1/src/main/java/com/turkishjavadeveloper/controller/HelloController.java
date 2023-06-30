package com.turkishjavadeveloper.controller;

import org.springframework.web.bind.annotation.*;

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

    // GET    : Veri goruntulemek istedigimiz zaman kullaniyoruz.                   @GetMapping
    // POST   : Veri kaydetmek istedigimiz zaman kullaniyoruz.                      @PostMapping
    // PUT    : Veri guncellemek istedigimiz zaman kullaniyoruz.                    @PutMapping
    // PATCH  : Verinin bir bolumunu guncellemek istedigimiz zaman kullaniyoruz.    @PatchMapping
    //          Örn: Parola guncellemek gibi.
    // DELETE : Veri silmek istedigimiz zaman kullaniyoruz.                         @DeleteMapping

    @PostMapping(path="/save")
    public String save(){
        return "Data saved!";
    }

    @DeleteMapping(path="/delete")
    public String delete(){
        return "Data deleted!";
    }
}
