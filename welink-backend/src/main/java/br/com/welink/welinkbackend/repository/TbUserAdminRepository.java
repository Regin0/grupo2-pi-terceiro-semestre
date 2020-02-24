package br.com.welink.welinkbackend.repository;

import br.com.welink.welinkbackend.model.TbUserAdmin;
import org.springframework.data.repository.CrudRepository;

public interface TbUserAdminRepository extends CrudRepository<TbUserAdmin, Long> {

    public TbUserAdmin findOneByemail(String email);
}
