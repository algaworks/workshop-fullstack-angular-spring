package com.algaworks.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
