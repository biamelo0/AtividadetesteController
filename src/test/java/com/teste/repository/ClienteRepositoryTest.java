package com.teste.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.teste.hospede.entity.Cliente;
import com.teste.hospede.repository.ClienteRepository;

@DataJpaTest
class ClienteRepositsoryTest {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@DisplayName("Testando o Save")
	@Test
	void testSalvarRepository() {
		Cliente cliente1 =new Cliente (null, "Cadeira", "75,00","Cadeira", "75,00");
		
		Cliente saveCliente = clienteRepository.save(cliente1);
		
		assertNotNull(saveCliente);
		assertTrue(saveCliente.getId() > 0);					
	}
	
	@DisplayName("Testando Get para todos clientes")
	@Test
	void testGetAllRepository() {
		Cliente cliente1 =new Cliente (null, "Cadeira", "74,00","Cadeira", "75,00");
		Cliente cliente2 =new Cliente (null, "Cadeira", "74,00","Cadeira", "75,00");
		
		clienteRepository.save(cliente1);
		clienteRepository.save(cliente2);
		
		List<Cliente> clienteList =  clienteRepository.findAll();
		
		assertNotNull(clienteList);
		assertEquals(2,clienteList.size());
		
	}
	
	@DisplayName("Testando GET by ID")
	@Test
	void testGetById() {
		Cliente cliente1 =new Cliente (null, "Cadeira", "74,00","Cadeira", "75,00");
	
		
		clienteRepository.save(cliente1);
		
		Cliente saveCliente = clienteRepository.findById(cliente1.getId()).get();
		

		assertNotNull(saveCliente);
		assertEquals(cliente1.getId(), saveCliente.getId());
		
	}
	
	@DisplayName("Testando update")
	@Test
	void testUpdateCliente() {
		Cliente cliente1 =new Cliente (null, "Cadeira", "74,00","Cadeira", "75,00");
	
		
		clienteRepository.save(cliente1);
		
		Cliente saveCliente = clienteRepository.findById(cliente1.getId()).get();
		cliente1.setNome("Cadeira");
		cliente1.setTelefone("74,00");
		cliente1.setCpf("Cadeira");
		cliente1.setRg("74,00");
		
		Cliente updateCliente = clienteRepository.save(saveCliente);
		

		assertNotNull(updateCliente);
		assertEquals("Cadeira", updateCliente.getNome());
		assertEquals("74,00", updateCliente.getTelefone());
		assertEquals("Cadeira", updateCliente.getCpf());
		assertEquals("74,00", updateCliente.getRg());
		
	}
	
	@DisplayName("Testando delete")
	@Test
	void testDeleteCliente() {
		Cliente cliente1 =new Cliente (null, "Cadeira", "74,00","244","err");
	
		
		clienteRepository.save(cliente1);
		
		clienteRepository.deleteById(cliente1.getId());
		
		Optional<Cliente> clienteOptional = clienteRepository.findById(cliente1.getId());

		assertTrue(clienteOptional.isEmpty());
	}
	
}

