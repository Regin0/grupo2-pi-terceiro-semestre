package br.com.welink.welinkbackend.repository;

import br.com.welink.welinkbackend.model.TbUser;
import org.springframework.data.repository.CrudRepository;

public interface TbUserRepository extends CrudRepository<TbUser, Long> {

    public TbUser findByName(String name);
}
