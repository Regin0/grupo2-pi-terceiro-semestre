package br.com.welink.welinkbackend.controller.user;


import br.com.welink.welinkbackend.model.TbUser;
import br.com.welink.welinkbackend.model.TbUserAdmin;
import br.com.welink.welinkbackend.repository.TbUserAdminRepository;
import br.com.welink.welinkbackend.repository.TbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/admin")
public class SignupAdminController {

    @Autowired
    private TbUserAdminRepository repository;

    public SignupAdminController(TbUserAdminRepository repository) {
        this.repository = repository;
    }

    //rotas de cadastro
    @PostMapping("/signup-admin")
    @ResponseBody
    public String postSignup(@RequestParam String birthday, @RequestParam String cpf , @RequestParam String email,
                             @RequestParam String name, @RequestParam String password, @RequestParam Long fkEnterprise){
        TbUserAdmin tbUser = new TbUserAdmin( cpf, birthday, email, name, password, fkEnterprise);//instancia a classe do tbUser

        if (repository.findOneByemail(email) == null){//validação se o cpf do usuario existe
            repository.save(tbUser);
            return tbUser.errorMessage(1);
        }else{
            return tbUser.errorMessage(2);
        }
    }
}
