package br.com.welink.welinkbackend.controller.products;

import br.com.welink.welinkbackend.model.TbProducts;
import br.com.welink.welinkbackend.repository.TbProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private TbProductsRepository repository;

    public ProductsController(TbProductsRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/new-product")
    @ResponseBody
    public void newProduct(@RequestParam String name,@RequestParam Double price, @RequestParam String expirationDate,
                           @RequestParam String brand, @RequestParam Integer quantity, @RequestParam Long fk){
        TbProducts tbProducts = new TbProducts(brand, expirationDate, name, quantity, price, fk);

        repository.save(tbProducts);
    }

    @GetMapping("/{name}")
    public TbProducts getProduct(@PathVariable("name") String name){
        return repository.findOneByName(name);
    }

    @PutMapping("/change")
    @ResponseBody
    public void updatetProduct(@RequestParam String name2, @RequestParam String name,@RequestParam Double price, @RequestParam String expirationDate,
                               @RequestParam String brand, @RequestParam Integer quantity, @RequestParam Long fk){
        TbProducts tbProducts = repository.findOneByName(name);

        tbProducts.setName(name2);
        tbProducts.setBrand(brand);
        tbProducts.setDate(expirationDate);
        tbProducts.setPrice(price);
        tbProducts.setQuantity(quantity);

        repository.delete(repository.findOneByName(name));
        repository.save(tbProducts);

    }

    @DeleteMapping("/{name}")
    public void deleteProduct(@PathVariable("name") String name){
         repository.delete(repository.findOneByName(name));
    }
}
