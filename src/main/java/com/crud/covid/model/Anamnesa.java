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
@Table(name = "anamnesa")
public class Anamnesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(name = "nik")
    public String nik;
    @Column(name = "nama")
    public String nama;
    @Column(name = "no_rm")
    public String noRm;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "tanggal")
    public Date tanggal;
    @Column(name = "demam")
    public String demam;
    @Column(name = "batuk")
    public String batuk;
    @Column(name = "flu")
    public String flu;
    @Column(name = "anosmia")
    public String anosmia;
    @Column(name = "sesak_nafas")
    public String sesakNafas;

    public void setId(long id) {
        this.id = id;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoRm(String noRm) {
        this.noRm = noRm;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public void setDemam(String demam) {
        this.demam = demam;
    }

    public void setBatuk(String batuk) {
        this.batuk = batuk;
    }

    public void setFlu(String flu) {
        this.flu = flu;
    }

    public void setAnosmia(String anosmia) {
        this.anosmia = anosmia;
    }

    public void setSesakNafas(String sesakNafas) {
        this.sesakNafas = sesakNafas;
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

    public String getNoRm() {
        return noRm;
    }

    public Date getTanggal() {
        return this.tanggal;
    }

    public String getDemam() {
        return demam;
    }

    public String getBatuk() {
        return batuk;
    }

    public String getFlu() {
        return flu;
    }

    public String getAnosmia() {
        return anosmia;
    }

    public String getSesakNafas() {
        return sesakNafas;
    }
}
