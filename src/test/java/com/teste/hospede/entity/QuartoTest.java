package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuartoTest {

private Quarto quarto;
	
	@BeforeEach
	void setUp() {
		//Arrange
		quarto = new Quarto (1L, "23", "Lua de mel");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		quarto.setId(2L);
		//Assert
		assertEquals(2L,quarto.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo numero")
	void testNum() {
		//Act
		quarto.setNum("12");
		//Assert
		assertEquals("12",quarto.getNum());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo tipo")
	void testTipo() {
		//Act
		quarto.setTipo("Casal");
		//Assert
	assertEquals("Casal",quarto.getTipo());
	}
	
	
	@Test
	@DisplayName ("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		Quarto novoQuarto;
		//Act
		quarto = novoQuarto = new Quarto (3L,"13", "Suite");
		//assertAll
		assertAll("novoQuarto",
				()-> assertEquals(3L,novoQuarto.getId()),
				()-> assertEquals("67",novoQuarto.getNum()),
				()-> assertEquals("Suite",novoQuarto.getTipo()));
	}

}
