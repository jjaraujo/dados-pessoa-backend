package com.dados.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dados.teste.domain.model.DadosPessoa;
import com.dados.teste.repository.DadosPessoasRepository;

@Controller
@RequestMapping("/pessoa")
public class PessoaServiceImpl {
	@Autowired DadosPessoasRepository dadosPessoasRepository;
	
	@RequestMapping(value = "/buscaTodosDadosPessoas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins = "http://localhost:3000")
	@ResponseBody
	public List<DadosPessoa> buscaTodosDadosPessoas(){
		return dadosPessoasRepository.findAll();
	}

	
}
