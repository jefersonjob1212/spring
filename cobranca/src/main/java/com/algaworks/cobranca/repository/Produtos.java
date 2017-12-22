package com.algaworks.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.cobranca.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
