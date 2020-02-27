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

    @GetMapping("/signin")
    @ResponseBody
    public Boolean validateLoginAdmin(@RequestParam String email, @RequestParam String password){
        return loginValidate(email, password);
    }

    public Boolean loginValidate(String email, String password){
        if (repository.findOneByEmail(email) != null &&
                repository.findOneByEmail(email).getEmail().equals(email) &&
                repository.findOneByEmail(email).getPassword().equals(password)) {
            return true;
        }else{
            return false;
        }
    }
}


