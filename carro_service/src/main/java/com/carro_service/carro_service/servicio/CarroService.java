package com.carro_service.carro_service.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro_service.carro_service.entidades.Carro;
import com.carro_service.carro_service.repositorio.CarroRepository;

@Service
public class CarroService {
    
    @Autowired
    private CarroRepository carroRepository;

    
    public List<Carro> getAll(){
        return carroRepository.findAll();
    }

    public Carro getCarroById(int id){
        return carroRepository.findById(id).orElse(null);
    }

    public Carro save(Carro carro){
        Carro nuevoCarro = carroRepository.save(carro);
        return nuevoCarro;
    }

    public List<Carro> byUsuarioId(int usuarioId){
        return carroRepository.findByUsuarioId(usuarioId);
    }
}
