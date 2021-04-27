package br.com.desafio.desafioSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.desafioSpring.domain.entity.TbFuncionarioEntity;

@Repository
public interface TbFuncionarioDepartamentoRepository extends JpaRepository<TbFuncionarioEntity, Integer>{

	
}
