package com.testetinnova.cadastroveiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testetinnova.cadastroveiculos.model.Veiculo;
import com.testetinnova.cadastroveiculos.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
@CrossOrigin("*")
public class VeiculoController {

	@Autowired
	private VeiculoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Veiculo>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	// Permite buscar veículos pelo ID
	@GetMapping("/{id}") 
	public ResponseEntity<Veiculo> GetById(@PathVariable long id) {
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	// Permite postar novos veículos no Banco de Dados
	@PostMapping
	public ResponseEntity<Veiculo> post (@RequestBody Veiculo veiculo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(veiculo));
	}
	
	// Permite alterar, por id, algum veículo preexistente
	@PutMapping("{id}")
	public ResponseEntity<Veiculo> put (@RequestBody Veiculo veiculo) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(veiculo));
	}
	
	@PatchMapping("{id}")
	public ResponseEntity<Veiculo> patch (@RequestBody Veiculo veiculo) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(veiculo));
	}
	
	// Permite apagar algum veículo pelo id
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
