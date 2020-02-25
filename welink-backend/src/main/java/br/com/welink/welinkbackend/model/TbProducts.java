package br.com.welink.welinkbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TbProducts {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String brand;
    @Column
    private String date;
    @Column
    private String name;
    @Column
    private Integer quantity;
    @Column
    private Double price;
    @Column
    private Long fkCompanyProducts;

    public TbProducts() {
    }

    public TbProducts(String brand, String date, String name, Integer quantity, Double price, Long fkCompanyProducts) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.date = date;
        this.quantity = quantity;
        this.fkCompanyProducts = fkCompanyProducts;
    }

    public TbProducts(String brand, String date, String name, double price) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setFkCompanyProducts(Long fkCompanyProducts) {
        this.fkCompanyProducts = fkCompanyProducts;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getFkCompanyProducts() {
        return fkCompanyProducts;
    }

    public void setFkCompanyProducts(long fkCompanyProducts) {
        this.fkCompanyProducts = fkCompanyProducts;
    }

    public String errorMessage(Integer i){
        switch (i){
            case 1:
                return "Produto cadastrado!";
            case 2:
                return "Produto já existe!";
            default:
                return "Desculpe, mas este erro é desconhecido, por favor contatar o suporte";
        }
    }


}
