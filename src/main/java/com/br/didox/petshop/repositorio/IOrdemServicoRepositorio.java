package com.br.didox.petshop.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.didox.petshop.models.OrdemServico;

@Repository
public interface IOrdemServicoRepositorio extends CrudRepository<OrdemServico, Integer> {
    
}
