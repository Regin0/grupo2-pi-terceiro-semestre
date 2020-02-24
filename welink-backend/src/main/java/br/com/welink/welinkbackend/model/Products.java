package br.com.welink.welinkbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Products {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String brand;
    @Column
    private String date;
    @Column
    private String name;
    @Column
    private double price;
    @Column
    private long fkCompanyProducts;

    public Products() {
    }

    public Products(String brand, String date,String name, double price, long fkCompanyProducts) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.date = date;
        this.fkCompanyProducts = fkCompanyProducts;
    }

    public Products(String brand, String date, String name, double price) {
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
