package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProdutoTest {



private Produto produto;
	
	@BeforeEach
	void setUp() {
		//Arrange
		produto = new Produto (1L, "Cadeira", "200,00");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		produto.setId(2L);
		//Assert
		assertEquals(2L,produto.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNum() {
		//Act
		produto.setNome("Cadeira");
		//Assert
		assertEquals("Cadeira",produto.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo preco")
	void testTipo() {
		//Act
		produto.setPreco("Casal");
		//Assert
	assertEquals("Casal",produto.getPreco());
	}
	
	
	@Test
	@DisplayName ("Testando o construtor com todos os argumentos")
	void testeConstrutorAll() {
		Produto novoProduto;
		//Act
		produto = novoProduto = new Produto (3L,"Cadeira", "200,00");
		//assertAll
		assertAll("novoProduto",
				()-> assertEquals(3L,novoProduto.getId()),
				()-> assertEquals("Cadeira",novoProduto.getNome()),
				()-> assertEquals("",novoProduto.getPreco()));
	}


}
