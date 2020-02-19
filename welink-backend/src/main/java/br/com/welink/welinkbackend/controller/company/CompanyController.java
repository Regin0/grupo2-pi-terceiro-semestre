package br.com.welink.welinkbackend.controller.company;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/company")
public class CompanyController {

    @PostMapping("/create")
    @ResponseBody
    public String postCompany(@RequestParam String companyName, @RequestParam String cnpj){
        return "Chegaram os dados: " +
                "\nNome da Empresa: " + companyName +
                "\nCNPJ: " + cnpj;
    }
}
