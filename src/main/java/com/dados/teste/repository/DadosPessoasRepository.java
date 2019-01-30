package com.dados.teste.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dados.teste.domain.model.DadosPessoa;

public interface DadosPessoasRepository extends MongoRepository<DadosPessoa, String> {

}
