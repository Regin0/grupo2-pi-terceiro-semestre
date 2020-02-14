package br.com.welink.welinkbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.welink.welinkbackend.*;

@RestController
//@RequestMapping("/home")
public class HomeController {

    //rota da home do projeto
    @GetMapping("/home")
    public String home(){
        return "<h1>Home page<h1>";
    }

}
