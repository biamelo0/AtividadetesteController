package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentoTest {
	
private Medicamento medicamento;
	
	@BeforeEach
	void setUp() {
		//Arrange
		medicamento = new Medicamento(1L, "Advil", "tira dores", "12/09");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		medicamento.setId(2L);
		//Assert
		assertEquals(2L,medicamento.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		medicamento.setNome("Rivotril");
		//Assert
		assertEquals("Rivotril",medicamento.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testBula() {
		//Act
		medicamento.setBula("acalmante");
		//Assert
		assertEquals("acalmante",medicamento.getBula());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo data")
	void testData() {
		//Act
		medicamento.setData("10/12");
		//Assert
		assertEquals("10/12",medicamento.getData());
	}
	
	@Test
	@DisplayName ("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		Medicamento novoMedicamento;
		//Act
		medicamento = novoMedicamento = new Medicamento (3L,"Dipirona", "tira dores", "09/08");
		//assertAll
		assertAll("novoMedicamento",
				()-> assertEquals(3L,novoMedicamento.getId()),
				()-> assertEquals("Dipirona",novoMedicamento.getNome()),
				()-> assertEquals("tira dores",novoMedicamento.getBula()),
				()-> assertEquals("09/08",novoMedicamento.getData()));
	}



}
