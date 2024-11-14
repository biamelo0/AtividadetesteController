package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HospedeTest {
	
	private Hospede hospede;
	
	@BeforeEach
	void setUp() {
		//Arrange
		hospede = new Hospede (1L, "Julia Maria", "julia@gmail.com", "(82)989222");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		hospede.setId(2L);
		//Assert
		assertEquals(2L,hospede.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		hospede.setNome("João Paulo");
		//Assert
		assertEquals("João Paulo",hospede.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo email")
	void testEmail() {
		//Act
		hospede.setEmail("João Paulo@gmail.com");
		//Assert
		assertEquals("João Paulo@gmail.com",hospede.getEmail());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testTelefone() {
		//Act
		hospede.setTelefone("(13)99734522");
		//Assert
		assertEquals("(13)99734522",hospede.getTelefone());
	}
	
	@Test
	@DisplayName ("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		Hospede novoHospede;
		//Act
		hospede = novoHospede = new Hospede (3L,"Matheus", "Matheus@gmail.com", "159967546");
		//assertAll
		assertAll("novoHospede",
				()-> assertEquals(3L,novoHospede.getId()),
				()-> assertEquals("Matheus",novoHospede.getNome()),
				()-> assertEquals("Matheus@gmail.com",novoHospede.getEmail()),
				()-> assertEquals("159967546",novoHospede.getTelefone()));
	}

}







