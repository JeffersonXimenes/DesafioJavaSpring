package br.com.desafio.desafioSpring.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.desafioSpring.domain.dto.TbDepartamentoDTO;
import br.com.desafio.desafioSpring.service.TbDepartamentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("departamentos")
public class TbDepartamentoController {

	private final TbDepartamentoService tbDepartamentoService;
	
	@GetMapping
	public ResponseEntity<List<TbDepartamentoDTO>> getDepartamentos() {
		log.info("INFO - Buscando cargos");
		return ResponseEntity.ok(tbDepartamentoService.getDepartamentos());
	}
	
	
//	@GetMapping(path = "/{departamentoId}")
//	public ResponseEntity<TbDepartamentoDTO> departamentoFindById(@PathVariable Long id) {
//		log.info("INFO - Buscando departamento por {id}");
//		return ResponseEntity.ok(tbDepartamentoService.cargosFindById(id));
//	}
	
//	@PostMapping
//	public ResponseEntity<TbCargoDTO> save(@RequestBody TbCargoDTO cargoDTO) {
//		return new ResponseEntity<>(tbCargoService.save(cargoDTO), HttpStatus.CREATED) ;
//	}
	
	
}
