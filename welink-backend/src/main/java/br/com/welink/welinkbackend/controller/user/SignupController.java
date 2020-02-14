package br.com.welink.welinkbackend.controller.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SignupController {
    //rotas de cadastro
    @GetMapping("/signup")
    public String getSignup(){
        return "Renderizando a pagina de cadastro";
    }

    @PostMapping("/signup")
    @ResponseBody
    public String postSignup(@RequestParam String name, @RequestParam String cpf, @RequestParam String birthday,
                             @RequestParam String email, @RequestParam String password){
        return "Chegaram estes dados \n"+
                "Nome: "+ name+
                "\nCPF: "+ cpf +
                "\nBirthday: "+ birthday +
                "\nEmail: "+ email +
                "\nPassword: "+ password;
    }
}
