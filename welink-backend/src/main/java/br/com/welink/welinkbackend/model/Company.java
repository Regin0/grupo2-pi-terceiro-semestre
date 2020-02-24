package br.com.welink.welinkbackend.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String cnpj;
    @Column
    private String name;


    public Company() {
    }

    public Company(String cnpj, String name) {
        this.name = name;
        this.cnpj = cnpj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String errorMessage(Integer i){
        switch (i){
            case 1:
                return "Empresa cadastrada!";
            case 2:
                return "Empresa já existe!";
            default:
                return "Desculpe, mas este erro é desconhecido, por favor contatar o suporte";
        }
    }



}
