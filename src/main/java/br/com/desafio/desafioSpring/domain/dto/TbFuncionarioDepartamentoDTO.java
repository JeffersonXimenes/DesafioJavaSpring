package br.com.desafio.desafioSpring.domain.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbFuncionarioDepartamentoDTO {

	private List<TbDepartamentoDTO> departamentoId;
	private List<TbFuncionarioDTO> funcionarioId;
}
