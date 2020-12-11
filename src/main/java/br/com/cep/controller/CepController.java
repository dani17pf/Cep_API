package br.com.cep.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import br.com.cep.model.Endereco;
import br.com.cep.services.CepService;



@RestController
@RequestMapping(value = { "/cep" })
public class CepController {
	
	@Autowired
	CepService cepService;
	
	
	@GetMapping(value = "{cep}")
	public ResponseEntity<ViaCEPEndereco> getCep(@PathVariable("cep") String cep) {

		return ResponseEntity.ok(cepService.getCep(cep));

	}
	
	@GetMapping
	public ResponseEntity<List<Endereco>> getEndereco() {

		return ResponseEntity.ok(cepService.getEndereco());

	}
	
	@PostMapping()
	public ResponseEntity<Endereco> postCep(@RequestBody Endereco endereco) {

		return ResponseEntity.ok(cepService.postCep(endereco));

	}
	

}
