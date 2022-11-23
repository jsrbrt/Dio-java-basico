package one.digitalinnovation.gof.service.impl;


import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author falvojr
 */
@Service
public class ClienteServiceImpl implements ClienteService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	
	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Cliente> buscarTodos() {
		// Buscar todos os Clientes.
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// Buscar Cliente por ID.
		/*for (Cliente cliente: buscarTodos()) {
			Long id1 = cliente.getId();
			if (id.equals(id1)) return cliente;
		}
		System.out.println("Cliente não existe");*/

		Optional<Cliente> cliente = clienteRepository.findById(id);
		//boolean b = clienteRepository.existsById(id);
		try {
			if (cliente.isEmpty()) throw new NoSuchElementException();
			return cliente.get();
		}
		catch (NoSuchElementException e){
			System.out.println("Cliente não existe.");
			return new Cliente();
		}
	}

	@Override
	public void inserir(Cliente cliente) {
		//Verificar se o endereco do cliente ja existe(pelo Cep)
		//Caso não, integrar com o ViaCEP e persistir o retorno
		//Inserir cliente, vinculando o endereco(NOVO OU EXISTENTE)
		/*for (Cliente cliente1: buscarTodos()) {
			String cep2 = cliente1.getEndereco().getCep();
			if (!cep1.equals(cep2)){
				Endereco novoEndereco = viaCepService.consultarCep(cep1);
				enderecoRepository.save(novoEndereco);
			}
		}*/
		String cep1 = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep1).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep1);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// Buscar Cliente por ID, caso exista:
		//Verificar se o endereco do cliente ja existe(pelo Cep)
		//Caso não, integrar com o ViaCEP e persistir o retorno
		//Inserir cliente, vinculando o endereco(NOVO OU EXISTENTE)
		Optional<Cliente> clienteDatabase = clienteRepository.findById(id);
		if(clienteDatabase.isPresent()) inserir(cliente);
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}

}
