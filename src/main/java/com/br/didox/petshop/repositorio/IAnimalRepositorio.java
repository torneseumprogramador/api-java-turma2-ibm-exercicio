package com.br.didox.petshop.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.didox.petshop.models.Animal;

@Repository
public interface IAnimalRepositorio extends CrudRepository<Animal, Integer> {
    
}
