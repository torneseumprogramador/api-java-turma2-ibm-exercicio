package com.br.didox.petshop.servicos;

import com.br.didox.petshop.dtos.OrdemServicoDto;
import com.br.didox.petshop.models.Animal;
import com.br.didox.petshop.models.Cliente;
import com.br.didox.petshop.models.OrdemServico;
import com.br.didox.petshop.repositorio.IOrdemServicoRepositorio;

public class OrdemServicoService {
    public static OrdemServico persiste(OrdemServico ordemServico, OrdemServicoDto ordemServicoDto, Cliente cliente, Animal animal, IOrdemServicoRepositorio ordemServicoRepo){
        ordemServico.setValor(ordemServicoDto.getValor());
        ordemServico.setEntrada(ordemServicoDto.getEntrada());
        ordemServico.setSaida(ordemServicoDto.getSaida());
        ordemServico.setAnimal(animal);
        ordemServico.setCliente(cliente);
        ordemServicoRepo.save(ordemServico);
        return ordemServico;
    }
}
