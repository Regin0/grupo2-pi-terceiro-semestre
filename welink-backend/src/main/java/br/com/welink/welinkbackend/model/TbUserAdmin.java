package br.com.welink.welinkbackend.model;

import javax.persistence.*;

@Entity
public class TbUserAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String cpf;
    @Column
    private String email;
    @Column
    private String birthday;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private Long fkEnterprise;

    public TbUserAdmin(){

    }

    public TbUserAdmin(Long id, String cpf, String email, String birthday, String name, String password, Long fkEnterprise) {
        this.id = id;
        this.cpf = cpf;
        this.email = email;
        this.birthday = birthday;
        this.name = name;
        this.password = password;
        this.fkEnterprise = fkEnterprise;
    }

    public TbUserAdmin(String cpf, String birthday, String email, String name, String password) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getFkEnterprise() {
        return fkEnterprise;
    }

    public void setFkEnterprise(Long fkEnterprise) {
        this.fkEnterprise = fkEnterprise;
    }

    public String errorMessage(Integer i){
        switch (i){
            case 1:
                return "Usuário cadastrado!";
            case 2:
                return "Usuário já existe!";
            default:
                return "Desculpe, mas este erro é desconehcido, por favor contatar o suporte";
        }
    }

}