package br.com.welink.welinkbackend.controller.user;

import br.com.welink.welinkbackend.model.TbUser;
import br.com.welink.welinkbackend.repository.TbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SignupController {

    @Autowired
    private TbUserRepository repository;

    public SignupController(TbUserRepository repository) {
        this.repository = repository;
    }

    //rotas de cadastro
    @PostMapping("/signup")
    @ResponseBody
    public String postSignup(@RequestParam String name, @RequestParam String password, @RequestParam String email,
                             @RequestParam String cpf, @RequestParam String birthday){
        TbUser tbUser = new TbUser(name, cpf, birthday, email, password);//instancia a classe do tbUser

        if (repository.findByCpf(cpf) == null){//validação se o cpf do usuario existe
            repository.save(tbUser);
            return tbUser.erroMessage(1);
        }else{
            return tbUser.erroMessage(2);
        }
    }
}
