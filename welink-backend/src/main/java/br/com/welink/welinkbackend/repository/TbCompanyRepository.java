package br.com.welink.welinkbackend.repository;

import br.com.welink.welinkbackend.model.TbCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbCompanyRepository extends JpaRepository<TbCompany, Long> {

    public TbCompany findOneByname(String name);
}
