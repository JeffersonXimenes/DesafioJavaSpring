package br.com.desafio.desafioSpring.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TB_FUNCIONARIO_DEPARTAMENTO")
public class TbFuncionarioDepartamentoEntity {

	@Id
	@Column(name = "DEPARTAMENTO_ID")
	private Integer departamentoId;
	
//	@Id
	@Column(name = "FUNCIONARIO_ID")
	private Integer funcionarioId;
}
