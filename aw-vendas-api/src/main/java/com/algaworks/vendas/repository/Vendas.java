package com.algaworks.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
