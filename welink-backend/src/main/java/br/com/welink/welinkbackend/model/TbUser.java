package br.com.welink.welinkbackend.model;

import javax.persistence.*;

@Entity
public class TbUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String birthday;
    @Column
    private String cpf;
    @Column
    private String email;
    @Column
    private String name;
    @Column
    private String password;

    public TbUser(){

    }

    public TbUser(String birthday, String cpf, String email, String name, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.birthday = birthday;
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

    public String errorMessage(Integer i){
        switch (i){
            case 1:
                return "Usuário cadastrdo!";
            case 2:
                return "Usuário já existe!";
            default:
                return "Desculpe, mas este erro é desconhecido, por favor contatar o suporte";
        }
    }
}

//w3l1nk4dM
