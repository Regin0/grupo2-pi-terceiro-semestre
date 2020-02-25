package br.com.welink.welinkbackend.repository;

import br.com.welink.welinkbackend.model.TbProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TbProductsRepository extends JpaRepository<TbProducts, Long> {
    public TbProducts findOneByName(String name);

    TbProducts deleteByName(String name);
}
