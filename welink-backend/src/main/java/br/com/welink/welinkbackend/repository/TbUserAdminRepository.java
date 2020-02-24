package br.com.welink.welinkbackend.repository;

import br.com.welink.welinkbackend.model.TbUserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TbUserAdminRepository extends JpaRepository<TbUserAdmin, Long> {

    public TbUserAdmin findOneByemail(String email);

    public TbUserAdmin findByPassword(String password);
}
