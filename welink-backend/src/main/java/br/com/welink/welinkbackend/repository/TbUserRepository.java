package br.com.welink.welinkbackend.repository;

import br.com.welink.welinkbackend.model.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TbUserRepository extends JpaRepository<TbUser, Long> {

    public TbUser findOneByemail(String email );

}
