package com.crud.covid.web.dto;

public class UserRegistrationDto {
    private String nama, email, password;

    public UserRegistrationDto(){}

    public UserRegistrationDto(String nama, String email, String password)
    {
        super();
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public void setNama(String nama){this.nama = nama;}
    public void setEmail(String email){this.email = email;}
    public void setPassword(String password){this.password = password;}

    public String getNama(){return this.nama;}
    public String getEmail(){return this.email;}
    public String getPassword(){return this.password;}

}