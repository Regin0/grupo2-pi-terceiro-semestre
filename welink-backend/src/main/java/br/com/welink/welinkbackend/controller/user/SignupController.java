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
    public TbUser postSignup(@RequestParam String name, @RequestParam String cpf, @RequestParam String birthday,
                             @RequestParam String email, @RequestParam String password){
        TbUser tbUser = new TbUser(name, cpf, birthday, email, password);

        if (name.length() > 0 && name != null){
            repository.save(tbUser);
        }

        return tbUser;
    }
}
