package com.teste.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.teste.hospede.entity.Veiculo;
import com.teste.hospede.repository.VeiculoRepository;

@DataJpaTest
class VeiculoRepositoryTest {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@DisplayName("Testando o Save")
	@Test
	void testSalvarRepository() {
		Veiculo veiculo1 =new Veiculo (null, "Cadeira", "75,00","Cadeira", "75,00");
		
		Veiculo saveVeiculo = veiculoRepository.save(veiculo1);
		
		assertNotNull(saveVeiculo);
		assertTrue(saveVeiculo.getId() > 0);					
	}
	
	@DisplayName("Testando Get para todos veiculos")
	@Test
	void testGetAllRepository() {
		Veiculo veiculo1 =new Veiculo (null, "Cadeira", "74,00","Cadeira", "75,00");
		Veiculo veiculo2 =new Veiculo (null, "Cadeira", "74,00","Cadeira", "75,00");
		
		veiculoRepository.save(veiculo1);
		veiculoRepository.save(veiculo2);
		
		List<Veiculo> veiculoList =  veiculoRepository.findAll();
		
		assertNotNull(veiculoList);
		assertEquals(2,veiculoList.size());
		
	}
	
	@DisplayName("Testando GET by ID")
	@Test
	void testGetById() {
		Veiculo veiculo1 =new Veiculo (null, "Cadeira", "74,00","Cadeira", "75,00");
	
		
		veiculoRepository.save(veiculo1);
		
		Veiculo saveVeiculo = veiculoRepository.findById(veiculo1.getId()).get();
		

		assertNotNull(saveVeiculo);
		assertEquals(veiculo1.getId(), saveVeiculo.getId());
		
	}
	
	@DisplayName("Testando update")
	@Test
	void testUpdateVeiculo() {
		Veiculo veiculo1 =new Veiculo (null, "Cadeira", "74,00","Cadeira", "75,00");
	
		
		veiculoRepository.save(veiculo1);
		
		Veiculo saveVeiculo = veiculoRepository.findById(veiculo1.getId()).get();
		veiculo1.setMarca("Cadeira");
		veiculo1.setModelo("74,00");
		veiculo1.setAno("Cadeira");
		veiculo1.setCor("74,00");
		
		Veiculo updateVeiculo = veiculoRepository.save(saveVeiculo);
		

		assertNotNull(updateVeiculo);
		assertEquals("Cadeira", updateVeiculo.getMarca());
		assertEquals("74,00", updateVeiculo.getModelo());
		assertEquals("Cadeira", updateVeiculo.getAno());
		assertEquals("74,00", updateVeiculo.getCor());
		
	}
	
	@DisplayName("Testando delete")
	@Test
	void testDeleteVeiculo() {
		Veiculo veiculo1 =new Veiculo (null, "Cadeira", "74,00","244","err");
	
		
		veiculoRepository.save(veiculo1);
		
		veiculoRepository.deleteById(veiculo1.getId());
		
		Optional<Veiculo> veiculoOptional = veiculoRepository.findById(veiculo1.getId());

		assertTrue(veiculoOptional.isEmpty());
	}
	
}
