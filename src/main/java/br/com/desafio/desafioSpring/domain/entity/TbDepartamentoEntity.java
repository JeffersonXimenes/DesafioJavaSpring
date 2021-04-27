package br.com.desafio.desafioSpring.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TB_DEPARTAMENTO")
public class TbDepartamentoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPARTAMENTO_ID")
	private Integer departamentoId;

	@Column(name = "DEPARTAMENTO_NAME")
	private String departamentoName;
}
