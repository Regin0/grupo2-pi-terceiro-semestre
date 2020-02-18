package br.com.welink.welinkbackend.controller.user;

import br.com.welink.welinkbackend.model.TbUser;
import br.com.welink.welinkbackend.repository.TbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class SigninController {

    @Autowired
    private TbUserRepository repository;

    public SigninController(TbUserRepository repository) {
        this.repository = repository;
    }

    //rotas de login
    @GetMapping("/signin")
    @ResponseBody
    public List<TbUser> findAll(){
        return (List<TbUser>) repository.findAll();
    }

    @PostMapping("/signin")
    @ResponseBody
    public String validateLogin(@RequestParam String email, @RequestParam String password){
        if (loginValidate(email, password)){
            return "true";
        }else {
            return "nao foi";
        }
    }

    @GetMapping("/signin/{id}")
    @ResponseBody
    public Optional<TbUser> findOne(@PathVariable("id") Long id){
        return repository.findById(id);//se nao achar retorna null
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void destroy(@PathVariable Long id){
       repository.deleteById(id);
    }

    public Boolean loginValidate(String email, String password){
        System.out.println(repository.findOneByemail(email).getPassword());
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
