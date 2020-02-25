package br.com.welink.welinkbackend.model;

import javax.persistence.*;

@Entity
public class TbRequestProducts {

 @Id
 @GeneratedValue
private Long id;
 @Column
 private int products;
 @Column
private int status;
 @Column
private long fkUser;

    public TbRequestProducts() {
    }

    public TbRequestProducts(int products, int status, Long fkUser) {
        this.products = products;
        this.status = status;
        this.fkUser = fkUser;
    }

    public TbRequestProducts(int products, int status) {
    }

    public int getProducts() {
        return products;
    }

    public void setProducts(int products) {
        this.products = products;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getFkUser() {
        return fkUser;
    }

    public void setFkUser(Long fkUser) {
        this.fkUser = fkUser;
    }

    public String errorMessage(Integer i){
        switch (i){
            case 1:
                return "Produto solicitado cadastrado!";
            case 2:
                return "Produto solicitado já existe!";
            default:
                return "Desculpe, mas este erro é desconhecido, por favor contatar o suporte";
        }
    }





}
