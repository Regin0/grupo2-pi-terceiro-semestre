package br.com.welink.welinkbackend.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class List {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private int productQuantity;
    @Column
    private long fkProduct;
    @Column
    private long fkRequest;

    public List() {
    }

    public List(int productQuantity, long fkProduct, long fkRequest) {
        this.productQuantity = productQuantity;
        this.fkProduct = fkProduct;
        this.fkRequest = fkRequest;
    }

    public List(int productQuantity) {
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public long getFkProduct() {
        return fkProduct;
    }

    public void setFkProduct(long fkProduct) {
        this.fkProduct = fkProduct;
    }

    public long getFkRequest() {
        return fkRequest;
    }

    public void setFkRequest(long fkRequest) {
        this.fkRequest = fkRequest;
    }

    public String errorMessage(Integer i){
        switch (i){
            case 1:
                return "Lista cadastrada!";
            case 2:
                return "Lista já existe!";
            default:
                return "Desculpe, mas este erro é desconhecido, por favor contatar o suporte";
        }
    }

}
