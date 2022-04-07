package com.example.projetoplanosaude.repository;

import com.example.projetoplanosaude.planosaude.domain.Pessoa;

import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    
}
