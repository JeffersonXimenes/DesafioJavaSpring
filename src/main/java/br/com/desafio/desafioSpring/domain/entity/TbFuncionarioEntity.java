package br.com.desafio.desafioSpring.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "TB_FUNCIONARIO")
public class TbFuncionarioEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FUNCIONARIO_ID")
	private Integer funcionarioId;
	
	@Column(name = "FUNCIONARIO_NAME")
	private String funcionarioName;
	
	@Column(name = "FUNCIONARIO_AGE")
	private Integer funcionarioAge;
	
	@Column(name = "FUNCIONARIO_BIRTHDAY")
	private LocalDateTime funcionarioBirthday;
	
	@ManyToOne
	@JoinColumn(name = "CARGO_ID")
	private TbCargoEntity cargo;
}
