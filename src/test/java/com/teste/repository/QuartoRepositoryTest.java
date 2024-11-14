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

import com.teste.hospede.entity.Quarto;
import com.teste.hospede.repository.QuartoRepository;

@DataJpaTest
class QuartoRepositoryTest {
	
	@Autowired
	private QuartoRepository quartoRepository;
	
	@DisplayName("Testando o Save")
	@Test
	void testSalvarRepository() {
		Quarto quarto1 =new Quarto (null, "219", "Solteiro");
		
		Quarto saveQuarto = quartoRepository.save(quarto1);
		
		assertNotNull(saveQuarto);
		assertTrue(saveQuarto.getId() > 0);					
	}
	
	@DisplayName("Testando Get para todos quartos")
	@Test
	void testGetAllRepository() {
		Quarto quarto1 =new Quarto (null, "219", "Solteiro");
		Quarto quarto2 =new Quarto (null, "23", "Casal");
		
		quartoRepository.save(quarto1);
		quartoRepository.save(quarto2);
		
		List<Quarto> quartoList =  quartoRepository.findAll();
		
		assertNotNull(quartoList);
		assertEquals(2,quartoList.size());
		
	}
	
	@DisplayName("Testando GET by ID")
	@Test
	void testGetById() {
		Quarto quarto1 =new Quarto (null, "219", "Solteiro");
	
		
		quartoRepository.save(quarto1);
		
		Quarto saveQuarto = quartoRepository.findById(quarto1.getId()).get();
		

		assertNotNull(saveQuarto);
		assertEquals(quarto1.getId(), saveQuarto.getId());
		
	}
	
	@DisplayName("Testando update")
	@Test
	void testUpdateQuarto() {
		Quarto quarto1 =new Quarto (null, "219", "Solteiro");
	
		
		quartoRepository.save(quarto1);
		
		Quarto saveQuarto = quartoRepository.findById(quarto1.getId()).get();
		quarto1.setNum("23");
		quarto1.setTipo("casal");
		
		Quarto updateQuarto = quartoRepository.save(saveQuarto);
		

		assertNotNull(updateQuarto);
		assertEquals("23", updateQuarto.getNum());
		assertEquals("casal", updateQuarto.getTipo());
		
	}
	
	@DisplayName("Testando delete")
	@Test
	void testDeleteQuarto() {
		Quarto quarto1 =new Quarto (null, "219", "Solteiro");
	
		
		quartoRepository.save(quarto1);
		
		quartoRepository.deleteById(quarto1.getId());
		
		Optional<Quarto> quartoOptional = quartoRepository.findById(quarto1.getId());

		assertTrue(quartoOptional.isEmpty());
	}
	
}