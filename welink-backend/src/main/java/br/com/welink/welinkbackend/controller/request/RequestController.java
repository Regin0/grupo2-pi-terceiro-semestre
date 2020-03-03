package br.com.welink.welinkbackend.controller.request;


import br.com.welink.welinkbackend.controller.list.ListController;
import br.com.welink.welinkbackend.model.TbProducts;
import br.com.welink.welinkbackend.model.TbRequestProducts;
import br.com.welink.welinkbackend.repository.TbRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/admin/request")
public class RequestController {

    @Autowired
    private TbRequestRepository repository;

    public RequestController(TbRequestRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/new-request/{products}/{status}")
    @ResponseBody
    public void newRequest(@RequestParam Integer products, @RequestParam Integer status, @RequestParam Long fkUser){
        TbRequestProducts tbRequestProducts = new TbRequestProducts(products, status, fkUser);

        repository.save(tbRequestProducts);
    }


    @GetMapping("/{products}")
    public TbRequestProducts getProducts(@PathVariable("products") int products){
        return getProducts(products);
    }

    @GetMapping("/{status}")
    public TbRequestProducts getStatusProduct(@PathVariable("status") int status){
        return getStatusProduct(status);

    }

    @PutMapping("/change")
    @ResponseBody
    public void updatetRequest(@RequestParam Integer product, @RequestParam Integer status,
                               @RequestParam Integer product2,
                               @RequestParam Long fkUser){
        TbRequestProducts tbRequestProducts = (TbRequestProducts) repository.findOneById(product);

        tbRequestProducts.setProducts(product);
        tbRequestProducts.setStatus(status);
        tbRequestProducts.setFkUser(fkUser);

//      repository.delete(repository.findOneById(product)); dando erro n sei pq
        repository.save(tbRequestProducts);

    }

    @DeleteMapping("/{product}")
    public void deleteRequest(@PathVariable("product") Integer product){
        repository.delete((TbRequestProducts) repository.findOneById(product));
    }

}
