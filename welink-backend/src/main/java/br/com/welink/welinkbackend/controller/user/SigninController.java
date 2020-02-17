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

    @GetMapping("/signin/{id}")
    @ResponseBody
    public Optional<TbUser> findOne(@PathVariable("id") Long id){
        return repository.findById(id);//se nao achr retorna null
    }

    @GetMapping("/signin/name/{name}")
    @ResponseBody
    public TbUser findName(@PathVariable("name") String name){
        return repository.findByName(name);//da ruim se tiver mais de um, recomendavel fazer lista
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void destroy(@PathVariable Long id){
       repository.deleteById(id);
    }
}
