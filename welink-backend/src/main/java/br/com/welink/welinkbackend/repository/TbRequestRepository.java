package br.com.welink.welinkbackend.repository;

import br.com.welink.welinkbackend.model.TbRequestProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbRequestRepository extends JpaRepository<TbRequestProducts, Long> {

    public TbRequestRepository findOneById(Integer product);
}
