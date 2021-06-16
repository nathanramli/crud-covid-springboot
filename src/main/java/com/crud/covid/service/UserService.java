package com.crud.covid.service;

import com.crud.covid.model.User;
import com.crud.covid.web.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
