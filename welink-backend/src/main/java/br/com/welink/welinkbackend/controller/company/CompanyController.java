package br.com.welink.welinkbackend.controller.company;

import br.com.welink.welinkbackend.model.TbCompany;
import br.com.welink.welinkbackend.repository.TbCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/admin/company")
public class CompanyController {

    @Autowired
    private TbCompanyRepository repository;

    public CompanyController(TbCompanyRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/create")
    @ResponseBody
    public String postCompany(@RequestParam String companyName, @RequestParam String cnpj){
        TbCompany tbCompany = new TbCompany(cnpj, companyName);

        if (tbCompany.getCnpj().length()!=15 || tbCompany.getCnpj().length()!=13){
            if (!(repository.findOneByname(companyName) != null)){
                repository.save(tbCompany);
                return tbCompany.errorMessage(1);
            }else{
                return tbCompany.errorMessage(2);
            }
        }else{
            return tbCompany.errorMessage(3);
        }
    }

    @GetMapping("/{name}")
    public TbCompany getCompany(@PathVariable("name") String companyName){
        return repository.findOneByname(companyName);
    }
}