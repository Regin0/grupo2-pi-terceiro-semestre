package br.com.welink.welinkbackend.controller.request;


import br.com.welink.welinkbackend.controller.list.ListController;
import br.com.welink.welinkbackend.repository.TbRequestRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/admin/request")
public class RequestController {

    private TbRequestRepository repository;

    public RequestController(TbRequestRepository repository) {
        this.repository = repository;
    }

}
