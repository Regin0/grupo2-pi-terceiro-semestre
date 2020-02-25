package br.com.welink.welinkbackend.repository;


import br.com.welink.welinkbackend.model.TbList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbListRepository extends JpaRepository<TbList, Long> {

    public TbList findOnebyId(Long id);






}
