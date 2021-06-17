package com.crud.covid.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "tanggal_lahir")
    public Date tanggalLahir;
    @Column(name = "jenis_kelamin")
    public String jenis_kelamin;
    @Column(name = "alamat")
    public String alamat;

    public void setId(long id) {
        this.id = id;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJenisKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
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

    public Date getTanggalLahir() {
        return this.tanggalLahir;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public String getJenisKelamin() {
        return this.jenis_kelamin;
    }
}
