package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VeiculoTest {

private Veiculo veiculo;
	
	@BeforeEach
	void setUp() {
		//Arrange
		veiculo = new Veiculo (1L, "Fiat", "Uno", "2024", "Preto");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		veiculo.setId(2L);
		//Assert
		assertEquals(2L,veiculo.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo marca")
	void testMarca() {
		//Act
		veiculo.setMarca("Fiat");
		//Assert
		assertEquals("Fiat",veiculo.getMarca());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo modelo")
	void testModelo() {
		//Act
		veiculo.setModelo("Uno");
		//Assert
	assertEquals("Uno",veiculo.getModelo());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo ano")
	void testAno() {
		//Act
		veiculo.setAno("2024");
		//Assert
	assertEquals("2024",veiculo.getAno());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo cor")
	void testCor() {
		//Act
		veiculo.setModelo("Preto");
		//Assert
	assertEquals("Preto",veiculo.getCor());
	}
	
	
	@Test
	@DisplayName ("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		Veiculo novoVeiculo;
		//Act
		veiculo = novoVeiculo = new Veiculo (3L,"Fiat", "Uno", "2024", "Preto");
		//assertAll
		assertAll("novoProduto",
				()-> assertEquals(3L,novoVeiculo.getId()),
				()-> assertEquals("Fiat",novoVeiculo.getMarca()),
				()-> assertEquals("Uno",novoVeiculo.getModelo()),
				()-> assertEquals("2024",novoVeiculo.getAno()),
				()-> assertEquals("Preto",novoVeiculo.getCor()));
	}

}
