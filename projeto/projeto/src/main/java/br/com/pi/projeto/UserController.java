package br.com.pi.projeto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    User usuario;

    //rota de login
    @GetMapping("/signin")
    public String getSignin(){
        return "Renderizando a pagina de login";
    }

    @PostMapping("/signin")
    @ResponseBody
    public String  postSignin(@RequestParam String password, @RequestParam String user){
        usuario = new User(user, password);//isso noa devia estar aqui, mas noa tem banco de dados para facilitar a vida
        try{
            if (usuario.authenticate(user, password)) {
                return "Usuario encontrado";
            }else{
                return "Usuario nao encontrado";
            }
        }catch(Exception ex){
            System.out.println(ex);
            return "Usuario nao encontrado";
        }
    }

    //rotas de cadastro
    @GetMapping("/signup")
    public String getSignup(){
        return "Renderizando a pagina de cadastro";
    }

    @PostMapping("/signup")
    @ResponseBody
    public String postSignup(@RequestParam String password, @RequestParam String user){
        usuario = new User(user, password);
        return "Chegaram estes dados \n"+
                "Usuario: "+ usuario.getUser()+
                "\nSenha: "+ usuario.getPassword();
    }
}
