package mca.dmi.services;



import mca.dmi.module.Registrartion;
import mca.dmi.repositry.RegistrationRepositry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private RegistrationRepositry user;

  
}

