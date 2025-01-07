package mca.dmi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mca.dmi.module.Registrartion;
import mca.dmi.repositry.RegistrationRepositry;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepositry repo;

    public String registerUser(Registrartion user) {
        if (repo.findByEmail(user.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already in use");
        }
        repo.save(user);
        return "Registration successful!";
    }
}

