package br.com.desafio.desafioSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.desafioSpring.domain.entity.TbDepartamentoEntity;

@Repository
public interface TbDepartamentoRepository extends JpaRepository<TbDepartamentoEntity, Integer>{

	
}
