package com.teste.hospede.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReservaTest {

	private Reserva reserva;
	private Hospede hospede;
	private Quarto quarto;
	
	@BeforeEach
	public void setUp() {
		//Arrange
		reserva = new Reserva (1L, quarto, hospede, LocalDate.of(2024, 9, 1), LocalDate.of(2024,  9, 10));
		
	}
	
	@Test 
	public void testId() {
		reserva.setId(2L);
		
		assertEquals(2L,reserva.getId(),"O ID deve ser igual ao valor atribuido");
	}
	
	@Test
	public void testHospede() {
		reserva.setHospede(hospede);
		
		assertEquals(hospede, reserva.getHospede(), "O hospede deve ser igual ao valor atribuido");
	}

}
