package br.com.welink.welinkbackend.controller.user;

import br.com.welink.welinkbackend.model.TbUser;
import br.com.welink.welinkbackend.repository.TbUserAdminRepository;
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
    public String postSignup(@RequestParam String cpf,@RequestParam String birthday , @RequestParam String email,
                             @RequestParam String name, @RequestParam String password){
        TbUser tbUser = new TbUser(birthday, cpf, email, name, password);//instancia a classe do tbUser

        if (!(repository.findOneByemail(email) != null)){//validação se o cpf do usuario existe
            repository.save(tbUser);
            return tbUser.errorMessage(1);
        }else{
            return tbUser.errorMessage(2);
        }
    }

}
