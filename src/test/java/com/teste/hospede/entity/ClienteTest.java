package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
	private Cliente cliente;

	
	@BeforeEach
	void setUp() {
		//Arrange
		cliente = new Cliente (1L, "Carla", "159989-3423", "124.535.353-35","1234743");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		cliente.setId(2L);
		//Assert
		assertEquals(2L,cliente.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		cliente.setNome("Carla");
		//Assert
		assertEquals("Carla",cliente.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testTelefone() {
		//Act
		cliente.setTelefone("159989-3423");
		//Assert
		assertEquals("159989-3423",cliente.getTelefone());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo cpf")
	void testCpf() {
		//Act
		cliente.setCpf("124.535.353-35");
		//Assert
		assertEquals("124.535.353-35",cliente.getCpf());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo preco")
	void testRg() {
		//Act
		cliente.setRg("Casal");
		//Assert
	assertEquals("Casal",cliente.getRg());
	}
	
	
	@Test
	@DisplayName ("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		Cliente novoCliente;
		//Act
		cliente = novoCliente = new Cliente (3L,"Carlos", "24.535.353-35", "24.535.353-35", "24.535.353-35");
		//assertAll
		assertAll("novoProduto",
				()-> assertEquals(3L,novoCliente.getId()),
				()-> assertEquals("Carlos",novoCliente.getNome()),
				()-> assertEquals("24.535.353-35",novoCliente.getTelefone()),
				()-> assertEquals("24.535.353-35",novoCliente.getNome()),
				()-> assertEquals("24.535.353-35",novoCliente.getTelefone()));
	}


}
