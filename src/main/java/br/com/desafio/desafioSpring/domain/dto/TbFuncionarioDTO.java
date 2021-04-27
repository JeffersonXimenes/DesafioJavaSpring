package br.com.desafio.desafioSpring.domain.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbFuncionarioDTO {

	private Integer funcionarioId;
	private String funcionarioName;
	private Integer funcionarioAge;
	private LocalDateTime funcionarioBirthday;
	private TbCargoDTO funcionarioCargo;
}
