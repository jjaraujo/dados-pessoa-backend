package com.dados.teste.domain.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.dados.teste.domain.payload.Divida;
import com.dados.teste.domain.payload.Endereco;

@Document(collection = "dados")
public class DadosPessoa {
	
	public String id;
	public long cpf;
	public String nome;
	public String dtNascimento;
	public Endereco endereco; 
	public List<Divida> dividas;
	
}
