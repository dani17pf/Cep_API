package br.com.cep.services.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cep.model.Endereco;


@Repository
public interface EnderecoRepositorio extends JpaRepository<Endereco, Long> {

	
	
}
