package br.com.cep.services;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import br.com.cep.model.Endereco;
import br.com.cep.services.repositorio.EnderecoRepositorio;


@Service
public class CepService {
	
	@Autowired
	EnderecoRepositorio enderecoRepositorio;
	
	
	public ViaCEPEndereco getCep(String cep) {
		
	    ViaCEPClient cliente = new ViaCEPClient();
	    try {
	      ViaCEPEndereco endereco = cliente.getEndereco(cep);
	      
	      return endereco;
	      
	    } catch (IOException e) {
	      e.printStackTrace();
	      
	      return null;
	    }
	      
	}
	
	public List<Endereco> getEndereco() {
		
		return enderecoRepositorio.findAll();
        
    }
	
//	public Endereco getEndereco(Long id) {
//		Optional<Endereco> result = enderecoRepositorio.findById(id);
//		
//		if(result.isPresent()) {
//			return result.get();
//		}
//        return null;
//    }
//	

	public Endereco postCep(Endereco endereco) {
		ViaCEPEndereco c = getCep(endereco.getCep());
		//endereco.setViaCEPEndereco(c);
		return enderecoRepositorio.save(endereco);
		//return null;
	}

}
