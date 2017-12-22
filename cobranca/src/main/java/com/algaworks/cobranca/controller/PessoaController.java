package com.algaworks.cobranca.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.Sexo;
import com.algaworks.cobranca.repository.Pessoas;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private Pessoas pessoas;
	
	@RequestMapping
	public ModelAndView index()
	{
		return new ModelAndView("PesquisaPessoas");
	}
	
	public List<Sexo> todosSexo()
	{
		return Arrays.asList(Sexo.values());
	}

}
