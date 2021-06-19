package com.crud.covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.crud.covid.model.Anamnesa;
import com.crud.covid.repository.AnamnesaRepository;

@Service
public class AnamnesaServiceImpl implements AnamnesaService {
    @Autowired
    private AnamnesaRepository anamnesaRepository;

    @Override
    public void saveAnamnesa(Anamnesa anamnesa){
        this.anamnesaRepository.save(anamnesa);
    }

    @Override
    public List<Anamnesa> getAllAnamnesa(){
        return this.anamnesaRepository.findAll();
    }

    @Override
    public long countAllAnamnesa(){
        return this.anamnesaRepository.count();
    }

    @Override
    public Anamnesa getAnamnesaById(long id){
        Optional<Anamnesa> optional = anamnesaRepository.findById(id);
        Anamnesa anamnesa = null;
        if(optional.isPresent()){
            anamnesa = optional.get();
        } else {
            throw new RuntimeException("Anamnesa tidak ditemukan dengan id : " + id);
        }
        return anamnesa;
    }

    @Override
    public void deleteAnamnesaById(long id){
        this.anamnesaRepository.deleteById(id);
    }
}
