package com.crud.covid.service;

import java.util.List;
import com.crud.covid.model.Pasien;


public interface PasienService {
    List<Pasien> getAllPasien();
    void savePasien(Pasien pasien);
    Pasien getPasienById(long id);
    void deletePasienById(long id);
}
