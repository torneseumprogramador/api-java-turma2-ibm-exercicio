package com.br.didox.petshop.servicos;

import com.br.didox.petshop.dtos.AnimalDto;
import com.br.didox.petshop.models.Animal;
import com.br.didox.petshop.models.Cliente;
import com.br.didox.petshop.repositorio.IAnimalRepositorio;

public class AnimaisServico {
    public static Animal persiste(Animal animal, AnimalDto animalDto, Cliente cliente, IAnimalRepositorio animalRepo){
        animal.setNome(animalDto.getNome());
        animal.setIdade(animalDto.getIdade());
        animal.setPeso(animalDto.getPeso());
        animal.setCliente(cliente);
        animalRepo.save(animal);
        return animal;
    }
}
