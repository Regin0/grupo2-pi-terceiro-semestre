package br.com.welink.welinkbackend.model;

import javax.persistence.*;

@Entity
public class TbUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String cpf;
    @Column
    private String date;

    public TbUser(){

    }

    public TbUser(String name, String email, String password, String cpf, String date) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String erroMessage(Integer i){
        switch (i){
            case 1:
                return "Usuário cadastrdo!";
            case 2:
                return "Usuário já existe!";
            default:
                return "Desculpe, mas este erro é desconehcido, por favor contatar o suporte";
        }
    }
}

//w3l1nk4dM
