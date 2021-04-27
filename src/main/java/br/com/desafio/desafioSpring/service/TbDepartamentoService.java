package br.com.desafio.desafioSpring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.desafio.desafioSpring.domain.dto.TbDepartamentoDTO;
import br.com.desafio.desafioSpring.domain.entity.TbDepartamentoEntity;
import br.com.desafio.desafioSpring.repository.TbDepartamentoRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TbDepartamentoService {

	final private TbDepartamentoRepository tbDepartamentoRepository;
	
	public List<TbDepartamentoDTO> getDepartamentos() {
		List<TbDepartamentoEntity> listaDepartamentos = tbDepartamentoRepository.findAll();
		return listaDepartamentos.stream().map(departamento -> new TbDepartamentoDTO(departamento)).collect(Collectors.toList());
	}
	
	
}
