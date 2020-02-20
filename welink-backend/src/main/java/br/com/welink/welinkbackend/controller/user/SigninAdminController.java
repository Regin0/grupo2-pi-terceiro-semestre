package br.com.welink.welinkbackend.controller.user;


import br.com.welink.welinkbackend.model.TbUserAdmin;
import br.com.welink.welinkbackend.repository.TbUserAdminRepository;
import br.com.welink.welinkbackend.repository.TbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user/admin")
public class SigninAdminController {

    @Autowired
    private TbUserAdminRepository repository;

    public SigninAdminController(TbUserAdminRepository repository) {
        this.repository = repository;
    }

    //rotas de login
    @GetMapping("/signin-admin")
    @ResponseBody
    public List<TbUserAdmin> findAll(){
        return (List<TbUserAdmin>) repository.findAll();
    }

    @PostMapping("/signin-admin")
    @ResponseBody
    public String validateLoginAdmin(@RequestParam String email, @RequestParam String password){
        if (loginValidate(email, password)){
            return "true";
        }else {
            return "nao foi";
        }
    }

    public Boolean loginValidate(String email, String password){
        if (repository.findOneByemail(email)!=null){
            if (repository.findOneByemail(email).getPassword()==password) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }//ESTA DANDO ERRO NA VALIDAÇÃO VERIFICAR
    }
}


