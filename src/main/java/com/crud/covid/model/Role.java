package com.crud.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "name")
    public String name;

    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}

    public int getId(){return this.id;}
    public String getName(){return this.name;}

    public Role(){}
    public Role(String name){this.name = name;}
}
