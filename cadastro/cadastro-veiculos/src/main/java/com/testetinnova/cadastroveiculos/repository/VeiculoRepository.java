package com.testetinnova.cadastroveiculos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testetinnova.cadastroveiculos.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

	public List<Veiculo> findAllByVeiculoContainingIgnoreCase(String veiculo);

	public List<Veiculo> findAllByMarcaContainingIgnoreCase(String marca);
	
	public List<Veiculo> findAllByAno(int ano);
	
	public List<Veiculo> findAllByVendido(boolean vendido);
}
