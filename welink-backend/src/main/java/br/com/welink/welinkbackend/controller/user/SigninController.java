package br.com.welink.welinkbackend.controller.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SigninController {

    //rotas de login
    @GetMapping("/signin")
    public String getLogin(){
        return "Renderizando a pagina de login";
    }

    @PostMapping("/signin")
    @ResponseBody
    public String  postSignin(@RequestParam String email, @RequestParam String password){
        try{
            if (true) { /*no lugar do "true" vai a validação de usuario*/
                return "Chegaram estes dados \n"+
                        "Email: "+ email+
                        "\nPassword: "+ password;
            }else{
                return "Usuário nao encontrado";
            }
        }catch(Exception ex){
            System.out.println(ex);
            return "Usuario nao encontrado";
        }
    }
}
