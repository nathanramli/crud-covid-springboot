package com.crud.covid.service;

import java.util.List;

import com.crud.covid.model.Anamnesa;

public interface AnamnesaService {
    List<Anamnesa> getAllAnamnesa();
    long countAllAnamnesa();
    void saveAnamnesa(Anamnesa anamnesa);
    Anamnesa getAnamnesaById(long id);
    void deleteAnamnesaById(long id);
}
