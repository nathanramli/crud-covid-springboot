package com.crud.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pasien")

public class Pasien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(name = "nik")
    public String nik;
    @Column(name = "nama")
    public String nama;

    public void setId(long id) {
        this.id = id;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getId() {
        return this.id;
    }

    public String getNik() {
        return this.nik;
    }

    public String getNama() {
        return this.nama;
    }
}
