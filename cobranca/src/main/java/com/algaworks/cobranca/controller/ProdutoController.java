package com.algaworks.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.repository.Produtos;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private Produtos produtos;
	
	@RequestMapping
	public ModelAndView index()
	{
		return new ModelAndView("Produtos/Pesquisa");
	}

}
