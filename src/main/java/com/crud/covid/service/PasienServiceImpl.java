package com.crud.covid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.crud.covid.model.Pasien;
import com.crud.covid.repository.PasienRepository;

@Service
public class PasienServiceImpl implements PasienService {
    @Autowired
    private PasienRepository pasienRepository;

    @Override
    public void savePasien(Pasien pasien){
        this.pasienRepository.save(pasien);
    }

    @Override
    public List<Pasien> getAllPasien(){
        return this.pasienRepository.findAll();
    }

    @Override
    public Pasien getPasienById(long id){
        Optional<Pasien> optional = pasienRepository.findById(id);
        Pasien pasien = null;
        if(optional.isPresent()){
            pasien = optional.get();
        } else {
            throw new RuntimeException("Pasien tidak ditemukan dengan id : " + id);
        }
        return pasien;
    }

    @Override
    public long countAllPasien(){
        return pasienRepository.count();
    }

    @Override
    public void deletePasienById(long id){
        this.pasienRepository.deleteById(id);
    }
}
