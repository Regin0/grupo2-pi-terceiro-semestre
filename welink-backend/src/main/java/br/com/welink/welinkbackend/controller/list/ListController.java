package br.com.welink.welinkbackend.controller.list;


import br.com.welink.welinkbackend.repository.TbListRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/admin/list")
public class ListController {

    private TbListRepository repository;

    public ListController(TbListRepository repository) {
        this.repository = repository;
    }











}
