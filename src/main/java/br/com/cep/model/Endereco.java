package br.com.cep.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;


@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String telefone;
	private String cep;
	//private ViaCEPEndereco viaCEPEndereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

//	public ViaCEPEndereco getViaCEPEndereco() {
//		return viaCEPEndereco;
//	}
//
//	public void setViaCEPEndereco(ViaCEPEndereco viaCEPEndereco) {
//		this.viaCEPEndereco = viaCEPEndereco;
//	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	

}
