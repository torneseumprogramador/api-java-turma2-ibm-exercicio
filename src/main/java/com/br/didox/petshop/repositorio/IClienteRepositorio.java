package com.br.didox.petshop.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.didox.petshop.models.Cliente;

@Repository
public interface IClienteRepositorio extends CrudRepository<Cliente, Integer> {
    
}
